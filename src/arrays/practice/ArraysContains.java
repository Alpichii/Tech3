package arrays.practice;

import java.util.Arrays;

public class ArraysContains {
    public static void main(String[] args) {

/*
TASK-1
Find out if fruits array below contains blueberry
If it contains, then print true
Else, print false
NOTE: do not use binarySearch() method
 */

        System.out.println("\n---TASK-1---\n");

        String[] fruits = {"apple", "banana", "strawberry", "apple", "blueberry", "pineapple" , "orange"};

        Arrays.sort(fruits);
        System.out.println(Arrays.binarySearch(fruits, "apple") >= 0);

        /*
        TASK-2
        Find out if fruits array above contains grapes
        If it contains, then print true
        Else, print false
        NOTE: use binarySearch() method
         */

        System.out.println("\n---TASK-2---\n");
        Arrays.sort(fruits);

        System.out.println(Arrays.binarySearch(fruits, "grapes") >= 0);
/*
TASK-3
Find out if characters array below contains T
If it contains, then print true
Else, print false
NOTE: do not use binarySearch() method
 */

        char[] characters = {'A', 'b', '&', '8', '@'};

        /*
TASK-4
Find out if characters array above contains 8
If it contains, then print true
Else, print false
NOTE: use binarySearch() method
 */

        System.out.println("\n---TASK-4---\n");

        Arrays.sort(characters);
        System.out.println(Arrays.binarySearch(characters, '8') >= 0);














    }
}
