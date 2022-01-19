package collectionFramework;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> cities  = new Vector<>();
        cities.add("Tokyo");
        cities.add("Berlin");
        cities.add(null);
        cities.add(null);



        System.out.println(cities);
     }
}
