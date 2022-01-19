package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMap_HashTable {
    public static void main(String[] args) {
        System.out.println("\n------HashMap-----\n");
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, null);
        numbers.put(null, null);
        numbers.put(null, null);
        numbers.put(2, null);
        numbers.put(null, 5);
        numbers.put(5, 12);
        numbers.put(6, 12);
        numbers.put(7, 12);

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("\n------HashTable-----\n");
        Hashtable<Integer, Integer> numbersHashtable = new Hashtable<>();
        //numbersHashtable.put(1, null); // NullPointerException
        //numbersHashtable.put(null, null); // NullPointerException
        //numbersHashtable.put(null, null); // NullPointerException
        //numbersHashtable.put(2, null); // NullPointerException
        //numbersHashtable.put(null, 5); // NullPointerException
        numbersHashtable.put(5, 12);
        numbersHashtable.put(6, 12);
        numbersHashtable.put(7, 12);

        System.out.println(numbersHashtable);
        System.out.println(numbersHashtable.size());
    }
}