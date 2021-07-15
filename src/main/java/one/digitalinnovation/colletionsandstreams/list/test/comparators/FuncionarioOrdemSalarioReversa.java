package one.digitalinnovation.colletionsandstreams.list.test.comparators;

import java.util.Comparator;

public class FuncionarioOrdemSalarioReversa implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return (int) (o2.getSalario() - o1.getSalario());
    }
}
