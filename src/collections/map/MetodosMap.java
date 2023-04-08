package collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

public class MetodosMap {
    public static void main(String[] args) {

        // HASH MAP - ordem aleatória ------------------------------------------------------------------------------------

        // Criando, put() para adicionar, toString()
        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        // put() para alterar
        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        // containsKey()
        System.out.println("\nConfira se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("tucson"));

        // get()
        System.out.println("\nExiba o consumo do uno: ");
        System.out.println(carrosPopulares.get("uno"));

        // keySet()
        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        // values()
        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        // Collections.max(), entrySet(), getValue(), getKey()
        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente + " -> " + consumoMaisEficiente);
            }
        }

        // Collections.min(), entrySet(), getValue(), getKey()
        System.out.println("\nExiba o modelo menos econômico e seu consumo: " );
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente + " -> " + consumoMenosEficiente);
            }
        }

        // iterator()
        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator(); // posso usar o "iterator()" pq "carrosPopulares.values()" me retorna uma "Collection"
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        // size()
        System.out.println("\nExiba a média dos consumos deste dicionário de carros: ");
        System.out.println(soma / carrosPopulares.size());

        // remove(), iterator()
        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        System.out.println("antes: " + carrosPopulares);
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while(iterator2.hasNext()) {
            if(iterator2.next() == 15.6) iterator2.remove();
        }
        System.out.println("depois: " + carrosPopulares);
        
        // clear()
        System.out.println("\nApague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        // isEmpty()
        System.out.println("\nConfira se o dicionário está vazio: ");
        System.out.println(carrosPopulares.isEmpty());

        // O MAP NAO CONSEGUE ACESSAR POR POSICOES, APENAS POR CHAVES ----------------------------------------------------
        // System.out.println("Exiba o terceiro modelo adicionado: ");

        // LINKED HASH MAP - ordem de insersao ---------------------------------------------------------------------------
        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String,Double> carrosPopulares_LinkedHashMap = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares_LinkedHashMap.toString());

        // TREE MAP - ordem natural --------------------------------------------------------------------------------------
        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String,Double> carrosPopulares_TreeMap = new TreeMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares_TreeMap);

        System.out.println();
    }
}
