package arrayList.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllDuplicates {
    public static void main(String[] args) {
        /*
        TASK-1

        10
        20
        30
        40
        20
        10
        50
        20

        Remove all occurrences of duplicates
        [30, 40, 50]

         */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);

        /*
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.size() ; i++) {
            for (int j = i +1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    if (!duplicates.contains(numbers.get(i))) duplicates.add(numbers.get(i));
                    break;
                }
            }
        }

        numbers.removeAll(duplicates);
        System.out.println(numbers);
         */




        /*
        TASK-2
        Remove duplicates but keep only one occurrence of duplicate
        Only unique values in the list

        [10, 20, 30, 40, 50]
         */

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer number : numbers) {
            if(!uniques.contains(number)) uniques.add(number);
        }

        System.out.println(numbers);
        System.out.println(uniques);

    }
}