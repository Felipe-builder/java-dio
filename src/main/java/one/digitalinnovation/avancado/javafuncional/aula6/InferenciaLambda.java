package one.digitalinnovation.avancado.javafuncional.aula6;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        Function<Integer, Double> divisaoPorDois = (var numero) -> numero / 2.0;
        Function<Integer, Double> divisaoPorDois1 = (numero) -> numero / 2.0;

        System.out.println(divisaoPorDois.apply(21));
        System.out.println(divisaoPorDois1.apply(21));
    }
}
