package arrayList.practice;

import java.util.ArrayList;
import java.util.List;

public class AddLists {
    public static void main(String[] args) {

        /*
        Imagine you have 2 lists as below
        1 2 3 4 5
        6 7 8 9 10

        Print first list
        Print second list
        Print combined list

        EXPECTED OUTPUT:
        [1, 2, 3, 4, 5]
        [6, 7, 8, 9, 10]
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         */

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);


        System.out.println("\n---------1st way----------\n");
        List<Integer> result1 = new ArrayList<>();
        result1.addAll(numbers1);
        result1.addAll(numbers2);

        System.out.println(result1);


        System.out.println("\n---------2nd way----------\n");
        List<Integer> result2 = new ArrayList<>();

        for (Integer number : numbers1) {
            result2.add(number);
        }

        for (Integer number : numbers2) {
            result2.add(number);
        }

        System.out.println(result2);



        System.out.println("\n---------3rd way----------\n");
        List<Integer> result3 = new ArrayList<>();

        for (int i = 0; i < numbers1.size(); i++) {
            result3.add(numbers1.get(i));
        }

        for (int i = 0; i < numbers2.size(); i++) {
            result3.add(numbers2.get(i));
        }

        System.out.println(result3);



        System.out.println("\n---------4th way----------\n");
        List<Integer> result4 = new ArrayList<>();

        for (int i = 0; i < numbers2.size(); i++) {
            result4.add(numbers2.get(i));
        }

        //second loop here do not use sort
        //1 index 0
        //2 index 1
        //5 index 4

        /*
        for (int i = 0; i < numbers1.size(); i++) {
            result4.add(i, numbers1.get(i));
        }
         */

        for (int i = numbers1.size()-1; i >= 0; i--) {
            result4.add(0, numbers1.get(i));
        }

        System.out.println(result4);
    }
}