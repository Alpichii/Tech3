package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("----------Task-1----------\n");
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = scan.nextLine();

        int lengthName = name.length();
        char firLet = name.charAt(0);
        char lastLet = name.charAt(name.length() - 1);

        System.out.println("The length of the name is = " + lengthName);
        System.out.println("The first character in the name is = " + firLet);
        System.out.println("The last character in the name is = " + lastLet);

        if (name.length() >= 5) {
            String fir3 = name.substring(0, 3);
            System.out.println("The first 3 characters in the name are =" + fir3);

            String last3 = name.substring(name.length() - 3);
            System.out.println("The last 3 characters in the name are = = " + last3);
        } else {
            System.out.println("Sorry, you are not in the club");
        }
        if (name.startsWith("A") || name.startsWith("a")) {
            System.out.println("You are in the club!");
        } else {
            System.out.println("Sorry, you are not in the club");
        }
        System.out.println("----------Task-2----------\n");

        System.out.println("Please enter your full address");
        String address = scan.next();

        if (address.toUpperCase().contains("CHICAGO") || address.toLowerCase().contains("chicago")) {
            System.out.println("You are in the club");
        }
        if (address.toUpperCase().contains("DES PLAINES") || address.toLowerCase().contains("des plaines")) {
            System.out.println("You are welcome to join to the club");
        } else {
            System.out.println("Sorry, you will never be in the club");
        }
        if (address.startsWith("Chicago") || address.startsWith("chicago") &&
                address.equalsIgnoreCase("CHICAGO")) {
            System.out.println("You are in the club");

        } else {
            System.out.println("Sorry, you will never be in the club");
        }
        if (address.contains("Des Plaines") || address.contains("desplaines")) {
            System.out.println("You are welcome to join to the club");
        }

        System.out.println("----------Task-3----------\n");

        System.out.println("Please enter 4 favorite colors");
        String color1 = scan.nextLine();
        String color2 = scan.nextLine();
        String color3 = scan.nextLine();
        String color4 = scan.nextLine();

        boolean red = color1.toLowerCase().contains("red");
        boolean green = color1.toLowerCase().contains("green");

        System.out.println(color1.toLowerCase().contains("red") || color1.toLowerCase().contains("green") ||
                color2.toLowerCase().contains("red") || color2.toLowerCase().contains("green") ||
                color3.toLowerCase().contains("red") || color3.toLowerCase().contains("green") ||
                color4.toLowerCase().contains("red") || color4.toLowerCase().contains("green"));
        if(green)
            System.out.println("Green is in the list");
        else if(red)
            System.out.println("Red is in the list");
        if(red && green)
            System.out.println("Green and red are in the list");
        else System.out.println("Green and red are not in the list");

        System.out.println("----------Task-4----------\n");

        String str = "   Java Is FUN";

        System.out.println("The first word in the str is = " + str.substring(3, str.indexOf("I")));
        System.out.println("The second word in the str is = " + str.substring(8, 10));
        System.out.println("the third word in the str is = " + str.substring(str.lastIndexOf(" ") + 1));
    }
}
