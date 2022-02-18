package one.digitalinnovation.gft4java.Collections.sets;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("Game of Thrones", "fantasia", 60));
           add(new Serie("Dark", "drama", 60));
           add(new Serie("That 70s Show", "comédia", 25));
        }};
        for(Serie serie : minhasSeries){
            System.out.printf("%s - %s - %dmin, ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }
        System.out.println();
        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Game of Thrones", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("That 70s Show", "comédia", 25));
        }};
        for(Serie serie : minhasSeries1){
            System.out.printf("%s - %s - %dmin, ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries2){
            System.out.printf("%s - %s - %dmin, ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("--\tOrdem Nome/Gero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie : minhasSeries3){
            System.out.printf("%s - %s - %dmin, ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("--\tOrdem genero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for(Serie serie : minhasSeries4){
            System.out.printf("%s - %s - %dmin, ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }
        System.out.println();

        System.out.println("--\tOrdem Tempo Episodio\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for(Serie serie : minhasSeries5){
            System.out.printf("%s - %s - %dmin, ", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio());
        }
        System.out.println();

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie() {
    }

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareToIgnoreCase(o.getGenero());

    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        int genero = o1.getGenero().compareToIgnoreCase(o2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        return o1.getGenero().compareToIgnoreCase(o2.getGenero());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie o1, Serie o2) {
        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }
}