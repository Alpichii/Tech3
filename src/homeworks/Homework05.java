package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {

        //////////////////////TASK-1/////////////////////////
        System.out.println("\n----------Task-1----------\n");
        String s1 = "5", s2 = "10", s3 = "12", s4 = "3";

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        int n4 = Integer.parseInt(s4);

        System.out.println("Sum of " + n1 + " and " + n2 + " is = " + (n1 + n2) +
                "\nProduct of " + n1 + " and " + n2 + " is = " + (n1 * n2) +
                "\nDivision of " + n1 + " and " + n2 + " is = " + ((double)n1 / (double)n2) +
                "\nSubtraction of " + n1 + " and " + n2 + " is = " + (n1 - n2) +
                "\nRemainder of " + n1 + " and " + n2 + " is = " + (n1 % n2) + "\n" +
                "\nSum of " + n3 + " and " + n4 + " is = " + (n3 + n4) +
                "\nProduct of " + n3 + " and " + n4 + " is = " + (n3 * n4) +
                "\nDivision of " + n3 + " and " + n4 + " is = " + (n3 / n4) +
                "\nSubtraction of " + n3 + " and " + n4 + " is = " + (n3 - n4) +
                "\nRemainder of " + n3 + " and " + n4 + " is = " + (n3 % n4));


        //////////////////////TASK-2/////////////////////////
        System.out.println("\n----------Task-2----------\n");
        String str1 = "200";
        String str2 = "-50";

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println("The greatest value is = " + Math.max(i1, i2) + "\nThe smallest value is = " + (Math.min(i1, i2)) +
                "\nThe average of those is = " + ((i1 + i2) / 2) + "\nThe absolute difference of them = " + Math.abs(i1 - i2));


        //////////////////////TASK-3/////////////////////////
        System.out.println("\n----------Task-3----------\n");
        double quarters = 0.25;
        double dime = 0.10;
        double nickels = 0.05;
        double penny = 0.01;
        double dailySave = (3 * quarters) + (1 * dime) + (2 * nickels) + (1 * penny);

        System.out.println((int)(24 / dailySave) + "\n" + (int)(168 / dailySave) +
                "\n" + "$" + (double)(Math.round((30 * dailySave) * 10)) / 10 + "\n" + "$" + (150 * dailySave));


        //////////////////////TASK-4/////////////////////////
        System.out.println("\n----------Task-4----------\n");
        double targetValue = 1250;
        double dailySave2 = 62.5;

        System.out.println((int) (targetValue / dailySave2));


        //////////////////////TASK-5/////////////////////////
        System.out.println("\n----------Task-5----------\n");
        double carPrice = 14_500;
        double optionOne = 475.50;
        double optionTwo = 951;

        double monthOne = carPrice / optionOne;
        double monthTwo = carPrice / optionTwo;

        System.out.println("Option 1 will take " + (int)monthOne + " months " +
                "\nOption 2 will take " + (int)monthTwo + " months ");


        //////////////////////TASK-6/////////////////////////
        System.out.println("\n----------Task-6----------\n");

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter 2 numbers");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        System.out.println(number1 / number2);
    }

    public static class Homework09Solution {
        public static void main(String[] args) {
            //////////////////////TASK-1/////////////////////////
            System.out.println("\n----------Task-1----------\n");

            String divider7 = "";
            for (int i = 1; i <= 100; i++) {
                if(i % 7 == 0) divider7 += i + " - ";
            }
            System.out.println(divider7.substring(0, divider7.length()-3));


            //////////////////////TASK-2/////////////////////////
            System.out.println("\n----------Task-2----------\n");

            String divider2And3 = "";
            for (int i = 1; i <= 50; i++) {
                if(i % 6 == 0) divider2And3 += i + " - ";
            }
            System.out.println(divider2And3.substring(0, divider2And3.length()-3));


            //////////////////////TASK-3/////////////////////////
            System.out.println("\n----------Task-3----------\n");

            String divider5 = "";
            for (int i = 100; i >= 50; i--) {
                if(i % 5 == 0) divider5 += i + " - ";
            }
            System.out.println(divider5.substring(0, divider5.length()-3));


            //////////////////////TASK-4/////////////////////////
            System.out.println("\n----------Task-4----------\n");

            for (int i = 0; i <= 7; i++) {
                System.out.println("The square of " + i + " is = " + i * i);
            }


            //////////////////////TASK-5/////////////////////////
            System.out.println("\n----------Task-5----------\n");

            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println(sum);


            //////////////////////TASK-6/////////////////////////
            System.out.println("\n----------Task-6----------\n");

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a positive number: ");
            int num = input.nextInt();
            input.nextLine();
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println(fact);


            //////////////////////TASK-7/////////////////////////
            System.out.println("\n----------Task-7----------\n");

            System.out.println("Please enter your full name:");
            String s1 = input.nextLine().toLowerCase();
            int vowelCounter = 0;

            for (int i = 0; i <= s1.length() - 1; i++) {
                if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' ||
                        s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') vowelCounter++;
            }
            System.out.println("There are " + vowelCounter + " vowel letters in this full name");


            //////////////////////TASK-8/////////////////////////
            System.out.println("\n----------Task-8----------\n");

            System.out.println("Please enter a number");
            int number = input.nextInt();
            int total = 0;

            if(number >= 100) System.out.println("This number is already more than 100");
            total += number;

            while (total <= 100){
                System.out.println("Please enter another number");
                total += input.nextInt();
                if(total >= 100) System.out.println("Sum of the entered numbers is at least 100");
            }



            //////////////////////TASK-9/////////////////////////
            System.out.println("\n----------Task-9----------\n");

            System.out.println("Please enter a number: ");
            int fibonacciSeries = input.nextInt();

            int num1 = 0;
            int num2 = 1;

            String result = "";
            for (int i = 1; i <= fibonacciSeries; i++) {
                result += num1 + " - ";
                int sumOfPrevTwo = num1 + num2;
                num1 = num2;
                num2 = sumOfPrevTwo;
            }
            System.out.println(result.substring(0, result.length()-3));


            //////////////////////TASK-10/////////////////////////
            System.out.println("\n----------Task-10----------\n");

            String name;
            do {
                System.out.println("Please enter a name");
                name = input.next();
            }
            while (!name.toLowerCase().startsWith("j"));
            System.out.println("End of the program!");
        }
    }
}