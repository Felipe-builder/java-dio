package one.digitalinnovation.colletionsandstreams.list.test.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        // Cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();

        // Adiciona estudantes a coleção
        estudantes.add("Isacc");
        estudantes.add("Loreval");
        estudantes.add("Marta");
        estudantes.add("Galiel");
        estudantes.add("Joana");
        estudantes.add("Friedrich");
        estudantes.add("Izabel");

        // Retorna a contagem de elementos da strem
        System.out.println("Contagem: " + estudantes.stream().count());

        // Retorna o elemento com maior número de letras
        System.out.println("Maior número de letras: " + estudantes.stream()
                .max(Comparator.comparingInt(String::length)));

        // Retorna o lemento com menor número de letras
        System.out.println("Menor número de letras: " + estudantes.stream()
                .min(Comparator.comparingInt(String::length)));

        // Retorna os elementos que tem a letra R no nome
        System.out.println("Com letra R no nome: " + estudantes.stream()
                .filter((valor) -> valor.toLowerCase().contains("r")).collect(Collectors.toList()));

        // Retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("Retorna uma nova coleção com a quantiade de letras: " + estudantes.stream()
                .map((nome) -> nome.concat(" - ").concat(String.valueOf(nome.length())))
                .collect(Collectors.toList()));

        // Retorna o 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos da coleção: " + estudantes.stream().limit(3)
                .collect(Collectors.toList()));

        // Exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: " + estudantes.stream()
                .peek(System.out::println).collect(Collectors.toList()));

        // Exibe cada elemtento no console sem retornar outra coleção
        System.out.println("Mostra os elementos sem retornar a coleção: " );
        estudantes.stream().forEach(System.out::println);

        // Retorna true se todos os elementos possuem a letra 'A'
        System.out.println("Todos os elementos possuem 'A' em minúscula? " + estudantes.stream()
                .allMatch((estudante) -> (estudante.toLowerCase().contains("a"))));

        // Retorna true se algum dos elementos possuem a letra 'A'
        System.out.println("Algum dos elementos possue a letra 'A'? " + estudantes
                .stream().anyMatch((estudante) -> estudante.toLowerCase().contains("a")));

        // Retorna true se nenhum elemento possuir a letra 'A'
        System.out.println("Não tem nenhum elemento com a letra 'A'? " + estudantes
                .stream().noneMatch((estudante) -> estudante.toLowerCase().contains("a")));

        // Retorna o primeiro elemento da coleção, se existir e exibe no console
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Operação Encadeada
        System.out.println("Operação Encadeada");
        System.out.println(estudantes.stream().peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("a"))
//                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1))));
    }
}
