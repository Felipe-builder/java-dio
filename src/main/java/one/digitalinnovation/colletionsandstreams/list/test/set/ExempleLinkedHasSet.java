package one.digitalinnovation.colletionsandstreams.list.test.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExempleLinkedHasSet {
    public static void main(String[] args) {

        Set<Integer> sequanciaNumerica = new LinkedHashSet<>();
        
        // adicionar as notas no set
        sequanciaNumerica.add(1);
        sequanciaNumerica.add(16);
        sequanciaNumerica.add(2);
        sequanciaNumerica.add(8);
        sequanciaNumerica.add(4);
        sequanciaNumerica.add(4);

        System.out.println(sequanciaNumerica);

        // Remove a nota do set
        sequanciaNumerica.remove(4);

        System.out.println(sequanciaNumerica);

        // Retorna a quantidade de itens do Set
        System.out.println(sequanciaNumerica.size());

        // Navega em todos os itens do Iterator
        Iterator<Integer> iterator = sequanciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------");
        for (Integer numero : sequanciaNumerica) {
            System.out.println(numero);
        }

        // Limpa
        sequanciaNumerica.clear();

        System.out.println(sequanciaNumerica.isEmpty());
    }
}
