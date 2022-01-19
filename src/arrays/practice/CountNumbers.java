package arrays.practice;

import java.util.Arrays;

public class CountNumbers {
    public static void main(String[] args) {
/*
        TASK-1
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */
        System.out.println("\n----------Task1----------");
        int[] nums = {10, -3, -7, 0, 0, 7, 22};
        for (int name : nums) {
            System.out.println(name);
        }

        /*
        TASK-2
        Use the above array and
        Print all elements one by one in ONE LINE (space separator) using FOR I LOOP
        RESULT:
        10 -3 -7 0 0 7 22
         */
        System.out.println("\n----------Task2----------");
        for(int elements2: nums){
            if(elements2 != nums[nums.length-1]){
                System.out.print(elements2 + " ");
            } else System.out.print(elements2);
        }


        System.out.println("\n----------Task3----------");
/*
TASK-3
Use the above array and
Print all elements that are greater than zero  one by one separate lines using FOR EACH LOOP
RESULT:
10
7
22
 */        //int[] nums1 = {10, -3, -7, 0, 0, 7, 22};

        for (int elements3: nums) {
            if ( elements3 > 0 ) System.out.println(elements3);
        }

        System.out.println("----------Task4----------");/*
TASK-4
Use the above array and
count how many zeros you have in the array using FOR EACH LOOP
RESULT:
2
 */
        int zeros = 0;
        for (int elements4: nums) {
            if(elements4 == 0) zeros++;
        }
        System.out.println(zeros);

        System.out.println("----------Task5----------");/*
TASK-5
Use the above array and
10, -3, -7, 0, 0, 7, 22
count how many positive and negative numbers you have in the array using FOR I LOOP
RESULT:
Positives = 5
Negatives = 2
 */

        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < nums.length; i++) {
            if( nums[i] >= 0){
                positives++;
            } else { negatives++; }
        }
        System.out.println("Positives = " + positives);
        System.out.println("Negatives = " + negatives);

        System.out.println("----------Task6----------");/*
TASK-6
Use the above array and
10, -3, -7, 0, 0, 7, 22
count how many even and odd numbers you have in the array using FOR EACH LOOP
RESULT:
Even numbers = 4
Odd numbers = 3
 */

        int even = 0;
        int odd = 0;
        for (int elements6: nums) {
            if(elements6 % 2 == 0){
                even++;
            } else{ odd++; }
        }
        System.out.println("Even numbers = " + even );
        System.out.println("Odd numbers = " + odd );

        System.out.println("----------Task7----------");/*
TASK-7
Use the above array and
10, -3, -7, 0, 0, 7, 22
find product of all non-zero numbers in the array using FOR EACH LOOP
RESULT:
32340
PSEUDO CODE
1.Create a variable to store product
2.Loop through each element and multiply them and assign to product variable - DO NOT multiply 0
3.After your loop, print the result product
 */

        int product = 1;
        for(int elements7: nums){
            if(elements7 != 0){
                product *= elements7;
            }
        }
        System.out.println("Product is = \n" + product);

        System.out.println("----------Task8----------");/*
TASK-8
Use the above array and
10, -3, -7, 0, 0, 7, 22
find product of all non-zero numbers in the last 3 elements of the array

RESULT:
154
 */
        int products = 1;
        for (int i = nums.length-3; i < nums.length; i++) {
            if(nums[i] != 0) products *= nums[i];
        }
        System.out.println("Product of last 3 = " + products);

        Arrays.sort(nums);
        System.out.println("Sorted array = " + Arrays.toString(nums));
            }
        }
