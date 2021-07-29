package one.digitalinnovation.colletionsandstreams.list.test.comparators;

public class Funcionario implements Comparable<Funcionario> {
    private final String nome;
    private final String cargo;
    private final Double salario;

    public Funcionario(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "{nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public int compareTo(Funcionario o) {
        return  (int) (this.getSalario() - o.getSalario());
    }
}
