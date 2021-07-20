package one.digitalinnovation.avancado.javafuncional.aula3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo1 {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa1 casa1 = new Casa1(new Quarto1());
        List<Future<String>> futuros =
        new CopyOnWriteArrayList<>(casa1.obterAtividadeDaCasa().stream()
                .map(atividade -> threadPool.submit(() -> {
                        try {
                            return atividade.realizar();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return null;
                    })
                )
                .collect(Collectors.toList()));

        while (true) {
            int numeroDeAtividadesNaoFinalizadas = 0;
            for (Future<?> future: futuros) {
                if (future.isDone()){
                    try {
                        System.out.println("Parabéns você terminou de " + future.get());
                        futuros.remove(future);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numeroDeAtividadesNaoFinalizadas++;
                }
            }
            if (futuros.stream().allMatch(Future::isDone)) {
                break;
            }
            System.out.println("Numero de Atividades não finalizadas: " + numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
        threadPool.shutdown();
    }
}

class Casa1 {
    private List<Comodo1> comodos;

    Casa1(Comodo1... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade1> obterAtividadeDaCasa() {
        return this.comodos.stream().map(Comodo1::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade1>(), (pivo, atividade) -> {
                    pivo.addAll(atividade);
                    return pivo;
                });
    }
}

interface Atividade1 {
    String realizar() throws InterruptedException;
}

abstract class Comodo1 {
    abstract List<Atividade1> obterAfazeresDoComodo();
}

class Quarto1 extends Comodo1 {

    @Override
    List<Atividade1> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        String string = "Arrumar o guarda-roupa";
        System.out.println("Arrumar o guarda-roupa");
        return string;
    }

    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(5000);
        String s = "Varrer o quarto";
        System.out.println("Varrer o quarto");
        return s;
    }

    private String arrumarACama() throws InterruptedException {
        Thread.sleep(5000);
        String s = "Arrumar a cama";
        System.out.println("Arrumar a cama");
        return s;
    }
}
