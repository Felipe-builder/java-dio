package one.digitalinnovation.avancado.javafuncional.aula3;

public class ThreadExemplo1 {
    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPDF = new GeradorPDF();
        BarraDeCarregamento1 inicarBarraDeCarregamento = new BarraDeCarregamento1(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        inicarBarraDeCarregamento.start();
    }
}

class GeradorPDF extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciar Geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

class BarraDeCarregamento1 extends Thread {
    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento1(Thread iniciarGeradorPDF) {
        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                if (!iniciarGeradorPDF.isAlive()) {
                    break;
                }
                System.out.println("Loading ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

