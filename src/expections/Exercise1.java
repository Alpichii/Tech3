package expections;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
       /*
        Write a program that ask user to enter their name
        Get the 1st and 5th characters from the name
        And check if 1st or 5th character is a or A
        if it is print true
        otherwise print false
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        try{
            System.out.println(name.toLowerCase().charAt(0) == 'a' || name.toLowerCase().charAt(4) == 'a');
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception caught : " + e.getMessage());
        }
        finally {
            //This block is used to run a final block of code after try-catch
            System.out.println("The length of name = " + name.length());
        }
    }
}
