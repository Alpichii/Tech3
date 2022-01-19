package arrayList.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        Store below elements in a collection and find unique elements and print them

        123, Apple, xyz, a, 123

        EXPECTED OUTPUT:
        [123, Apple, xyz, a]
         */

        String[] elements = {"123", "Apple", "xyz", "a", "123"};

        System.out.println("\n----1-way----\n");

        ArrayList<String> uniques = new ArrayList<>();

        for (String element : elements) {
            if(!uniques.contains(element)) uniques.add(element);
        }
        System.out.println(uniques);

    }
}
