package stringOfMethods.practice;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Favorite book");
        String favBook = input.nextLine();
        System.out.println("Please enter your favorite quote");
        String favQuote = input.nextLine();

        System.out.println("User's favorite book is = " + favBook);
        System.out.println("User's favorite quote is = " + favQuote);

        System.out.println("User's favorite book is = " + favBook.length());
        System.out.println("User's favorite book is = " + favQuote.length());
    }
}
