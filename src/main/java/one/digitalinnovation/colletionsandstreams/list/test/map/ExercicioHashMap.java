package one.digitalinnovation.colletionsandstreams.list.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExercicioHashMap {
    public static void main(String[] args) {
        HashMap<String, String> unidadesFederativas = new HashMap<>();

        unidadesFederativas.put("AC","Acre");
        unidadesFederativas.put("AL","Alagoas");
        unidadesFederativas.put("AP","Amapá");
        unidadesFederativas.put("AM","Amazonas");
        unidadesFederativas.put("BA","Bahia");
        unidadesFederativas.put("CE","Ceará");
        unidadesFederativas.put("ES", "Espírito Santo");
        unidadesFederativas.put("GO","Goiás");
        unidadesFederativas.put("MA","Maranhão");
        unidadesFederativas.put("MT","Mato Grosso");
        unidadesFederativas.put("MS","Mato Grosso do Sul");
        unidadesFederativas.put("MG","Minas Gerais");
        unidadesFederativas.put("PA","Pará");
        unidadesFederativas.put("PB","Paraíba");
        unidadesFederativas.put("PR","Paraná");
        unidadesFederativas.put("PE","Pernambuco");
        unidadesFederativas.put("PI","Piauí");
        unidadesFederativas.put("RJ","Rio de Janeiro");
        unidadesFederativas.put("RN","Rio Grande do Norte");
        unidadesFederativas.put("RS","Rio Grande do Sul");
        unidadesFederativas.put("RO","Rondônia");
        unidadesFederativas.put("RR","Roraima");
        unidadesFederativas.put("SC","Santa Catarina");
        unidadesFederativas.put("SP","São Paulo");
        unidadesFederativas.put("SE","Sergipe");
        unidadesFederativas.put("TO","Tocantins");


        System.out.println(unidadesFederativas);

        unidadesFederativas.remove("MG");

        System.out.println(unidadesFederativas);

        unidadesFederativas.put("DF","Distrito Federal");

        System.out.println(unidadesFederativas.size());

        String estadoSelect = unidadesFederativas.get("MS");

        unidadesFederativas.remove("MS", estadoSelect);
        System.out.println(unidadesFederativas);

        Iterator<String> iterator = unidadesFederativas.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(unidadesFederativas.get(key) + " - " + key);
        }

        System.out.println("-----------");
        for (String estado : unidadesFederativas.keySet()) {
            System.out.println(unidadesFederativas.get(estado) + " -- " + estado);
        }
        System.out.println("-----------");
        for (Map.Entry<String, String> estado : unidadesFederativas.entrySet()) {
            System.out.println(estado.getValue() + " --- " + estado.getKey());
        }

        System.out.println(unidadesFederativas.containsKey("SC"));

        System.out.println(unidadesFederativas.containsValue("Maranhão"));
    }
}
