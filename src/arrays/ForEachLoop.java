package arrays;

import java.lang.reflect.Array;

public class ForEachLoop {
    public static void main(String[] args) {

        String[] cities = {"Chicago", "Texas", "California", "Florida", "Istanbul"};
            System.out.println(cities.length);


        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        for (String city : cities) {
            System.out.println(city);

        }




    }
}
