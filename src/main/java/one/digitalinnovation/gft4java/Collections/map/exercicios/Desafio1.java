package one.digitalinnovation.gft4java.Collections.map.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Desafio1 {
    public static void main(String[] args) {
        Map<Integer, Integer> dado = new HashMap<>(){{
           put(1, 0);
           put(2, 0);
           put(3, 0);
           put(4, 0);
           put(5, 0);
           put(6, 0);
        }};

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int v = 1+(r.nextInt(6));
            dado.put(v,dado.get(v)+1);
        }

        System.out.println(dado);
    }
}
