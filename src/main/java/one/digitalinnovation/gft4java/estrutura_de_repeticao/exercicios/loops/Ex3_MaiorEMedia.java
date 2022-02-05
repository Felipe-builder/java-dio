package one.digitalinnovation.gft4java.estrutura_de_repeticao.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero , maior = 0;
        double media , soma = 0;
        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if(numero > maior) maior = numero;
            soma += numero;
            contador++;
        } while(contador < 5);

        media = (soma/5.0);

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media);
    }
}
