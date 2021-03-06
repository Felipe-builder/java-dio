package one.digitalinnovation.gft4java.Collections.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.5, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);

        System.out.println("Crie um dicionário que relacione modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionrio: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico e seu consumo");
        Double max = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente = "";

        for(Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(max)) {
                modeloEficiente = entry.getKey();
                System.out.println("Modelo mais Eficiente: " + modeloEficiente + " - " + max + " km/L");
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double min = Collections.min(carrosPopulares.values());

        String modeloMenosEficiente = "";

        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(min)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println( "Modelo menos eficiente: " + modeloMenosEficiente + " - " + min + " km/L");
            }
        }
        System.out.println("Exiba a soma dos consumos: ");
        Double soma = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicario de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova o modelo com o consumo igual a 15,6 km/L");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopularesLinked = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesLinked);

        Map<String, Double> carrosPopularesTree = new TreeMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopularesTree);

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se a lista está vazia: ");
        System.out.println(carrosPopulares.isEmpty());
    }
}
