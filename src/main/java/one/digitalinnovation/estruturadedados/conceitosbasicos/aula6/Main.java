package one.digitalinnovation.estruturadedados.conceitosbasicos.aula6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.add("teste1");
        minhaLista.add("teste2");
        minhaLista.add("teste3");
        minhaLista.add("teste4");
        minhaLista.add("teste5");
        minhaLista.add("teste6");


        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(3));
        System.out.println(minhaLista);

        minhaLista.remove(3);
        minhaLista.add(3, "testeAA");

        System.out.println(minhaLista);
    }
}
