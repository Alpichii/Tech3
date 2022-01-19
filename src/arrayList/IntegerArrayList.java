package arrayList;

import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Number list is = " + numbers);
        numbers.add(3, 13);
        System.out.println(numbers);

        System.out.println("2nd element is = " + numbers.get(1));
        System.out.println("5th element is = " + numbers.get(4));

        numbers.set(1,50);
        numbers.set(4,100);
        System.out.println(numbers);
    }
}
