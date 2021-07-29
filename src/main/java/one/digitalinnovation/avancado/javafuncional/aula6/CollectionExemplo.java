package one.digitalinnovation.avancado.javafuncional.aula6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionExemplo {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "Henrique", "Isaias");
        Collection<String> nomes1 = Arrays.asList("João", "Maria", "Henrique", "Isaias");
        Collection<String> nomes2 = List.of("João", "Maria", "Henrique", "Isaias");
        Collection<String> nomes3 = Set.of("João", "Maria", "Henrique", "Isaias");
        System.out.println(nomes);
        System.out.println(nomes1);
        System.out.println(nomes2);
        System.out.println(nomes3);
    }
}
