package one.digitalinnovation.colletionsandstreams.list.test.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioComparators {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add( new Funcionario("Fernando", "Gerente", 7000.22));
        funcionarios.add( new Funcionario("Rodrigo", "Vendedor", 2500.22));
        funcionarios.add( new Funcionario("Maciel", "Zelador", 2000.22));
        funcionarios.add( new Funcionario("Juana", "CEO", 25000.22));
        funcionarios.add( new Funcionario("Adriana", "Engenheira", 12000.50));
        funcionarios.add( new Funcionario("Atarciso", "Engenheiro", 12000.22));

        System.out.println("--- ordem de inserção ---");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }


        System.out.println("\n--- ordem natural dos números - salario (expressão lambda) ---");
        funcionarios.sort((first, second) -> (int) (first.getSalario() - second.getSalario())); //comparator

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("\n--- ordem reversa dos números - salario (expressão lambda) ---"); //comparator
        funcionarios.sort((first, second) -> (int) (second.getSalario() - first.getSalario()));
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }


        System.out.println("\n--- ordem natural dos números - salário (method reference)");
        funcionarios.sort(Comparator.comparingDouble(Funcionario::getSalario)); //comparator
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("\n--- ordem reversa do números - salário (method reference)");
        funcionarios.sort(Comparator.comparingDouble(Funcionario::getSalario).reversed()); //comparator
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }


        System.out.println("--- ordem natural dos números - idade (interface Comparable) ---");
        Collections.sort(funcionarios);
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        System.out.println("--- ordem reversa dos números - idade (interface Comparabor) ---");

        Collections.sort(funcionarios, new FuncionarioOrdemSalarioReversa());
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
