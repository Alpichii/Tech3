package collectionFramework;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        List<String> countries1 = new ArrayList<>();
        ArrayList<String> countries2 = new ArrayList<>();

        //Countries-capitals
        Map<String, String> capitals1 = new HashMap<>();
        HashMap<String, String> capitals2 = new HashMap<>();

        System.out.println("\n--------put() method---------\n");
        //Use put() method to add elements
        capitals2.put("France", "Paris");
        capitals2.put("England", "London");
        capitals2.put("Ukraine", "Kiev");
        capitals2.put("Italy", "Rome");
        capitals2.put("Spain", "Madrid");

        System.out.println(capitals2);

        System.out.println("\n--------get() method---------\n");
        //Use get() or getOrDefault() methods to get elements
        System.out.println(capitals2.get("Italy")); // Rome
        System.out.println(capitals2.getOrDefault("Spain", "Barcelona")); //

        System.out.println("\n--------size() method---------\n");
        //Use size() to get how many key-value pairs you have
        System.out.println(capitals2.size()); // 5

        System.out.println("\n--------containsKey() or containsValue() methods---------\n");
        //Use containsKey() or containsValue() methods to check some keys or values exist
        System.out.println(capitals2.containsKey("Ukraine")); // true
        System.out.println(capitals2.containsKey("Belgium")); // false
        System.out.println(capitals2.containsValue("London")); // true
        System.out.println(capitals2.containsValue("Chicago")); // false

        System.out.println("\n--------remove() methods---------\n");
        //Use remove() method to remove some elements
        System.out.println(capitals2.remove("Spain")); // Madrid
        System.out.println(capitals2.size()); // 4

        System.out.println(capitals2.remove("Italy", "Milan")); // false
        System.out.println(capitals2.size()); // 4

        System.out.println(capitals2.remove("Italy", "Rome")); // true
        System.out.println(capitals2.size()); // 3

        System.out.println("\n--------Updating a value using key---------\n");
        System.out.println(capitals2);
        capitals2.put("France", "Nice");

        System.out.println(capitals2);

        System.out.println("\n--------keySet() method---------\n");
        //Use keySet() method to get all keys as a Set collection
        Set<String> countries = capitals2.keySet();
        System.out.println("All countries = " + countries);

        System.out.println("\n--------Looping keySet()---------\n");
        for (String country : countries) {
            System.out.println("Country = " + country);
            System.out.println("The capital city of " + country + " = " + capitals2.get(country));
        }

        System.out.println("\n--------values() method---------\n");
        //Use values() method to get all values as a Collection
        System.out.println("All capitals = " + capitals2.values());

        System.out.println("\n--------Looping values()---------\n");
        for (String capital : capitals2.values()) {
            System.out.println("Capital = " + capital);
        }

        System.out.println("\n--------entrySet() method---------\n");
        //Use entrySet() method to get all key-value pairs as a Set of Map.Entry
        System.out.println("All key value pairs = " + capitals2.entrySet());
    }
}













