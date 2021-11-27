package one.digitalinnovation.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ACorridaDeTartarugas {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //continue a solucao de acordo com o solicitado

        int n;
        do {
            n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");

            int[] arrayInt = Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();

            int max = Arrays.stream(arrayInt).max().getAsInt();

            int m = (max >= 20) ? 3 : (max < 10) ? 1 : 2;

            //alteranativa
//            List<Integer> intList = Arrays.stream(s)
//                    .map(Integer::valueOf)
//                    .collect(Collectors.toList());
//
//            OptionalInt maior = intList.stream().mapToInt(Integer::intValue).max();
//
//            int fim = (maior.getAsInt() >= 20) ? 3 : (maior.getAsInt() < 10) ? 1 : 2;

            System.out.println(m);
        } while (br.ready());
    }
}
