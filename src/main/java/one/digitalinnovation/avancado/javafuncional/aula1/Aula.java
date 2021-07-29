package one.digitalinnovation.avancado.javafuncional.aula1;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {

        //PARADIGMA IMPERATIVO
        int valor = 10;
        int resultado = valor * 3;
        System.out.println("Resultado é " + resultado);

        //PARADIGMA FUNCIONAL
        UnaryOperator<Integer> calcularValorVezesTrinta = novoValor -> novoValor * 3;
//        int novoValor = 10;
        System.out.println("O resultado é :: " + calcularValorVezesTrinta.apply(10));

        Funcao1 funcao1 = valor1 -> valor1;

        System.out.println("RESULTADO: " + funcao1.gerar("5"));

        //Antes do Java8
        Funcao1 colocarPrefixoSenhorNaString = new Funcao1(){
            @Override
            public String gerar(String valor){
                return "Sr. "+ valor;
            }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));

        //No Java8 em diante
        Funcao1 colocarPrefixoSrNaString = parametro -> "Sr. " + parametro;

        System.out.println(colocarPrefixoSrNaString.gerar("Luan"));


        Funcao2 funcao2 = valor2 -> {
            valor2 = "Srta. " + valor2;
            System.out.println(valor2);
        };
        funcao2.gerar("Kauane");
    }
}

@FunctionalInterface
interface Funcao1 {
    String gerar(String valor);
}

@FunctionalInterface
interface Funcao2 {
    void gerar(String valor);
}