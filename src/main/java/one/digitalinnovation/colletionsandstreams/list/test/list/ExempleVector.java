package one.digitalinnovation.colletionsandstreams.list.test.list;

import java.util.List;
import java.util.Vector;

public class ExempleVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        // Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        // Altera o valor da posição 2 do vetor
        esportes.set(2,"Ping Pong");

        // Remove o elemento da posição 2
        esportes.remove(2);

        // Remove o objeto "Handebol" do vetor
        esportes.remove("Handebol");

        // Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        // Navega nos Espostes
        for (String esporte: esportes) {
            System.out.println("\t--> "+ esporte);
        }

    }
}
