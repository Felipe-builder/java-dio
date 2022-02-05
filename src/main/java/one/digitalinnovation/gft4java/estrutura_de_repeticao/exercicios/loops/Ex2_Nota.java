package one.digitalinnovation.gft4java.estrutura_de_repeticao.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextDouble();

        while (!(nota >= 0 && nota <= 10)) {
            System.out.print("Valor inválido! digite novamente: ");
            nota = scanner.nextDouble();
        }
        System.out.println("SUA NOTA FOI " + nota);
    }
}
