package one.digitalinnovation.colletionsandstreams.list.classes;

public class Pessoa {
    private String nome;
    private byte idade;

    public Pessoa(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
