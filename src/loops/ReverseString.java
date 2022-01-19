package loops;     // mock 2 interview question

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter their names
        And print name reversed

        EXAMPLE:
        Program: Please enter a name
        User: John
        Program: The name reversed is = nhoJ


        John
        name.charAt(name.length()-1)   -> n
        name.charAt(name.length()-2)   -> h
        .
        .
        .
        name.charAt(0) -> J

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("The name entered is = " + name);

        String reversedName = "";
        for (int i = name.length()-1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }
        System.out.println("The name reversed is = " + reversedName);
    }
}
