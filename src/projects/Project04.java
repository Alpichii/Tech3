package projects;

import methodUtility.RandomNumberGenerator;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n----------Task-1----------");

        System.out.println("Please enter a sentence");
        String name = input.nextLine();

        String name1 = name.substring(name.length() - 4);
        String name2 = name.substring(0, 4);

        if (name.length() >= 8)
            if (name.length() % 2 == 0)
                System.out.println(name1 + (name.substring(name.length() / 2 - 1, name.length() / 2 + 1) + name2));
            else if (name.length() % 2 == 1)
                System.out.println(name1 + name.substring(name.length() / 2, name.length() / 2 + 1) + name2);
            else
                System.out.println("This String does not have 8 characters");

        System.out.println("\n----------Task-2----------");

        System.out.println("Please enter a sentence");
        String s = input.nextLine();

        if (s.length() >= 2 && s.contains(" "))
            System.out.println(s.substring(s.lastIndexOf(' ') + 1) + s.substring(s.indexOf(' '),
                    s.lastIndexOf(' ') + 1) + s.substring(0, s.indexOf(' ')));
        else
            System.out.println("This sentence does not have 2 or more words to swap");

        System.out.println("\n----------Task-3----------");

        String str1 = "These books are so stupid".replace("stupid", "nice");
        String str2 = "I like idiot behaviors".replace("idiot", "nice");
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes"
                .replace("stupid", "nice").replace("idiot", "nice");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("\n----------Task-4----------");

        System.out.println("Please enter your name");
        String nameOne = input.nextLine();

        if (nameOne.length() >= 2) {
            if (nameOne.length() % 2 == 0)
                System.out.println(nameOne.substring(nameOne.length() / 2 - 1, nameOne.length() / 2 + 1));

            else if (nameOne.length() % 2 == 1)
                System.out.println(nameOne.substring(nameOne.length() / 2, nameOne.length() / 2 + 1));
        } else System.out.println("Invalid input");

        System.out.println("\n----------Task-5----------");

        System.out.println("Please enter a country");
        String country = input.nextLine();

        if (country.length() >= 5) {
            System.out.println(country.substring(2, country.length() - 2));
        } else {
            System.out.println("Invalid input!!!");
        }

        System.out.println("\n----------Task-6----------");

        System.out.println("Please enter your address");
        String address = input.nextLine();

        address = address.replace('a', '*').replace('A', '*')
                .replace('e', '#').replace('E', '#')
                .replace('i', '+').replace('I', '+')
                .replace('u', '$').replace('U', '$')
                .replace('o', '@').replace('O', '@');

        System.out.println(address);

        System.out.println("\n----------Task-7----------");
        int num1 = RandomNumberGenerator.getRandomNumber(0, 25);
        int num2 = RandomNumberGenerator.getRandomNumber(0, 25);
        System.out.println("int randomNumber1 = " + num1);
        System.out.println("int randomNumber2 = " + num2);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        for (int i = max; i >= min; i--) {
            if (i % 5 != 0)
                if (i != min) System.out.print(i + " - ");
                else
                    System.out.print(i);
        }
    }
}