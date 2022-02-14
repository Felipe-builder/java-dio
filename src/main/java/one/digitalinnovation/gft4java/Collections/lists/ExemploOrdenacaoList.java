package one.digitalinnovation.gft4java.Collections.lists;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>(Arrays.asList(
                new Gato("Jon", 18, "preto"),
                new Gato("Simba", 6, "tigrado"),
                new Gato("Jon", 12, "amarelo"),
                new Gato("Analuzia", 23, "branco")
        ));

        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(gatos);
        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("--\tOrdem Natural(Nome)\t---");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("--\tOrdem Idade\t---");
        System.out.println("--\tOrdem de cor\t---");
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private int idade;
    private String cor;

    public Gato() {
    }

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}