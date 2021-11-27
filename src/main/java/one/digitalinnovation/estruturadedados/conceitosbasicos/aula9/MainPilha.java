package one.digitalinnovation.estruturadedados.conceitosbasicos.aula9;

import java.util.Stack;

public class MainPilha {
    public static void main(String[] args) {

        Stack<Carro> stackCarro = new Stack<>();

        stackCarro.push(new Carro("Ford"));
        stackCarro.push(new Carro("Chevrolet"));
        stackCarro.push(new Carro("Fiat"));

        System.out.println(stackCarro);
        System.out.println(stackCarro.pop());
        System.out.println(stackCarro);

        System.out.println(stackCarro.peek());
        System.out.println(stackCarro);
        System.out.println(stackCarro.empty());
    }
}
