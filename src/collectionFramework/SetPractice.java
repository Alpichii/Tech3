package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class SetPractice {
    public static void main(String[] args) {
        //SET - LinkedHashSet - HashSet - TreeSet

        System.out.println("\n----------Learning HashSet----------\n");
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Germany");
        countries.add("Ukraine");
        countries.add("Spain");
        countries.add("France");
        countries.add("US");
        countries.add("US");
        countries.add(null);
        countries.add(null);
        countries.add(null);
        countries.add(null);

        System.out.println("Countries ArraysList = " + countries);
        System.out.println(countries.get(0));
        System.out.println(countries.indexOf("France"));

        HashSet<String> countriesSet = new HashSet<>();
        countriesSet.add("Germany");
        countriesSet.add("Ukraine");
        countriesSet.add("Spain");
        countriesSet.add("France");
        countriesSet.add("US");
        countriesSet.add("US");
        countriesSet.add(null);
        countriesSet.add(null);
        countriesSet.add(null);
        countriesSet.add(null);

        System.out.println("Countries HashSet = " + countriesSet);



    }
}
