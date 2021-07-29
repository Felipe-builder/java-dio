package one.digitalinnovation.colletionsandstreams.list.test.list;

import java.util.*;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomesList = new ArrayList<>();
        nomesList.add("Juliana");
        nomesList.add("Pedro");
        nomesList.add("Carlos");
        nomesList.add("Larissa");
        nomesList.add("João");
        System.out.println(nomesList);

        for (String nome: nomesList) {
            System.out.println("\t--> " + nome);
        }

        nomesList.set(nomesList.indexOf("Carlos"), "Roberto");

        System.out.println(nomesList);

        System.out.println("Nome da posição 1: " + nomesList.get(1));

        System.out.println("Nome removido da posição 4: " + nomesList.get(4));
        nomesList.remove(4);
        Iterator<String> iterator = nomesList.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t** " + iterator.next());
        }

        System.out.println("Tamanho da Lista" + nomesList.size());

        System.out.println("Juliano existe na lista? " + nomesList.contains("Juliano"));

        List<String> novaListaNomes = new ArrayList<>(Arrays.asList("Ismael", "Rodrigo"));

        nomesList.addAll(novaListaNomes);

        System.out.println(nomesList);

        Collections.sort(nomesList);

        for (String nome: nomesList) {
            System.out.println("\t===> " + nome);
        }

    }
}
