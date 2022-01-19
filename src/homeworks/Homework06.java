package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------Task-1----------");

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int number4 = (int) (Math.random() * 10);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        int maxOfRandom = Math.max(Math.max(Math.max(number1, number2), number3), number4);
        int minOfRandom = Math.min((Math.min(Math.min(number1, number2), number3)), number4);

        System.out.println("Absolute difference of " + number1 + " with 5 is = " + (number1 - 5) + "\n" +
                "Absolute difference of " + number2 + " with 5 is = " + (number4 - 5) + "\n" +
                "Absolute difference of " + number3 + " with 5 is = " + (number3 - 5) + "\n" +
                "Absolute difference of " + number4 + " with 5 is = " + (number1 - 5) + "\n" +
                "Greatest number is = " + maxOfRandom + "\n" +
                "Smallest number is = " + minOfRandom);

        System.out.println("----------Task-2----------");

        int num1 = (int) (Math.random() * 100) - 50;
        int num2 = (int) (Math.random() * 100) - 50;
        int num3 = (int) (Math.random() * 100) - 50;
        int num4 = (int) (Math.random() * 100) - 50;
        int num5 = (int) (Math.random() * 100) - 50;
        int num6 = (int) (Math.random() * 100) - 50;
        int num7 = (int) (Math.random() * 100) - 50;
        int num8 = (int) (Math.random() * 100) - 50;

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        System.out.println("Number 4 = " + num4);
        System.out.println("Number 5 = " + num5);
        System.out.println("Number 6 = " + num6);
        System.out.println("Number 7 = " + num7);
        System.out.println("Number 8 = " + num8);

        int maxNum = Math.max((Math.max((Math.max((Math.max((Math.max((Math.max(Math.max(num1, num2), num3)),
                num4)), num5)), num6)), num7)), num8);
        System.out.println("Greatest number is = " + maxNum);
        int minNum = Math.min((Math.min((Math.min((Math.min((Math.min((Math.min(Math.min(num1, num2), num3)),
                num4)), num5)), num6)), num7)), num8);
        System.out.println("Smallest number is = " + minNum);
        int aveOfEight = (num1 + number2 + num3 + num4 + num5 + num6 + num7 + num8) / 8;
        System.out.println("Average of 8 numbers is = " + aveOfEight);
        int difOfMinMax = minNum - maxNum;
        System.out.println("Absolute difference between smallest and greatest is = " + difOfMinMax);
        int positive = num3;
        int negative = num5;

        if (num3 > 0) {
            System.out.println("3rd number is positive is = true");
        } else if (num3 < 0) {
            System.out.println("3rd number is negative is = true");
        } else {
            System.out.println("3rd number is positive false");
        }
        if (num5 < 0) {
            System.out.println("5th number is negative = true");
        } else if (num5 > 0) {
            System.out.println("5th number is positive true");
        } else {
            System.out.println("5th number is positive false");
        }
        if (num1 == 0 || num2 == 0 || (int) num3 == 0 || (int) num4 == 0 || (int) num5 == 0 || (int) num6 == 0 || (int) num7 == 0 || (int) num8 == 0) {
            System.out.println("There is at least one zero among those numbers is = " + true);
        } else {
            System.out.println("There is at least one zero among those numbers is = " + false);
        }

        System.out.println("----------Task-3----------");

        System.out.println("Please enter 7 numbers between 0 and 50");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        int n6 = input.nextInt();
        int n7 = input.nextInt();
        System.out.println("Number 1 = " + n1 + "\nNumber 2 = " + n2 + "\nNumber 3 = " + n3 + "\nNumber 4 = " + n4
                + "\nNumber 5 = " + n5 + "\nNumber 6 = " + n6 + "\nNumber 7 = " + n7);

        System.out.println("Greatest number is = " + Math.max(Math.max(Math.max(Math.max((Math.max((Math.max(n1, n2)),
                n3)), n4), n5), n6), n7));
        System.out.println("Smallest number is = " + Math.min(Math.min(Math.min(Math.min((Math.min((Math.min(n1, n2)),
                n3)), n4), n5), n6), n7));

        System.out.println("Average of 7 numbers is " + (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7);
        if (n1 >= 10) {
            System.out.println("First number is greater than or equal to 10 is = " + "true");
        } else
            System.out.println("First number is greater than or equal to 10 is = " + "false");

        if (n7 <= 40) {
            System.out.println("Last number is less than or equal to 40 is = " + true);
        } else {
            System.out.println("Last number is less than or equal to 40 is = " + false);
        }
        if (n1 >= 25 || n7 >= 25) {
            System.out.println("Both first and last numbers are greater than 25 is = " + true);
        } else {
            System.out.println("Both first and last numbers are greater than 25 is = " + false);
        }
        if (n1 == 0 && n1 == 50 || n2 == 0 && n2 == 50 || n3 == 0 && n3 == 50 || n4 == 0 && n4 == 50
                || n5 == 0 && n5 == 50 || n6 == 0 && n6 == 50 || n7 == 0 && n7 == 50) {
            System.out.println("At least one of those numbers is 0 or 50 is = " + true);
        } else {
            System.out.println("At least one of those numbers is 0 or 50 is = " + false);
        }
        if (n1 >= 40 && n1 <= 50 || n2 >= 40 && n2 <= 50 || n3 >= 40 && n3 <= 50 || n4 >= 40 && n4 <= 50 || n5 >= 40 && n5 <= 50 ||
                n6 >= 40 && n6 <= 50 || n7 >= 40 && n7 <= 50) {
            System.out.println("There is no number between 40 and 50 is = " + true);
        } else {
            System.out.println("There is no number between 40 and 50 is = " + false);
        }

        System.out.println("----------Task-4----------");
        int r1 = (int) (Math.random() * 101);
        int r2 = (int) (Math.random() * 101);
        int r3 = (int) (Math.random() * 101);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        if (r1 >= 25 && r2 >= 25 && r3 >= 25) {
            System.out.println("All number are greater than 25 " + true);
        } else {
            System.out.println("All number are greater than 25 " + false);
        }

        System.out.println("----------Task-5----------");

        System.out.println("Please enter number between 1 thru 7");
        int standFor = input.nextInt();

        switch (standFor) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }

        System.out.println("----------Task-6----------");

        System.out.println("Please enter a number between -10 to 10");
        double validNum = input.nextDouble();

        if (validNum > 0) {
            System.out.println("Number entered is POSITIVE");
        } else if (validNum < 0) {
            System.out.println("Number entered is NEGATIVE");
        }
        if (validNum == 0) {
            System.out.println("Number entered is ZERO");
        }
        if (validNum == 0 || validNum == 2 || validNum == 4 || validNum == 6 || validNum == 8 || validNum == 10
                || validNum == -2 || validNum == -4 || validNum == -6 || validNum == -8 || validNum == -10) {
            System.out.println("Number entered is EVEN");
        } else {
            System.out.println("Number entered is ODD");
        }

        System.out.println("----------Task-7----------");

        System.out.println("Please enter your exams results");
        int exam1 = input.nextInt();
        int exam2 = input.nextInt();
        int exam3 = input.nextInt();
        int aveOfExams = ((exam1 + exam2 + exam3) / 3);

        if (aveOfExams >= 70) {
            System.out.println("PASSED");
        } else if (aveOfExams <= 60) {
            System.out.println("FAILED");
        }

        System.out.println("----------Task-8----------");
        System.out.println("please enter 3 numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x == y && y == z && z == x) {
            System.out.println("TRIPLE MATCH");
        } else if ((x == y || y == z || x == z) && (x != y || y != z || x != z)) {
            System.out.println("DOUBLE MATCH");
        } else {
            System.out.println("NO MATCH");
        }
    }
}
