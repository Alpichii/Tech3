package recapHomeworks;

import java.util.Scanner;

public class Homework03Recap {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("\n----------Task1----------");
        System.out.println("Please enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The Average of the given 2 numbers is: " + (num1 + num2) / 2);


        System.out.println("\n----------Task2----------");
        System.out.println("Please enter two numbers");
        int num1t2 = input.nextInt();
        int num2t2 = input.nextInt();
        System.out.println("The product of the given 2 numbers is: " + num1t2 * num2t2);


        System.out.println("\n----------Task3----------");
        System.out.println("Please enter three numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        System.out.println("The " + n1 + " multiplied with " + n1 + " is  = " + n1 * n1);
        System.out.println("The " + n2 + " multiplied with " + n2 + " is  = " + n2 * n2);
        System.out.println("The " + n3 + " multiplied with " + n3 + " is  = " + n3 * n3);


        System.out.println("\n----------Task4----------");
        System.out.println("Please enter two numbers");
        int firstNumber = input.nextInt(), secondNumber = input.nextInt();
        System.out.println("The remainder of " + firstNumber + " % " + secondNumber + " = " + firstNumber % secondNumber);


        System.out.println("\n----------Task5----------");
        System.out.println("Please enter five numbers");
        int first = input.nextInt(), second = input.nextInt(), third = input.nextInt(), fourth = input.nextInt(), fifth = input.nextInt();
        int average = ((first + second + third + fourth + fifth) / 5);
        System.out.println("The average of given 5 numbers is: " + average);


        System.out.println("\n----------Task6----------");
        System.out.println("Please enter a number");
        int oneNumber = input.nextInt();

        /*
        int index = 1;
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        System.out.println(oneNumber + " * " + index +" = " + oneNumber * index++);
        */

        for (int i = 1; i < 10 ; i++) {
            System.out.println(oneNumber + " * " + i + " = " + oneNumber * i);
        }

        System.out.println("\n----------Task7----------");
        System.out.println("Please enter size of square");
        int size = input.nextInt();
        System.out.println("Perimeter of the square = " + size * 4);
        System.out.println("Area of the square = " + size * size);
    }
}
