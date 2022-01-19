package mathClassMethods;

import java.util.Scanner;

public class FindMinAndMaxOf2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");
        int n1 = input.nextInt();
        int second = input.nextInt();

        System.out.println("The max number is = " + Math.max(n1, second) + "\nThe min number is = " + Math.min(n1, second));
/*
TASK-1
Write a program that asks user to enter 2 numbers
Find max number of these and print
Find min number of these and print

Example Program:
Program: Please enter 2 numbers
23
45

The max number is = 45
The min number is = 23
 */
       /*
       //-----Alper-------
        int n1 = (int)(Math.random() * 101);
        int num2 = (int)(Math.random() * 101);

        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + num2);
        System.out.println("The max number is = " + Math.max(n1, num2));
        System.out.println("The min Number is = " + Math.min(n1, num2));
    }
}
\
        */
        int first = (int) (Math.random() * 101);
        int second2 = (int) (Math.random() * 101);

        System.out.println("Number 1 = " + first);
        System.out.println("Number 2 = " + second2);
        System.out.println("The max number is = " + Math.max(first, second2));
        System.out.println("The min Number is = " + Math.min(first, second2));

    }
}