package one.digitalinnovation.gft4java.Collections.lists.exercicios.crime;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pergunta> perguntas = new ArrayList<>(Arrays.asList(
                new Pergunta(1,"Telefonou para a vítima? "),
                new Pergunta(2,"Esteve no local do Crime? "),
                new Pergunta(3,"Mora perto da vítima? "),
                new Pergunta(4,"Devia para vítima? "),
                new Pergunta(5,"Já trabalhou com a vítima? ")
        ));
        for(Pergunta pergunta: perguntas) {
            System.out.println(pergunta.getFormulario());
            String resposta = scanner.nextLine();
            pergunta.setVerdadeiro(resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("sim"));
        }

        int evidencias = 0;
        Iterator<Pergunta> iterator = perguntas.iterator();
        while(iterator.hasNext()) {
            Pergunta next = iterator.next();
            if (next.isVerdadeiro()) evidencias++;
        }

        switch (evidencias) {
            case 0:
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeito");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Culpado");
                break;
            default:
                System.out.println("ALGUM ERRO OCRREU!");
        }
    }
}
