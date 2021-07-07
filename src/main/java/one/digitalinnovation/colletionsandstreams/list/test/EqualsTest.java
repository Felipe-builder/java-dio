package one.digitalinnovation.colletionsandstreams.list.test;

import one.digitalinnovation.colletionsandstreams.list.classes.Celular;

public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "Lucas Melo";
        String nome2 = new String("Lucas Melo");
        Integer int1 = 5;
        Integer int2 = new Integer(5);

        System.out.println(nome1 == nome2);
        System.out.println(int1 == int2);
        System.out.println(nome1.equals(nome2));
        System.out.println(int1.equals(int2));

        Celular c1 = new Celular("iPhone", "1234");
        Celular c2 = new Celular("iPhone", "1234");
        System.out.println(c1.equals(c2));
    }
}
