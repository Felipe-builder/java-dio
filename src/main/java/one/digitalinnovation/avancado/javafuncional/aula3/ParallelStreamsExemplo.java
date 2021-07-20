package one.digitalinnovation.avancado.javafuncional.aula3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamsExemplo {
    public static void main(String[] args) {
//        long inicio = System.currentTimeMillis();
//        IntStream.range(1,1000).forEach(num -> fatorial(num)); //Serial
//        long fim = System.currentTimeMillis();
//        System.out.println("Tempo de execução SERIAL: " + (fim-inicio));
//
//        inicio = System.currentTimeMillis();
//        IntStream.range(1,1000).parallel().forEach(num -> fatorial(num));//Parallel
//        fim = System.currentTimeMillis();
//        System.out.println("Tempo de execução PARALLEL: " + (fim-inicio));

        List<String> stringList = Arrays.asList("João", "Alan", "Gabriel", "Joana", "Maria");
        stringList.parallelStream().forEach(System.out::println);
    }

    public static long fatorial(long valor){
        long fatorial = 1;
        for (long i = 1; i <= valor; i++) {
            fatorial*=i;
        }
        return fatorial;
    }
}