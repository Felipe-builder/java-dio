package one.digitalinnovation.desafios;

import java.util.Scanner;

public class ConsumoMedioDoAutomovel {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int x = leitor.nextInt();
        double y= leitor.nextDouble();

        double media = x / y  ;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", media));
    }
}
