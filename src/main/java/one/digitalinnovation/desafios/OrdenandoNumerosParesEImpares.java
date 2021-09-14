package one.digitalinnovation.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 Desafio

 Crie um programa onde você receberá valores inteiros não negativos como entrada.

 Ordene estes valores de acordo com o seguinte critério:

 Primeiro os Pares
 Depois os Ímpares

 Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.
 Entrada

 A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000) Este é o número de linhas de entrada que
 vem logo a seguir. As próximas N linhas terão, cada uma delas, um valor inteiro não negativo.
 Saída

 Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha,
 conforme exemplo de saída abaixo.

 Exemplo de Entrada 	Exemplo de Saída
 10                     4
 4                      32
 32                     34
 34                     98
 543                    654
 3456                   3456
 654                    6789
 567                    567
 87                     543
 6789                   87
 98
* */

public class OrdenandoNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueLimit = scanner.nextInt();

        // Paradigma Funcional
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < valueLimit; i++) {
            numeros.add(scanner.nextInt());
        }

        numeros.stream().filter((numero) -> numero % 2 == 0)
                .sorted((first, second) -> first - second)
                .forEach(System.out::println);
        numeros.stream().filter((numero) -> numero % 2 != 0)
                .sorted((first, second) -> second - first)
                .forEach(System.out::println);

        // paradigma imperativo
//        List<Integer> numeros1 = new ArrayList<>();
//
//        for (int i = 0; i < valueLimit; i++) {
//            numeros1.add(scanner.nextInt());
//        }
//        ArrayList<Integer> pares = new ArrayList<>();
//        ArrayList<Integer> impares = new ArrayList<>();
//        for (int i = 0; i < valueLimit; i++) {
//
//            if (numeros1.get(i) % 2 == 0) {
//                pares.add(numeros1.get(i));
//            } else {
//                impares.add(numeros1.get(i));
//            }
//            pares = organizarCrescente(pares);
//            impares = organizarDecescente(impares);
//        }
//        numeros1.clear();
//        numeros1.addAll(pares);
//        numeros1.addAll(impares);
//        for (int number: numeros1
//             ) {
//            System.out.println(number);
//        }
//    }
//
//    public static ArrayList<Integer> organizarCrescente(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i; j < list.size(); j++) {
//                if (list.get(i) > list.get(j)) {
//                    int aux = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, aux);
//                }
//            }
//        }
//        return list;
//    }
//
//    public static ArrayList<Integer> organizarDecescente(ArrayList<Integer> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = i; j < list.size(); j++) {
//                if (list.get(i) < list.get(j)) {
//                    int aux = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, aux);
//                }
//            }
//        }
//        return list;
    }
}