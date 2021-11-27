package one.digitalinnovation.estruturadedados.conceitosbasicos.aula13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println("------------------------");
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listAlunos = new ArrayList<>();

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "João");
        aluno2.put("Idade", "17");
        aluno2.put("Media", "8.5");
        aluno2.put("Turma", "3a");

        listAlunos.add(aluno);
        listAlunos.add(aluno2);

        System.out.println(listAlunos);

        System.out.println(aluno.containsKey("Nome"));


    }
}
