package one.digitalinnovation.ecossistemaEDocumentacaoJava.estrutura_de_repeticao.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scanner.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scanner.nextInt();

        }
        System.out.println("Continua ....");
    }
}
