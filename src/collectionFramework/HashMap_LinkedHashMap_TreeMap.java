package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMap_LinkedHashMap_TreeMap {
    public static void main(String[] args) {

        System.out.println("\n-----HashMap-----\n");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Burger", "Wendy's");
        hashMap.put("Coffee", "Dunkin");
        hashMap.put("Pancakes", "Wendy's");
        hashMap.put(null, "Object");
        hashMap.put("Chicken", null);
        hashMap.put(null, null);
        hashMap.put("Ice-Cream", null);
        hashMap.put("Ice-Cream", "Oberwise");

        System.out.println(hashMap.size());
        System.out.println(hashMap);

        /*
        No indexes allowed
        No insertion order
        Only one null key is allowed
        Multiple null values allowed
        No duplicates keys but duplicate values allowed
         */

        System.out.println("\n-----LinkedHashMap-----\n");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Burger", "Wendy's");
        linkedHashMap.put("Coffee", "Dunkin");
        linkedHashMap.put("Pancakes", "Wendy's");
        linkedHashMap.put(null, "Object");
        linkedHashMap.put("Chicken", null);
        linkedHashMap.put(null, null);
        linkedHashMap.put("Ice-Cream", null);
        linkedHashMap.put("Ice-Cream", "Oberwise");

        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap);

        /*
        No indexes allowed
        There is insertion order
        Only one null key is allowed
        Multiple null values allowed
        No duplicates keys but duplicate values allowed
         */

        System.out.println("\n-----TreeMap-----\n");
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Burger", "Wendy's");
        treeMap.put("Coffee", "Dunkin");
        treeMap.put("Pancakes", "Wendy's");
        //treeMap.put(null, "Object"); // NullPointerException
        treeMap.put("Chicken", null);
        //treeMap.put(null, null); // NullPointerException
        treeMap.put("Ice-Cream", null);
        treeMap.put("Ice-Cream", "Oberwise");

        System.out.println(treeMap.size());
        System.out.println(treeMap);

        /*
        No indexes allowed
        It sorts key-value pairs based on keys
        No null key is allowed
        Multiple null values allowed
        No duplicates keys but duplicate values allowed
         */

    }
}