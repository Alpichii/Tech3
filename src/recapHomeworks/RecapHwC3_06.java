package recapHomeworks;

import java.util.Scanner;

public class RecapHwC3_06 {
    public static void main(String[] args) {
        System.out.println("\n------------Task1-------------\n");
        int number1 = (int) (Math.random() * 11); // 0-10 2
        int number2 = (int) (Math.random() * 11);
        int number3 = (int) (Math.random() * 11);
        int number4 = (int) (Math.random() * 11);


        int greatest = Math.max(Math.max(number1, number2), Math.max(number3, number4));
        int smallest = Math.min(Math.min(Math.min(number1, number2), number3), number4);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        System.out.println("Absolute difference of " + number1 + " with 5 is = " + Math.abs(number1 - 5) + "\n"
                + "Absolute difference of " + number2 + " with 5 is = " + Math.abs(number2 - 5) + "\n"
                + "Absolute difference of " + number3 + " with 5 is = " + Math.abs(number3 - 5) + "\n"
                + "Absolute difference of " + number4 + " with 5 is = " + Math.abs(number4 - 5) + "\n"
                + "Greatest number is = " + greatest + "\n"
                + "Smallest number is = " + smallest);

        System.out.println("\n------------Task2-------------\n");
        int num1 = (int) (Math.random() * 101) - 50;
        int num2 = (int) (Math.random() * 101) - 50;
        int num3 = (int) (Math.random() * 101) - 50;
        int num4 = (int) (Math.random() * 101) - 50;
        int num5 = (int) (Math.random() * 101) - 50;
        int num6 = (int) (Math.random() * 101) - 50;
        int num7 = (int) (Math.random() * 101) - 50;
        int num8 = (int) (Math.random() * 101) - 50;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);

        int big = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5), num6), num7), num8);
        int small = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5), num6), num7), num8);

        System.out.println("Greatest number is = " + big);
        System.out.println("Smallest number is = " + small);
        System.out.println("Average of 8 numbers is = " + (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8) / 8);
        System.out.println("Absolute difference between smallest and greatest is = " + (big - small));

        System.out.println("3rd number is positive = " + (num3 > 0));
        System.out.println("5th number is negative = " + (num5 < 0));
        System.out.println("There is at least one zero among those numbers is = " + (num1 == 0 || num2 == 0 || num3 == 0 || num4 == 0 || num5 == 0 || num6 == 0 || num7 == 0 || num8 == 0));


        System.out.println("\n------------Task3-------------\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 7 numbers between 0 to 50");

        int enteredNum1 = input.nextInt();
        int enteredNum2 = input.nextInt();
        int enteredNum3 = input.nextInt();
        int enteredNum4 = input.nextInt();
        int enteredNum5 = input.nextInt();
        int enteredNum6 = input.nextInt();
        int enteredNum7 = input.nextInt();

        if (enteredNum1 >= 0 && enteredNum1 <= 50 || enteredNum2 >= 0 && enteredNum2 <= 50 || enteredNum3 >= 0 && enteredNum3 <= 50 ||
                enteredNum4 >= 0 && enteredNum4 <= 50 || enteredNum5 >= 0 && enteredNum5 <= 50 || enteredNum6 >= 0 && enteredNum6 <= 50 ||
                enteredNum7 >= 0 && enteredNum7 <= 50) {
            System.out.println("Number 1 = " + enteredNum1 + "\nNumber 2 = " + enteredNum2 + "\nNumber 3 = " + enteredNum3
                    + "\nNumber 4 = " + enteredNum4 + "\nNumber 5 = " + enteredNum5 + "\nNumber 6 = " + enteredNum6 +
                    "\nNumber 7 = " + enteredNum7);
        } else {
            System.out.println("Please enter 7 numbers between 0 to 50");
        }

        int greatestT3 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(enteredNum1, enteredNum2),
                enteredNum3), enteredNum4), enteredNum5), enteredNum6), enteredNum7);
        int smallestT3 = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(enteredNum1, enteredNum2),
                enteredNum3), enteredNum4), enteredNum5), enteredNum6), enteredNum7);
        int aveNums = (enteredNum1 + enteredNum2 + enteredNum3 + enteredNum4 + enteredNum5 + enteredNum6 + enteredNum7) / 7;

        System.out.println("Greatest number is = " + greatestT3);
        System.out.println("Smallest number is = " + smallestT3);
        System.out.println("Average of 7 numbers is = " + aveNums);

        System.out.println("First number is greater than or equal to 10 is = " + (enteredNum1 >= 10));
        System.out.println("Last number is less than or equal to 40 is = " + (enteredNum7 <= 40));
        //Print true if both first and last numbers are greater than 25, false otherwise
        System.out.println("First and last numbers are greater than 25 = " + (enteredNum1 > 25 && enteredNum7 > 25));

        //Print true if any number is 0 or if any number is 50
        System.out.println("There is at least one zero or 50 = " + (enteredNum1 == 0 || enteredNum1 == 50 ||
                enteredNum2 == 0 || enteredNum2 == 50 ||
                enteredNum3 == 0 || enteredNum3 == 50 ||
                enteredNum4 == 0 || enteredNum4 == 50 ||
                enteredNum5 == 0 || enteredNum5 == 50 ||
                enteredNum6 == 0 || enteredNum6 == 50 ||
                enteredNum7 == 0 || enteredNum7 == 50));

        System.out.println("There is no number between 40 and 50 = " + (enteredNum1 < 40 && enteredNum2 < 40 &&
                enteredNum3 < 40 && enteredNum4 < 40 && enteredNum5 < 40 && enteredNum6 < 40 && enteredNum7 < 40));

        System.out.println("\n------------Task4-------------\n");
        int num1T4 = (int) (Math.random() * 101);
        int num2T4 = (int) (Math.random() * 101);
        int num3T4 = (int) (Math.random() * 101);

        System.out.println(num1T4);
        System.out.println(num2T4);
        System.out.println(num3T4);


        System.out.println("Numbers greater than 25 = " + (num1T4 > 25 && num2T4 > 25 && num3T4 > 25));


        System.out.println("\n------------Task5-------------\n");


        System.out.println("Please enter a number between 1 to 7");

        int inputNumber = input.nextInt();

        if (!(inputNumber >= 1 && inputNumber <= 7)) {
            System.out.println("You enter invalid number!!!" + "\n" + "Please enter number between 1 to 7");
        }
        switch (inputNumber) {
            case 1:
                System.out.println("The number entered returns Monday");
                break;
            case 2:
                System.out.println("The number entered returns Tuesday");
                break;
            case 3:
                System.out.println("The number entered returns Wednesday");
                break;
            case 4:
                System.out.println("The number entered returns Thursday");
                break;
            case 5:
                System.out.println("The number entered returns Friday");
                break;
            case 6:
                System.out.println("The number entered returns Saturday");
                break;
            default:
                System.out.println("The number entered returns Sunday");
        }

        System.out.println("\n------------Task6-------------\n");


        System.out.println("Please enter a number between -10 to 10");

        int enteredNumT6 = input.nextInt();

        if (enteredNumT6 < -10 || enteredNumT6 > 10) System.out.println("You enter invalid number!!!" + "\n" + "Please enter number between -10 to 10");
        else if (enteredNumT6 == 0) System.out.println("Number entered is ZERO");
        else if (enteredNumT6 > 0) System.out.println("Number entered is POSITIVE");
        else System.out.println("Number entered is NEGATIVE");


        if (enteredNumT6 % 2 != 0) System.out.println("Number entered is ODD");
        else System.out.println("Number entered is EVEN");

        System.out.println("\n------------Task7-------------\n");


        System.out.println("Please enter your test results");
        int test1Score = input.nextInt();
        int test2Score = input.nextInt();
        int test3Score = input.nextInt();

        int averageOfTest = ((test1Score + test2Score + test3Score) / 3);
        if (averageOfTest >= 70) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        System.out.println("\n------------Task8-------------\n");
        Scanner t8 = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");

        int inputNumber1 = t8.nextInt();
        int inputNumber2 = t8.nextInt();
        int inputNumber3 = t8.nextInt();

        if ((inputNumber1 == inputNumber2 && inputNumber1 == inputNumber3)) {
            System.out.println("TRIPLE MATCH");
        } else if (inputNumber1 == inputNumber2 || inputNumber1 == inputNumber3 || inputNumber2 == inputNumber3) {
            System.out.println("double match ");
        } else {
            System.out.println("NO MATCH");
        }

    }
}
