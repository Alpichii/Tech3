package arrayList;

import java.util.ArrayList;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        //How to add elements to your arraylist
        names.add("Olha");
        names.add("Seda");
        names.add("Jafeth");

        //How to add element in a specific index
        names.add(1, "Viktoriya");

        //How to update and element in an arraylist
        names.set(0, "Feyza");

        //How to print you arraylist
        System.out.println(names);

        //How to get size of your arraylist
        int size = names.size();
        System.out.println("Size of the arrayList is = " + size);

        //How to get element in a specific index
        System.out.println(names.get(1));
    }
}