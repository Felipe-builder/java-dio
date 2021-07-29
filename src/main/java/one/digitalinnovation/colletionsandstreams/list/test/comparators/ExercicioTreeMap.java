package one.digitalinnovation.colletionsandstreams.list.test.comparators;

import java.util.Map;
import java.util.TreeMap;

public class ExercicioTreeMap {

    public static void main(String[] args) {
        TreeMap<String, Funcionario> funcionarios = new TreeMap<>();

        funcionarios.put("Fernando" , new Funcionario("Fernando", "Gerente", 7000.22));
        funcionarios.put("Rodrigo", new Funcionario("Rodrigo", "Vendedor", 2500.22));
        funcionarios.put("Maciel", new Funcionario("Maciel", "Zelador", 2000.22));
        funcionarios.put("Juana", new Funcionario("Juana", "CEO", 25000.22));
        funcionarios.put("Adriana", new Funcionario("Adriana", "Engenheira", 12000.50));
        funcionarios.put("Atarciso", new Funcionario("Atarciso", "Engenheiro", 12000.22));

        for (Map.Entry<String, Funcionario> funcionarioEntry : funcionarios.entrySet() ) {
            System.out.println(funcionarioEntry.getValue());
        }


    }
}
