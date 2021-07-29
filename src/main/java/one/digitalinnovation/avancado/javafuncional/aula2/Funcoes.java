package one.digitalinnovation.avancado.javafuncional.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteStringParaInteiroECalculaODobro = string -> Integer.parseInt(string) * 2;
        Function<String, Integer> converteStringParaInteiroECalculaODobro1 = string1 -> Integer.valueOf(string1) * 2;
        System.out.println(converteStringParaInteiroECalculaODobro.apply("20"));
        System.out.println(converteStringParaInteiroECalculaODobro1.apply("40"));
        System.out.println(retornaNomeAoContrario.apply("Felipe"));
    }
}
