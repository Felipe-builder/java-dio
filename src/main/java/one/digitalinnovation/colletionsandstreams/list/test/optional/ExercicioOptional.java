package one.digitalinnovation.colletionsandstreams.list.test.optional;

import java.util.Optional;

public class ExercicioOptional {
    public static void main(String[] args) {
        //cria um optional com estado vazio, presente ou null
        Optional<String> optionalStringOfNullable = Optional.ofNullable("Cheio");


        optionalStringOfNullable.ifPresent(System.out::println);
        optionalStringOfNullable.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));
        optionalStringOfNullable.orElseThrow(IllegalStateException::new);

        optionalStringOfNullable.map((valor)-> valor.concat(" - do JAVA!")) .ifPresent(System.out::println);
        if (optionalStringOfNullable.isPresent()){
            String mensagem = optionalStringOfNullable.map((valor1) -> valor1.concat(" - do JAVA 1.8"))
                    .filter(s -> s.contains("JAVA")).get();
            System.out.println(mensagem);

        }


    }
}
