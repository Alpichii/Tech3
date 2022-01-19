package projects;

import java.util.Scanner;

import static java.lang.Math.max;

public class ProjectExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------Task-1----------");
/*
Assume that you are given below Strings
String s1 = “24”, s2 = “5”;

Find result of the below expressions
{s1} + {s2} = 29
{s1} - {s2} = 19
{s1} / {s2} = 4.8
{s1} * {s2} = 120
{s1} % {s2} = 4

 */
        String s1 = "24", s2 = "5";
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = (num1 + num2);
        int subtraction = (num1 - num2);
        int division = (num1 / num2);
        int multiply = (num1 * num2);
        int remainder = (num1 % num2);


        System.out.println(s1 + " + " + s2 + " = " + sum + "\n"
                + s1 + " - " + s2 + " = " + subtraction + "\n"
                + s1 + " / " + s2 + " = " + (double)division + "\n"
                + s1 + " * " + s2 + " = " + multiply + "\n"
                + s1 + " % " + s2 + " = " + remainder);

        System.out.println("----------Task-2----------");











        System.out.println("----------Task-3----------");
/*
Write a program that generates 3 random numbers between 1 to 50 (1 and 50 are included)
Find and print each number in an ascending order
Ascending order is ordering from lowest to greatest

NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this task.

Test data: Assume below numbers are generated
Random number 1 = 43
Random number 2 = 7
Random number 3 = 30

Expected result:
Lowest number is = 7
Middle number is = 30
Greatest number is = 43

 */
        int number1 = (int)((Math.random()) * 36) + 1;
        int number2 = (int)((Math.random()) * 36) + 1;
        int number3 = (int)((Math.random()) * 36) + 1;

        int maxOfThree = max(max(number1, number2), number3);
        int minOFThree = Math.min(Math.min(number1, number2), number3);
        int middleOfThree = number3;

        if(number1 >= maxOfThree && number1 <= minOFThree){
           //max = number1;
        }
        else if(number2 > maxOfThree && number2 < minOFThree){
            //min = number2;
        }
        else{
            //mid = number3;
        }

        System.out.println("Max value = " + maxOfThree);
        System.out.println("Min value = " + minOFThree);
        System.out.println("Middle number is = " + middleOfThree);







        System.out.println("----------Task-4----------");
        System.out.println("----------Task-5----------");
        System.out.println("----------Task-6----------");
        System.out.println("----------Task-7----------");




























        System.out.println("End of the program!");
    }
}
