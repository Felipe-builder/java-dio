package one.digitalinnovation.avancado.javafuncional.aula3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureExemple {
    public static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAfazeresDeCasa().forEach(atividade -> pessoasParaExecutarAtividade
                .execute(() -> {
                    try {
                        atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }));
        pessoasParaExecutarAtividade.shutdown();
    }
}

class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDeCasa() {
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

interface Atividade {
    void realizar() throws InterruptedException;
}

abstract class Comodo {
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private void arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Arrumar guarda-roupa");
    }

    private void varrerOQuarto() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Varrer o quarto");
    }

    private void arrumarACama() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Arrumar a cama");
    }
}
