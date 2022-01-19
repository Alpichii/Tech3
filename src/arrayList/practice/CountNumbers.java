package arrayList.practice;

import java.util.ArrayList;

public class CountNumbers {
    public static void main(String[] args) {
        System.out.println("\n-------------TASK1--------------");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(15);
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(-10);

        System.out.println("The numbers are = " + numbers);
        System.out.println("Size is = " + numbers.size());

        System.out.println("\n-------------TASK2--------------");

        int evenNumbers = 0;
        int countEvens = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println("Even numbers are = " + numbers.get(i));
            }
            countEvens++;
        }
        System.out.println("This list has " + countEvens + " even numbers");

        System.out.println("\n-------------TASK3--------------");

        int countPositive = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 0) {
                countPositive++;
            }
        }
            System.out.println("There are " + numbers.size() + " positive numbers in this list");
    }
}
