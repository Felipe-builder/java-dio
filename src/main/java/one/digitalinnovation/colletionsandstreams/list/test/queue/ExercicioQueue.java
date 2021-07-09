package one.digitalinnovation.colletionsandstreams.list.test.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        Iterator<String> iteratorFila = fila.iterator();

        System.out.println("FILA: ");
        while (iteratorFila.hasNext()){
            System.out.println(iteratorFila.next());
        }

        System.out.println("-----------------");
        String primeiro = fila.peek(); // pegando o primeiro sem removê-lo da fila;
        System.out.println("Primeiro da fila: " + primeiro);
        System.out.println(fila);

        System.out.println("-----------------");

        String primeiroAtendido = fila.poll(); // pegando o primeiro da fila removendo-o da fila;
        System.out.println("Primeiro a sair da fila é " + primeiroAtendido);
        System.out.println(fila);

        System.out.println("-----------------");
        fila.add("Daniel");
        System.out.println(fila);
        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Lista vazia: " + fila.isEmpty());
        System.out.println("Carlos está na fila: "  + fila.contains("Carlos"));

    }
}
