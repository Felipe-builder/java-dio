package one.digitalinnovation.colletionsandstreams.list.test.comparators;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        System.out.println("Valor inteiro opcional");
        OptionalInt.of(12).ifPresent(System.out::println);
        OptionalInt.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        System.out.println("Valor inteiro opcional");
        OptionalDouble.of(42.2).ifPresent(System.out::println);
        OptionalDouble.empty().ifPresentOrElse(System.out::println, () -> System.out.println("está vazio"));

        System.out.println("Valor inteiro opcional");
        OptionalLong.of(100L).ifPresent(System.out::println);
        OptionalLong.empty().ifPresentOrElse(System.out::println, () -> System.out.println("está vazio"));
    }
}
