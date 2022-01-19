package arrayList.practice;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(15);
        numbers.add(10);
        numbers.add(25);
        numbers.add(10);
        numbers.add(30);

        //Duplicates are 10 and 15
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.size()-1; i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(i).equals(numbers.get(j))){
                    if(!duplicates.contains(numbers.get(i))) duplicates.add(numbers.get(i));
                    break;
                }
            }
        }

        System.out.println(duplicates);

//first duplicated

        boolean isDuplicateFound = false;

        for (int i = 0; i < numbers.size()-1; i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(i).equals(numbers.get(j))){
                    System.out.println(numbers.get(i));
                    isDuplicateFound = true;
                    break;
                }
            }
            if(isDuplicateFound) break;
        }
        if(!isDuplicateFound) System.out.println("No Duplicates!!!");
    }
}