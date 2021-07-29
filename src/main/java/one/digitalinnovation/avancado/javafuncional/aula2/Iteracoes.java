package one.digitalinnovation.avancado.javafuncional.aula2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes =  {"João", "João", "Pedro", "Paulo", "Natanael", "Davi", "José"};
        Integer[] numeros = {1,2,3,4,5,6};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirODobroDeCadaItemLista(numeros);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        StringBuilder nomesParaImprimir = new StringBuilder();
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("João")) {
                nomesParaImprimir.append(nomes[i]);
            }
        }
        System.out.println("Opção FOR: " + nomesParaImprimir);

        String nomesParaImprimirStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining());

        System.out.println("Opção STREAM: " + nomesParaImprimirStream);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirTodosNomes(String... nomes) {
        for (String nome: nomes) {
            System.out.println(nome);
        }
        System.out.println("____________");
        Stream.of(nomes)
                .forEach(System.out::println);
    }

    public static void imprimirODobroDeCadaItemLista(Integer... numeros) {
        for (Integer numero: numeros) {
            System.out.println(numero * 2);
        }
        System.out.println("---------------------");
        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
