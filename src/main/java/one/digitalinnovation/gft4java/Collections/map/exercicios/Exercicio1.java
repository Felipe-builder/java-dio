package one.digitalinnovation.gft4java.Collections.map.exercicios;

import java.util.*;
import java.util.Map.Entry;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(
                Map.of("PE", 9616621, "AL", 3351543, "CE", 8187103, "RN", 3534265)
        );
        System.out.println(estados);
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println("Estado = " + estado.getKey() + " - " + "Populaçao = " + estado.getValue());
        }

        System.out.println("População de RN = " + estados.put("RN", 3534165));
        System.out.println("População de RN = " + estados.get("RN"));

        if (!estados.containsKey("PB")) {
            estados.put("PB", 4039277);
        } else {
            System.out.println("O estado PB está contido no Dicionário");
        }
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println("Estado = " + estado.getKey() + " - " + "Populaçao = " + estado.getValue());
        }

        System.out.println("População de PE = " + estados.get("PE"));

        Map<String, Integer> estados1 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 8187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados1.entrySet()) {
            System.out.println("Estado = " + estado.getKey() + " - " + "Populaçao = " + estado.getValue());
        }

        System.out.println("Ordem de inserção");
        Map<String, Integer> estados2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 8187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados2.entrySet()) {
            System.out.println("Estado = " + estado.getKey() + " - " + "Populaçao = " + estado.getValue());
        }

        System.out.println("Alfabético");
        Map<String, Integer> estados3 = new TreeMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 8187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados3.entrySet()) {
            System.out.println("Estado = " + estado.getKey() + " - " + "Populaçao = " + estado.getValue());
        }
        System.out.println();
        Integer min = Collections.min(estados.values());

        for(Map.Entry<String, Integer> value: estados.entrySet()) {
            if(value.getValue().equals(min)) {
                System.out.println("Estado = " + value.getKey() + " - " + "Populaçao = " + value.getValue());
            }
        }

        System.out.println();
        Integer max = Collections.max(estados.values());

        for(Map.Entry<String, Integer> value: estados.entrySet()) {
            if(value.getValue().equals(max)) {
                System.out.println("Estado = " + value.getKey() + " - " + "Populaçao = " + value.getValue());
            }
        }

        Iterator<Integer> iterator = estados.values().iterator();
        Integer sum = 0;
        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("SOMA = " + sum);

        System.out.println("Média = " + (sum/estados.size()));

        Iterator<Integer> iterator1 = estados.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() <= 4_000_000) iterator1.remove();
        }

        for(Map.Entry<String, Integer> value: estados.entrySet()) {
            System.out.println("Estado = " + value.getKey() + " - " + "Populaçao = " + value.getValue());
        }

        estados.clear();
        System.out.println(estados);

        System.out.println("Lista vazia: " + estados.isEmpty());
    }
}
