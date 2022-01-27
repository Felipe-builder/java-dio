package one.digitalinnovation.ecossistemaEDocumentacaoJava.estrutura_de_repeticao.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpara {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdNumeros, numero, qtdPar = 0, qtdImpar = 0, contador = 0;

        System.out.println("QUantidade de números: ");
        qtdNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qtdPar++;
            else qtdImpar++;

            contador++;
        } while(contador < qtdNumeros);

        System.out.println("Quidade de numeros pares: " + qtdPar);
        System.out.println("Quidade de numeros impares: " + qtdImpar);
    }
}
