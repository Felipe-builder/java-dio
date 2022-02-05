package one.digitalinnovation.gft4java.estrutura_de_repeticao.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatórios: ");
        for(int number : numerosAleatorios) {
            System.out.print(number + " ");
        }

        System.out.println("\nSucessores dos números Aleatórios: ");
        for (int number : numerosAleatorios) {
            System.out.print((number + 1) + " ");
        }

        System.out.println("\nAntecessores dos números Aleatórios: ");
        for (int number : numerosAleatorios) {
            System.out.print((number - 1) + " ");
        }
    }
}
