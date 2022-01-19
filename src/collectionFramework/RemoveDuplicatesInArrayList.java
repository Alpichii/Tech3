package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicatesInAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 5, 5, 10));

        //Remove duplicates from above list and print the result
        //[10, 20, 30, 5]

        System.out.println("\n-----OLD WAY-----\n");

        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer number : numbers) {
            if(!uniques.contains(number)) uniques.add(number);
        }

        System.out.println(uniques);


        System.out.println("\n-----NEW WAY with Collection-----\n");
        Set<Integer> numbersSet = new LinkedHashSet<>(numbers);
        numbers = new ArrayList<>(numbersSet);
        System.out.println(numbers);

    }
}