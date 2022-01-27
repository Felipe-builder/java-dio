package one.digitalinnovation.ecossistemaEDocumentacaoJava.estrutura_de_repeticao.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada: ");
        int tabuada = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d\n", i, tabuada, (i*tabuada));
        }
    }
}
