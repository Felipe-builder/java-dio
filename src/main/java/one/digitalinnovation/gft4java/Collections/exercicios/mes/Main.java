package one.digitalinnovation.gft4java.Collections.exercicios.mes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Mes> meses = new ArrayList<>(Arrays.asList(
                new Mes(1, "Janeiro", 25),
                new Mes(2, "Fevereiro", 40),
                new Mes(3, "Março", 32),
                new Mes(4, "Abril", 18),
                new Mes(5, "Maio", 19),
                new Mes(6, "Junho", 26)
        ));
        double soma = 0;
        double media = 0;
        Iterator<Mes> iterator = meses.iterator();
        while(iterator.hasNext()) {
            Mes next = iterator.next();
            soma += next.getTemperatura();
        }
        media = soma/meses.size();
        System.out.printf("Média de temperatura: %.2fºC", media);
        System.out.println();
        for (Mes mes: meses) {
            if(mes.getTemperatura() > media) {
                System.out.println(mes);
            }
        }
    }
}
