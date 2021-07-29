package one.digitalinnovation.avancado.javafuncional.aula3;

public class ThreadExemplo {
    public static void main(String[] args) {
        Thread thread = new Thread(new BarraDeCarregamento2());
        Thread thread1 = new Thread(new BarraDeCarregamento3()) ;

        thread.start(); // este executa por ultimo
        thread1.start(); // este executa ante-penultimo

        System.out.println("Nome da thread : " + thread.getName());// estes executam primeiro
        System.out.println("Nome da thread : " + thread1.getName());// estes executam primeiro
    }
}

class GerarPDF implements Runnable {

    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable {

    @Override
    public void run() {
        System.out.println("Loading ...");
    }
}

class BarraDeCarregamento2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("rode1 barraDeCarregamento2 : ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BarraDeCarregamento3 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("rode1 barraDeCarregamento3 : ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
