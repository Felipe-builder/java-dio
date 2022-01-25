package one.digitalinnovation.ecossistemaEDocumentacaoJava.entendendo_metodos.sobrecarga;

public class Main {
    public static void main(String[] args) {

        System.out.println("RESULTADOS: ");

        double areaQuadrado = Quadrilatero.calcularArea(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.calcularArea(5d, 3d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areTrapezio = Quadrilatero.calcularArea(5, 7, 4);
        System.out.println("Área do Trapézio " + areTrapezio);

        double areaLosango = Quadrilatero.calcularArea(5f, 3f);
        System.out.println("Área do Losango: " + areaLosango);
    }
}
