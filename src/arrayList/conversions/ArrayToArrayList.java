package arrayList.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

        public class ArrayToArrayList {
            public static void main(String[] args) {
        /*
        Method 1: Conversion using loops - MANUAL WAY
        Create an array and put elements in it
        Create an ArrayList
        Loop through each element in the array and add them to ArrayList

        TASK-1
        Store below values in an ArrayList
        10, 20, 30, 40, 50, 60, 70, 80, 90
         */

                System.out.println("\n--------Method 1: Conversion using loops - MANUAL WAY--------\n");
                int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 1, 2, 3, 4};
                ArrayList<Integer> numbersList = new ArrayList<>();

                for (int number : numbers) {
                    numbersList.add(number);
                }

                System.out.println(numbersList);


        /*
        Method 2: Conversion using Arrays.asList()
        We can convert array to ArrayList using Arrays.asList() method.
        This method takes an array as an argument and converts it to an ArrayList
        Syntax:
        ArrayList<T> arrayList= new ArrayList<T>(Arrays.asList(arrayName));

         */

                System.out.println("\n--------Method 2: Conversion using Arrays.asList()--------\n");
                String[] names = {"Tom", "Joe", "John", "Ben", "Ally", "Leo", "Dave"};

                List<String> namesAsList = new ArrayList<>(Arrays.asList(names));

                System.out.println(namesAsList);


        /*
        Method 3: Collections.addAll() method
        We can convert array to ArrayList using Collections.addAll() method.
        This method takes 2 parameters (arrayList and array) and converts given array into the ArrayList

        Syntax:
        ArrayList<T> arrayList= new ArrayList<T>();
        Collections.addAll(arrayList, arrayName);
         */

                System.out.println("\n--------Method 3: Collections.addAll() method--------\n");

                Integer[] ages = {19, 20, 23, 25, 30, 35, 40, 27, 28};
                ArrayList<Integer> agesAsList = new ArrayList<>();
                Collections.addAll(agesAsList, ages);

                System.out.println(agesAsList);

            }
        }












