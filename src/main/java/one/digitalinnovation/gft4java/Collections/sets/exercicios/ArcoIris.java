package one.digitalinnovation.gft4java.Collections.sets.exercicios;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(Arrays.asList("Vermelho","Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        Iterator<String> iterator = cores.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(cores.size());

        Set<String> cores1 = new TreeSet<>(cores);

        System.out.println(cores1);

        Set<String> cores2 = new LinkedHashSet<>(Arrays.asList("Vermelho","Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        System.out.println(cores2);
        List<String> coresList = new ArrayList<>(cores2);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println();
        cores.forEach(item -> {
            if(item.toLowerCase().startsWith("v")) System.out.println(item);
        });

        cores.removeIf(word -> word.toLowerCase().charAt(0) == 'v');
        System.out.println();

//        Iterator<String> iterator1 = cores.iterator();
//        while(iterator1.hasNext()) {
//            if(!iterator1.next().toLowerCase().startsWith("v")) iterator1.remove();
//        }

        System.out.println(cores);

        cores.clear();

        System.out.println(cores.isEmpty());

    }
}
