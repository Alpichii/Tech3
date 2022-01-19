package loops.whileLoop;

import java.util.Scanner;

public class PrintSumOfNumberByUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, how many numbers you want me to find sum of?");
        int numbers = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= numbers; i++) {
            System.out.println("Then, please enter number " + i);
            int newNumber = scanner.nextInt();
            sum += newNumber;
        }
        System.out.println("The sum of your " + numbers + " numbers is = " + sum);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hello, how many numbers you want me to find sum of?");
        int number = scanner.nextInt();
        int sum1 = 0;
        int i = 1;
        while(i <= numbers){
            System.out.println("Then, please enter number " + i);
            sum += scanner.nextInt();
            i++;
        }
        System.out.println("The sum of your " + number + " numbers is = " + sum1);




    }
}


       /*
Write a Java program that asks user to enter some numbers and find the sum of numbers given by user
Example program
Program: Please enter how many number you want to enter
User: 3

Program: Please enter number 1
User: 10

Program: Please enter number 2
User: 7

Program: Please enter number 3
User: 8

Expected output:
25
 */







