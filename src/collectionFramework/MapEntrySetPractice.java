package collectionFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEntrySetPractice {
    public static void main(String[] args) {
        Map<String, String> favorites = new TreeMap<>();
        favorites.put("Day", "Friday");
        favorites.put("City", "San Diego");
        favorites.put("Color", "Red");
        favorites.put("Car", "Mercedes");
        favorites.put("Pet", "Turtle");

        //Print your map
        System.out.println("\n------Print map-----\n");
        System.out.println("Favorites map = " + favorites);

        //Keys - keySet()
        System.out.println("\n------Practice keySet()-----\n");
        System.out.println("All keys = " + favorites.keySet());
        for (String s : favorites.keySet()) {
            System.out.println("My favorite \"" + s + "\" is = \"" + favorites.get(s) + "\"");
        }

        //Values - values()
        System.out.println("\n------Practice values()-----\n");
        System.out.println("All value = " + favorites.values());

        //Entry Set - entrySet()
        System.out.println("\n------Practice entrySet()-----\n");
        System.out.println("All entries = " + favorites.entrySet());

        Set<Map.Entry<String, String>> entries = favorites.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("My favorite \"" + entry.getKey() + "\" is = \"" + entry.getValue() + "\"");
        }


    }
}