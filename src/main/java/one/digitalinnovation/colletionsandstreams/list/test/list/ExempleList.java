package one.digitalinnovation.colletionsandstreams.list.test.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExempleList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("Joao");


        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        nomes.add(2, "Lozir");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        int position = nomes.indexOf("Carlos");
        System.out.println("index of Carlos: " + position);
        int postiionWesley = nomes.indexOf("Wesley");
        System.out.println("index of Carlos: " + postiionWesley);

        nomes.remove("Larissa");

        System.out.println(nomes.size());

        boolean hasAnderson = nomes.contains("Anderson");
        System.out.println(hasAnderson);

        boolean hasFernando = nomes.contains("Fernando");
        System.out.println(hasFernando);

        System.out.println("Lista vazia? "+ nomes.isEmpty());

        for (String itemNome: nomes) {
            System.out.println("--->\t" + itemNome);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("--->\t* " + iterator.next());
        }

        nomes.clear();

        System.out.println("Lista vazia? "+ nomes.isEmpty());
    }
}
