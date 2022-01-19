package arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

/*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        x
        Y
        Print the all array
         */

        System.out.println("\n----------TASK-1-----------\n");
        char[] characters = {'#', '$', '5', 'A', 'x', 'Y'};
        System.out.println(Arrays.toString(characters));




        /*
        TASK-2
        Print first and last characters
         */
        System.out.println("\n----------TASK-2-----------\n");
        System.out.println(characters[0]);
        System.out.println(characters[characters.length-1]);


        /*
        TASK-3
        Print each element one by one with message below
        Element 1 = {element}
        Element 2 = {element}
        Element 3 = {element}
        Element 4 = {element}
        Element 5 = {element}
        Element 6 = {element}
         */

        System.out.println("\n----------TASK-3-----------\n");
        for (int i = 0; i <= characters.length-1; i++) {
            System.out.println("Element " + (i+1) + " = " + characters[i]);
        }


        /*
        TASK-4
        Print 3rd and 5th element

        EXPECTED OUTPUT:
        3rd element is = 5
        5th element is = x
         */

        System.out.println("\n----------TASK-4-----------\n");
        System.out.println("3rd element is = " + characters[2]);
        System.out.println("5th element is = " + characters[4]);
    }
}
