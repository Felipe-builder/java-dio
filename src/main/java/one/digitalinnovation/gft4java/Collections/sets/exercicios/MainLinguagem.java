package one.digitalinnovation.gft4java.Collections.sets.exercicios;


import java.time.LocalDate;
import java.util.*;

public class MainLinguagem {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemFavoritas = new HashSet<>(Arrays.asList(
                new LinguagemFavorita("Java", LocalDate.of(1995, 5, 23), "IntelliJ"),
                new LinguagemFavorita("JavaScrip", LocalDate.of(1995, 11, 4), "VS-Code"),
                new LinguagemFavorita("Python", LocalDate.of(1995, 2, 20), "PyCharm")
        ));

        System.out.println(linguagemFavoritas);

        Set<LinguagemFavorita> linguagemFavoritas1 = new TreeSet<>(linguagemFavoritas);
        System.out.println(linguagemFavoritas1);

        Set<LinguagemFavorita> linguagemFavoritas2 = new TreeSet<>(new ComparatorLinguagemIDE());
        linguagemFavoritas2.addAll(linguagemFavoritas);

        System.out.println(linguagemFavoritas2);

        Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(new ComparatorLinguagemAnoNome());
        linguagemFavoritas3.addAll(linguagemFavoritas);

        System.out.println(linguagemFavoritas3);

        Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new ComparatorLinguagemNomeAnoIDE());
        linguagemFavoritas4.addAll(linguagemFavoritas);

        System.out.println(linguagemFavoritas4);
    }
}

class ComparatorLinguagemIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}

class ComparatorLinguagemAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        if(ano != 0) return ano;
        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class ComparatorLinguagemNomeAnoIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0) return nome;
        int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        if(ano != 0) return ano;
        return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
}