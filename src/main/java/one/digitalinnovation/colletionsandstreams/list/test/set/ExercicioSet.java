package one.digitalinnovation.colletionsandstreams.list.test.set;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {
        Set<Integer> numeros1 = new HashSet<>();
        Set<Integer> numeros2 = new LinkedHashSet<>();
        Set<Integer> numeros3 = new TreeSet<>();

        //HashSet
        numeros1.add(3);
        numeros1.add(88);
        numeros1.add(20);
        numeros1.add(44);
        numeros1.add(3);

        System.out.println(numeros1);

        numeros1.remove(3);
        System.out.println(numeros1);
        numeros1.add(23);
        System.out.println(numeros1);
        System.out.println(numeros1.size());
        System.out.println(numeros1.isEmpty());
        System.out.println("-------------------");
        //LinkedHashSet
        numeros2.add(3);
        numeros2.add(88);
        numeros2.add(20);
        numeros2.add(44);
        numeros2.add(3);

        System.out.println(numeros2);

        numeros2.remove(3);
        System.out.println(numeros2);
        numeros2.add(23);
        System.out.println(numeros2);
        System.out.println(numeros2.size());
        System.out.println(numeros2.isEmpty());
        System.out.println("-------------------");
        // TreeSet
        numeros3.add(3);
        numeros3.add(88);
        numeros3.add(20);
        numeros3.add(44);
        numeros3.add(3);

        System.out.println(numeros3);

        numeros3.remove(3);
        System.out.println(numeros3);
        numeros3.add(23);
        System.out.println(numeros3);
        System.out.println(numeros3.size());
        System.out.println(numeros3.isEmpty());

        System.out.println("-------------------");
    }
}
