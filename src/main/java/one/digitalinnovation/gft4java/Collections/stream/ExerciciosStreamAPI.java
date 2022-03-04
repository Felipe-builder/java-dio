package one.digitalinnovation.gft4java.Collections.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de String");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforma esta lista em uma lista de números inteiros");
        List<Integer> listNumber = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        listNumber.forEach(System.out::println);

        List<Integer> listNumber1 = new ArrayList<>(listNumber);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Mostre a média dos números");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares");
        listNumber.removeIf(i -> i % 2 != 0);
        System.out.println(listNumber);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("Retirando os números repetidos da lista, quantos números ficam? ");
        long quantidadeNumerosUnicos = listNumber.stream()
                .distinct()
                .count();
        System.out.println(quantidadeNumerosUnicos);
        System.out.println(listNumber);

        System.out.println("O menor valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);

        System.out.println("O maior valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        System.out.println("Pegue apenas os númeors ímpares e some: ");
        int sum = listNumber.stream()
                .filter(n -> (n % 2 != 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        System.out.println("Mostre a lista na ordem númerica: ");
        numerosAleatorios.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

        System.out.println("Agrupe os valores impares multiplos de 3 ou de 5: ");
        Map<Boolean, List<Integer>> collect = listNumber1.stream()
                .collect(Collectors.groupingBy(n -> (n % 3 == 0 || n % 5 == 0)));
        System.out.println(collect);
    }
}
