package one.digitalinnovation.colletionsandstreams.list.test;

import one.digitalinnovation.colletionsandstreams.list.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "12345");
        Celular celular2 = new Celular("iPhone 10", "12346");
        Celular celular3 = new Celular("Sony Xperia M", "81235");
        List<Celular> celularList = new ArrayList<>();

        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList) {
            System.out.println(celular);
        }

        Celular celularProcurado = new Celular("Galaxy S7", "12345");
        System.out.println(celular1 == celularProcurado); //Falso pq estãos endo comparados pelo endereço de memória
        System.out.println(celularProcurado.equals(celular1)); //Verdadeiro porque o 'equals' foi subscrito para comparar através do atributo 'EMEI'
        System.out.println(celularList.contains(celularProcurado));//portanto irá dá 'true' neste método
    }
}
