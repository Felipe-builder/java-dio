package one.digitalinnovation.gft4java.desafios;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //implemente o seu código aqui
        int SENHA_CORRETA = 2002;
        int senha = leitor.nextInt();
        while(senha != SENHA_CORRETA) {
            System.out.println("Senha Invalida");
            senha = leitor.nextInt();

        }
        System.out.println("Acesso Permitido");
    }
}
