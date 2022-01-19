package arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        /*
        Store given elements below in an array
        "Mouse", "Computer", "Keyboard", "Pencil"

        And print the array

        Check if this array contains Computer
         */

        String[] elements = {"Mouse", "Computer", " Keyboard", "Pencil"};
        System.out.println("Array before sorting: " + Arrays.toString(elements));

        //1st way to check if array contains an element
        System.out.println("\n-----1st way of searching---------\n");
        boolean isThereComputer = false;

        for (String element : elements) {
            if(element.equals("Computer")){
                isThereComputer = true;
                break;
            }
        }

        if(isThereComputer){
            System.out.println("This array has \"Computer\" as an element");
        }
        else{
            System.out.println("This array does not have \"Computer\" as an element");
        }


        //2nd way to check if array contains an element
        System.out.println("\n-----2nd way of searching---------\n");

        //Before you use binary search, SORT YOUR ARRAY
        Arrays.sort(elements);
        System.out.println("Array after sorting: " + Arrays.toString(elements));

        int indexOfMouse = Arrays.binarySearch(elements, "Mouse"); // 0 1 2 3

        System.out.println("The index of Mouse = " + indexOfMouse);
        if(indexOfMouse >= 0){
            System.out.println("This array has \"Mouse\" as an element");
        }
        else{
            System.out.println("This array does not have \"Mouse\" as an element");
        }

    }
}
