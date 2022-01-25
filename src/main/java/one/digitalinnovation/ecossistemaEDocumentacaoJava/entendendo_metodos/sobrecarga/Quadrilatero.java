package one.digitalinnovation.ecossistemaEDocumentacaoJava.entendendo_metodos.sobrecarga;

public class Quadrilatero {
    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularArea(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) / 2) * altura;
    }

    public static double calcularArea(float diagonal1, float diagonal2) {
        return (diagonal1 + diagonal2) / 2;
    }
}
