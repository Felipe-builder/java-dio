package one.digitalinnovation.avancado.javafuncional.aula5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
        printNomeCompleto("João", "Santos"); //var não pode ser utilizado como paramêtro
        // O var somente serve em variáveis locais, portanto não se usa em nível de classe
        printSoma(5,5,5);

    }

    private static void connectionAndPrintURLJavaOracle() throws IOException {
        URL url = new URL("https://docs.oracle.com/javase/8/docs/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    private static void connectionAndPrintURLJavaOracleInferencia() throws IOException {
        var url1 = new URL("https://docs.oracle.com/javase/8/docs/");
        var urlConnection1 = url1.openConnection();

        try(var bufferedReader1 = new BufferedReader(new InputStreamReader(urlConnection1.getInputStream()))) {
            System.out.println(bufferedReader1.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        }

    }

    public static void printNomeCompleto(String nome/*'var nome' dá erro*/, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
        var nome1 = "LUCAS";
        System.out.println(nome1);
    }

    public static void printSoma(int... numeros) {
        var soma = 0;
        if (numeros.length > 0) {
            for (int numero : numeros) {
                soma += numero;
            }
        }

        System.out.println("A soma é " + soma);
    }


    //CONSEGUE
    //  variáveis local inicializadas
    //  variavel suporte do enhaced for
    //  variavel suporte do for iterativo

    //NÃO CONSEGUE
    //  O var não pode ser utilizada em nível de classe
    //  O var não pode ser utilizado como paramêtro
    //  O var não pode ser utilizadas em variáveis locais não inicializadas
}
