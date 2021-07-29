package one.digitalinnovation.colletionsandstreams.list.test.stream;

import one.digitalinnovation.colletionsandstreams.list.test.comparators.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStream {
    public static void main(String[] args) {
        // Crio uma lista de estudantes
        List<Estudante> estudantes = new ArrayList<>();

        // Adiciona os elementos a lista
        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Brenda", 15));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 16));
        estudantes.add(new Estudante("Bruno", 22));
        estudantes.add(new Estudante("Carmem", 29));
        estudantes.add(new Estudante("Josias", 31));
        estudantes.add(new Estudante("Emanuela", 17));

        // converte todos elementos de forma correta em uma String e imprime
        String nomes = estudantes.stream().map(estudante -> estudante.toString()).collect(Collectors.joining(", "));
        System.out.println(nomes);

        //Quantidade de estutante na coleção
        System.out.println("Quantidade de estudante: " + estudantes.stream().count());

        //Estudantes acima de 18 anos
        System.out.println("Maiores de 18 anos: ");
        estudantes.stream()
                .filter(estudante -> estudante.getIdade() >= 18).forEach(System.out::println);

        // Retornando os estudantes que possui a letra B
        System.out.println("estudantes que possuem a letra B: " + estudantes.stream()
                .filter(estudante -> estudante.getNome().toLowerCase().contains("w")).collect(Collectors.toList()));

        // Retornando se existe pelo menos um estudante com a letra D no nome
        System.out.println("Possui pelo menos um estudante com a letra D? " + estudantes
                .stream().anyMatch(estudante -> estudante.getNome().toLowerCase().contains("d")));

        // Retornando o estudante mais velho e o mais novo
        System.out.println("Estudante mais velho: " + estudantes.stream().max(Estudante::compareTo));
        System.out.println("Estudante mais novo: " + estudantes.stream().min(Estudante::compareTo));



    }
}
