package one.digitalinnovation.ecossistemaEDocumentacaoJava.estrutura_de_repeticao.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

//        int[] numeros = new int[]{5, 3, 7, 5, 3, 2};
        int[] numeros = {5, 3, 7, 5, 3, 2};

        int count = 0;

        while(count < numeros.length){
            System.out.print(numeros[count] + " ");
            count++;
        }

        System.out.println();

        for (int i = numeros.length-1; i >= 0 ; i--) {
            System.out.print(numeros[i] + ", ");
        }
    }
}
