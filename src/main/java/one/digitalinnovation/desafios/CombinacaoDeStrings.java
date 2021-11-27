package one.digitalinnovation.desafios;

import java.util.Scanner;

public class CombinacaoDeStrings {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            String palavra1 = leitor.next();
            String palavra2 = leitor.next();
            String maior = "";
            String menor = "";

            if (palavra1.length() > palavra2.length()) {
                maior = palavra1;
                menor = palavra2;
            } else {
                maior = palavra2;
                menor = palavra1;
            }

            String resultado = "";
            for (int j=0; j < menor.length() ; j++) {
                resultado += palavra1.charAt(j) + "" + palavra2.charAt(j);
            }

            resultado += "" + maior.substring(menor.length(), maior.length());

            System.out.println(resultado);
        }
    }
}
