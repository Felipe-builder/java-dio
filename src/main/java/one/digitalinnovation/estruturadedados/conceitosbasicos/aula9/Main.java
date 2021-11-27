package one.digitalinnovation.estruturadedados.conceitosbasicos.aula9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listCarro = new ArrayList<>();

        listCarro.add(new Carro("Ford"));
        listCarro.add(new Carro("Chevrolet"));
        listCarro.add(new Carro("Volkswagen"));

        System.out.println(listCarro.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
