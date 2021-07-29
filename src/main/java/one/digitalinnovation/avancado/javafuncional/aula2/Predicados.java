package one.digitalinnovation.avancado.javafuncional.aula2;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        Predicate<String> estaVazio1 = String::isEmpty; //method reference
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("João"));
        System.out.println(estaVazio1.test(""));
        System.out.println(estaVazio1.test("João"));
    }
}
