package one.digitalinnovation.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        for (int i = 1; i <= value; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
