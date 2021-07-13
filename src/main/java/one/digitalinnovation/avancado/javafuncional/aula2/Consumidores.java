package one.digitalinnovation.avancado.javafuncional.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //Method Reference

//        -- apenas
//        -- utilizar o parâmetro da forma que ele foi recebido

        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Olá Mundo, JAVA");

        Consumer<String> imprimirUmaFrase1 = frase -> System.out.println(frase);
        imprimirUmaFrase1.accept("Hello World, JAVA");
    }
}
