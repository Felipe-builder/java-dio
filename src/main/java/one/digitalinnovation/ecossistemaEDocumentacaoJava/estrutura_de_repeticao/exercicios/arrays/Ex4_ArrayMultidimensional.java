package one.digitalinnovation.ecossistemaEDocumentacaoJava.estrutura_de_repeticao.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int number = random.nextInt(10);
                matriz[i][j] = number;
            }
        }

        for (int[] list : matriz) {
            for (int value : list) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }
}
