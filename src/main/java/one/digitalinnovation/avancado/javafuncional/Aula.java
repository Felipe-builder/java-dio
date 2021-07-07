package one.digitalinnovation.avancado.javafuncional;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {

        //PARADIGMA IMPERATIVO
        int valor = 10;
        int resultado = valor * 3;
        System.out.println("Resultado é " + resultado);

        //PARADIGMA FUNCIONAL
        UnaryOperator<Integer> calcularValorVezesTrinta = novoValor -> novoValor * 3;
        int novoValor = 10;
        System.out.println("O resultado é :: " + calcularValorVezesTrinta.apply(10));
    }
}
