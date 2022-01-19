package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class RecapArrayListAndLinkedList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(1);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);

        numbers.remove(null);

        System.out.println(numbers);

        System.out.println("\n========LinkedList Recap==========\n");
        LinkedList<String> names =  new LinkedList<>(Arrays.asList("Alice", "Max", "Leo", "null", "null"));
        System.out.println(names);
     }
}
