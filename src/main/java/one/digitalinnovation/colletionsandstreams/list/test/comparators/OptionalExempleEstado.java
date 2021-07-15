package one.digitalinnovation.colletionsandstreams.list.test.comparators;

import java.util.Optional;

public class OptionalExempleEstado {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor Presente");

        System.out.println("O valor está presente? ");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("O valor está nulo? ");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não está presente"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("O valor está nulo");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = Não está presente"));

//        Optional<String> optionalNullError = Optional.of(null);
//        System.out.println("O valor está nulo");
//        optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("Null ERRO= Não está presente"));


    }
}
