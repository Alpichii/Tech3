package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Gent");
        cities.add("Rio");
        cities.add("Chicago");

        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);


        LinkedList<Integer> myNumber = new LinkedList<>();
        myNumber.add(7);
        myNumber.add(-2);
        myNumber.add(0);
        myNumber.add(15);
        myNumber.add(5);

        System.out.println(myNumber);

        Collections.sort(myNumber);
        System.out.println(myNumber);


    }
}
