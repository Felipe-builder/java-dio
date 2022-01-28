package one.digitalinnovation.ecossistemaEDocumentacaoJava.estrutura_de_repeticao.exercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0, count = 0;
        String[] vogais = {"a", "e", "i", "o", "u"};

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if(!Arrays.asList(vogais).contains(letra.toLowerCase())) {
                consoantes[count] = letra;
                qtdConsoantes++;
            }
            count++;
        } while(count < consoantes.length );
        System.out.println();
        for(String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }

        System.out.println("Numero de consoantes: " + qtdConsoantes);
    }
}
