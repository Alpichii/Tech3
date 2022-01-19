package ifElseStatements;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        /*
        EVEN NUMBER -> 0, 2 4 6 8 10     -8 -20 -44
        ODD NUMBER  -> 1, 3 5 7 9 11     -77 -19 -27

        Write a program ask user to enter a number
        Print "The number is even" if the number is even
        Print "The number is odd" otherwise
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println("The Number is even");
        }
        else{
            System.out.println(" The Number is odd");
        }
        System.out.println("End of the program!");
    }
}
