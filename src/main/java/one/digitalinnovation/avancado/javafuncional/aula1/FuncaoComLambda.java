package one.digitalinnovation.avancado.javafuncional.aula1;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixoNaString = valor -> "Srta. " + valor;
        System.out.println(colocarPrefixoNaString.gerar("Iasmim"));
    }

}
