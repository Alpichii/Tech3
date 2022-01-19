package arrayList.conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        /*
        Method 1: Conversion using loops - MANUAL WAY
        Create an ArrayList and add elements in it
        Create an array with same size as ArrayList
        Loop through each element in the ArrayList and assign these into array
         */

        List<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Ford");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mercedes");

        System.out.println("\n--------1st way-------\n");
        String[] carsAsArray1 = new String[cars.size()];

        for (int i = 0; i < cars.size(); i++) {
            carsAsArray1[i] = cars.get(i);
        }

        System.out.println(Arrays.toString(carsAsArray1));

        /*
        Method 2: Conversion using Arrays.asList()
        We can convert ArrayList to an array using toArray() method. This method will return an Object array

        Syntax:
        Object[] array = arrayList.toArray();
         */

        System.out.println("\n--------2nd way-------\n");
        Object[] carsAsArray2 = cars.toArray();

        System.out.println(carsAsArray2[2]); //
        System.out.println(Arrays.toString(carsAsArray2));
    }
}
