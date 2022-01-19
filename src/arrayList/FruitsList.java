package arrayList;

import java.util.ArrayList;
import java.util.List;

public class FruitsList {
    public static void main(String[] args) {

/*
        Store Banana, Apple, Pineapple, Strawberry, Blueberry, Apple
        Print it
         */

                List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Blueberry");
        fruits.add("Apple");

        System.out.println(fruits);

        //indexOf() and lastIndexOf() methods
        System.out.println("\n------INDEX OF METHODS---------\n");
        System.out.println(fruits.indexOf("Apple")); // 1
        System.out.println(fruits.lastIndexOf("Apple")); // 5
        System.out.println(fruits.indexOf("apple")); // -1


        //contains() method - check if list contains "Grapes"
        System.out.println("\n------CONTAINS METHOD---------\n");
        System.out.println(fruits.contains("Grapes")); // false
        System.out.println(fruits.contains("Pineapple")); //true
        System.out.println(fruits.contains("apple")); //false
        System.out.println(fruits.get(2).contains("apple")); //true

        //remove() method removes the first found element
        System.out.println("\n------REMOVING ELEMENTS---------\n");
        System.out.println(fruits.remove("Apple")); //false
        System.out.println(fruits.remove(0)); //Banana
        System.out.println(fruits);


        //Remove everything
        System.out.println("\n------CLEARING LIST---------\n");
        fruits.clear();
        System.out.println("Size of list after clearing = " + fruits.size());

    }
}
