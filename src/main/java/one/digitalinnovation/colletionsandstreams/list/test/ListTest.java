package one.digitalinnovation.colletionsandstreams.list.test;

import one.digitalinnovation.colletionsandstreams.list.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        //        List nomes = new ArrayList<>();
//
//        nomes.add("João");
//        nomes.add("Pedro");
//        nomes.add("Paulo");
//        nomes.add("Tiago");
//        nomes.add(new Pessoa());
//
//        for (Object nome : nomes) {
//            System.out.println(nome);
//        }
        List<String> nomes3 = new ArrayList<>();
        nomes3.add("João");
        nomes3.add("Pedro");
        nomes3.add("Paulo");
        nomes3.add("Tiago");
        System.out.println("-------------");
        //A partir do Java 5
        List<String> nomes1 = new ArrayList<String>();

        //Apartir do Java 7
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Joana");
        nomes2.add("Luana");
        nomes2.add("Patricia");
        System.out.println(nomes2.remove("Patricia")); // remove porque String sobrescreve o método equals
        System.out.println(nomes2.remove("joana")); // remove porque String sobrescreve o método equals
//        nomes2.add(new Pessoa()); erro de compilação

        for (String nome: nomes2) {
            System.out.println(nome);
        }
        System.out.println("-------------");
        nomes2.add("Mariana");
        for (String nome: nomes2) {
            System.out.println(nome);
        }
        System.out.println("-------------");

        for (int i = 0; i < nomes2.size(); i++) {
            System.out.println(nomes2.get(i));
//            nomes2.add("Poliana"); StackErrorOverFlow
        }
        System.out.println("-------------");
        int size = nomes2.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes2.get(i));
            nomes2.add("Poliana");
        }
        System.out.println("-------------");
        for (String nome:nomes2
             ) {
            System.out.println(nome);
        }
        System.out.println("-------------");

//        List<int> numeros = new ArrayList<>(); //error não se pode fazer isso
        nomes2.addAll(nomes3);
        System.out.println(nomes2);
        nomes3.clear();
        System.out.println("----------");
        System.out.println(nomes2);
        System.out.println("----------");
        System.out.println(nomes3);

    }
}
