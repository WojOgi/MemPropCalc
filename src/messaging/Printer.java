package messaging;

import java.util.Map;

import static calculations.Service.calculateSelectivitesForAllPairs;

public class Printer {

    public void createATableOfPermeances(Map<String, Float> mapToPrint) {
        System.out.println("Table of gas ideal selectivities (-)");
        Map<String, Float> selectivities = calculateSelectivitesForAllPairs(mapToPrint);
        for (Map.Entry<String, Float> entry : selectivities.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();
    }

    public void createATableOfSelectivities(Map<String, Float> mapToPrint) {
        System.out.println("Table of gas permeances (GPU)");
        for (Map.Entry<String, Float> entry : mapToPrint.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();
    }
}
