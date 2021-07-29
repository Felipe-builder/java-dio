package one.digitalinnovation.avancado.javafuncional.aula1;

import java.util.function.BiPredicate;

public class FuncoesPura {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificaSeMaior =
                (parametro, valorParametro) -> parametro > valorParametro;

        System.out.println(verificaSeMaior.test(13, 12));
        System.out.println(verificaSeMaior.test(13, 12));
        System.out.println("Inverteu");
        System.out.println(verificaSeMaior.test(12, 13));
        System.out.println(verificaSeMaior.test(12, 13));
    }
}
