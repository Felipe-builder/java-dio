package one.digitalinnovation.avancado.javafuncional.aula6;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ClienteHttpExemplo {

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova Tread criada :: " + (thread.isDaemon() ? "daemon" : "") + " Tread Group :: " + thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws Exception {
//        connectAkamaihttp2Client();
        connectAkamaihttp11Client();
    }

    private static void connectAkamaihttp11Client() throws Exception{
        System.out.println("Running HTTP/1.1 example ...");
        try {
            HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Hearders: " + response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("http://http2.akamai.com" + image))
                                    .build();

                            try {
                                HttpResponse<String> imgResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem carregada: " + image + ", status code: " + imgResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de error durante requisição para recuperar imagem" + image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submitido um futuro para imagem: "+ image);
                    });
            future.forEach(f ->{
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Erro ao esperar carregar imagem do futuro");
                }
            });
            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total: " + (end - start) + " ms");
        } finally {
            executor.shutdown();
        }
    }

    private static void connectAkamaihttp2Client() throws Exception{
        System.out.println("Running HTTP/2 example ...");
        try {
            HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Hearders: " + response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("http://http2.akamai.com" + image))
                                    .build();

                            try {
                                HttpResponse<String> imgResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem carregada: " + image + ", status code: " + imgResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de error durante requisição para recuperar imagem" + image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submitido um futuro para imagem: "+ image);
                    });
            future.forEach(f ->{
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Erro ao esperar carregar imagem do futuro");
                }
            });
            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total: " + (end - start) + " ms");
        } finally {
            executor.shutdown();
        }
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/en/java/javase/11/docs/api/index.html"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code : " + response.statusCode());
        System.out.println("Headers response: " + response.headers());
        System.out.println(response.body());
    }
}
