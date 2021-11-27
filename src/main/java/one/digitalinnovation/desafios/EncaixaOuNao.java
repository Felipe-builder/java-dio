package one.digitalinnovation.desafios;

import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

//continue a solucao

        for (int i = 0; i < N; i++) {
            String palavra1 = leitor.next();
            String palavra2 = leitor.next();
            Boolean AmaiorB = ( palavra1.length() >= palavra2.length());
            String partefinal =  AmaiorB ? palavra1.substring((palavra1.length() - palavra2.length()), palavra1.length()) : "";

            if (partefinal.equals(palavra2))
                System.out.println("encaixa");
            else
                System.out.println("nao encaixa");
        }
    }
}
