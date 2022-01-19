package ifElseStatements;

import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        /*
        Write a program that asks user about their Math exam
        PASSING 60

        If the score is greater than or equal to 60,
        then print message "Awesome! So, you have passed this math exam!".
        Else, "YOU FAILED!"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int gradeToPass = input.nextInt();;

        if (gradeToPass >= 60) {
            System.out.println("Awesome!So, you have passed this math exam!");
        } else if (gradeToPass <= 60){
            System.out.println("YOU FAILED!");
        }
        System.out.println("End of the program!");
    }
}
