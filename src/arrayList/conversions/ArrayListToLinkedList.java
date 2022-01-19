package arrayList.conversions;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(10.5);
        doubles.add(12.5);
        doubles.add(17.5);
        doubles.add(23.78);
        doubles.add(23.67);

        System.out.println(doubles);

        LinkedList<Double> doubles1 = new LinkedList<>(doubles);
        System.out.println(doubles1.getFirst());
        System.out.println(doubles1.getLast());


        ArrayList<Double> doubles2 = new ArrayList<>(doubles1);
        System.out.println(doubles2);










    }
}
