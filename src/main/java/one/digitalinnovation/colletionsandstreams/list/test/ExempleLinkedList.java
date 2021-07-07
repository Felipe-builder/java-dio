package one.digitalinnovation.colletionsandstreams.list.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExempleLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        String clienteASerAtendido = filaBanco.poll();//pega o cliente a ser atendido removendo-o da fila(Queue) e adiciona a variável
        System.out.println(clienteASerAtendido);
        System.out.println("----------");

        System.out.println(filaBanco);
        String primeiroCliente = filaBanco.peek(); // retorna o primeiro elemento da fila mas não vai removê-lo
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        System.out.println("----------");

//        filaBanco.clear(); // ao ativar o clear na linha28 ocorrerá um erro;
        String primeiroClienteOuErro = filaBanco.element(); // retorna o primeiro elemento mas não vai removê-lo, e no entato se a lista estiver vázia lança um erro;
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);
        System.out.println("----------");

        for (String nome : filaBanco) {
            System.out.println(nome);
        }
        System.out.println("----------");
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()) {
            System.out.println(iteratorFilaBanco.next());
        }

        System.out.println("Size: " + filaBanco.size());
        System.out.println("Is Empty? " + filaBanco.isEmpty());
        filaBanco.clear();
        System.out.println("Is Empty? " + filaBanco.isEmpty());

    }
}
