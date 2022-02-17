package one.digitalinnovation.gft4java.Collections.sets;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
//        Set notas = new HashSet(); // antes do java5
//        HashSet<Double> notas = new HashSet<>();
//        Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas.add(1d);
//        notas.remove(5d);
//        System.out.println(notas);

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println("Não temm");

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        System.out.println("Não temm");

        System.out.println("Subistitua a nota 5.0 pela nota 6.0: ");
        System.out.println("Não temm");

        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println("Não temm");

        System.out.println("Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");

        double soma = 0, media = 0;
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        System.out.println("Não temm");

        System.out.println("Remova as notas menores que 7 exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram informados: ");
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas1);

        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println(notas2);

        System.out.println("Apague todo o conjunto: ");
        notas2.clear();

        System.out.println(notas.isEmpty());
    }
}
