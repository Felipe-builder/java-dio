package one.digitalinnovation.avancado.javafuncional.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBTRACAO = (a, b) -> a - b;
        Calculo DIVISAO = (a, b) -> a / b;
        Calculo MULTI = (a, b) -> a * b;
        System.out.println(executarOperacao(SOMA, 5, 8)); //função alta-ordem
        System.out.println(executarOperacao(SUBTRACAO, 5, 8)); //função alta-ordem
        System.out.println(executarOperacao(DIVISAO, 5, 8)); //função alta-ordem
        System.out.println(executarOperacao(MULTI, 5, 8)); //função alta-ordem
        System.out.println(SOMA.calcular(5, 8));
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}
