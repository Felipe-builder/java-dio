package one.digitalinnovation.gft4java.Collections.map.exercicios;


import java.util.*;
import java.util.function.Function;

public class ExercicioProposto3 {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 55555));
            put(4, new Contato("Cami", 11111));
            put(3, new Contato("jan", 22222));
        }};
        System.out.println(agenda);
        System.out.println("--\tOrdem de Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 55555));
            put(4, new Contato("Cami", 11111));
            put(3, new Contato("jan", 22222));
        }};
        System.out.println(agenda1);

        System.out.println("--\tOrdem ID \t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(){{
            put(1, new Contato("Simba", 55555));
            put(4, new Contato("Cami", 11111));
            put(3, new Contato("jan", 22222));
        }};
        System.out.println(agenda2);

        System.out.println("--\tOrdem número de telefone \t--");
        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new ComparatorTelefone());
        agenda3.addAll(agenda.entrySet());
        System.out.println(agenda3);
        System.out.println();
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
            }
        });
        agenda4.addAll(agenda.entrySet());
        System.out.println(agenda4);

        Set<Map.Entry<Integer, Contato>> agenda5 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
        agenda5.addAll(agenda.entrySet());
        System.out.println(agenda5);

        Set<Map.Entry<Integer, Contato>> agenda6 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        agenda6.addAll(agenda.entrySet());
        System.out.println(agenda6);
        System.out.println("--\tOrdem \t--");
        System.out.println("--\tOrdem \t--");
        System.out.println("--\tOrdem \t--");
        System.out.println("--\tOrdem \t--");
    }
}

class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}

class ComparatorTelefone implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        return o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
    }
}