package arrayList.linkedList;

import java.util.LinkedList;

public class UnderstandingLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Toyota");

        System.out.println(cars);

        System.out.println(cars.peekFirst()); // getFirst(), peekFirst()
        System.out.println("Cars list after peek = " + cars);

        System.out.println(cars.poll()); // gets first but also removes it
        System.out.println(cars.poll());
        System.out.println(cars.pollFirst()); // same as poll()
        System.out.println("Cars list after poll = " + cars);


        System.out.println(cars.pop());
        System.out.println(cars.pop());
        System.out.println("Cars list after pop = " + cars);
    }
}