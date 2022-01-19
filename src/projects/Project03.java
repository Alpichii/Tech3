package projects;

import java.util.Scanner;

import static java.lang.Math.cbrt;
import static java.lang.Math.max;

public class Project03 {
    public static <upperCaseLetter> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------Task-1----------");

        String s1 = "24", s2 = "5";
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = (num1 + num2);
        int subtraction = (num1 - num2);
        int division = (num1 / num2);
        int multiply = num1 * num2;
        int remainder = (num1 % num2);

        System.out.println(s1 + " + " + s2 + " = " + sum);
        System.out.println(s1 + " - " + s2 + " = " + subtraction);
        System.out.println(s1 + " / " + s2 + " = " + division);
        System.out.println(s1 + " * " + s2 + " = " + (double) multiply);
        System.out.println(s1 + " % " + s2 + " = " + remainder);

        System.out.println("----------Task-2----------");

        int num = (int) (Math.random() * 36) + 1;
        if ((num == 2) || (num == 3) || (num == 5) || (num == 7) || (num == 11) || (num == 13) || (num == 17)
                || (num == 19) || (num == 23) || (num == 27) || (num == 29) || (num == 31)) {
            System.out.println(num + " IS A PRIME NUMBER");
        } else {
            System.out.println(num + " IS NOT A PRIME NUMBER");

        }

        System.out.println("----------Task-3----------");
        int number1 = (int) ((Math.random()) * 36) + 1;
        int number2 = (int) ((Math.random()) * 36) + 1;
        int number3 = (int) ((Math.random()) * 36) + 1;

        int maxOfThree = max(max(number1, number2), number3);
        int minOFThree = Math.min(Math.min(number1, number2), number3);
        int middleOfThree = number3;

        if (number1 >= maxOfThree && number1 <= minOFThree) {
            //max = number1;
        } else if (number2 > maxOfThree && number2 < minOFThree) {
            //min = number2;
        } else {
            //mid = number3;
        }

        System.out.println("Max value = " + maxOfThree);
        System.out.println("Min value = " + minOFThree);
        System.out.println("Middle number is = " + middleOfThree);

        System.out.println("----------Task-4----------");

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String c1 = myScan.nextLine();
        char a = c1.charAt(0);

        if (a >= 'a' && a <= 'z'){
            System.out.println("The letter is lowercase.");
        }
        else if(a >= 'A' && a <= 'Z'){
            System.out.println("The letter is uppercase");
        }
        else{
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("----------Task-5----------");

        System.out.println("Enter a single character: ");
        char ch = myScan.nextLine().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E'||
                ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("The letter is vowel");
        }
        else if ((ch >= 'a' && ch<= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("The letter is consonant");
        }
        else {
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("----------Task-6----------");
        System.out.println("Please enter a special character: ");
        char ch2 = myScan.nextLine().charAt(0);

        if((ch2 >= 0 && ch2 <= 32)||(ch2 >= 48 && ch <= 57) || (ch2 >= 65 && ch2 <= 90)||
                (ch2 >= 97 && ch2 <= 122)){
            System.out.println("Invalid character detected!!!");
        }
        else{
            System.out.println("Special character is = " + ch2);
        }

        System.out.println("----------Task-7----------");
        System.out.println("Enter a single character: ");
        char ch3 = myScan.nextLine().charAt(0);

        if((ch3 >= 65 && ch3 <= 90) || (ch3 >= 97 && ch3 <= 122)){
            System.out.println("Character is a letter");
        }
        else if (ch3 >= 48 && ch3 <= 57){
            System.out.println("Character is a digit");
        }
        else{
            System.out.println("Character is a special character");
        }
        System.out.println("End of the Program");
    }
}

