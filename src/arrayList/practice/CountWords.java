package arrayList.practice;

import java.util.LinkedList;
import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        List<String> companies = new LinkedList<>();

        companies.add("Apple");
        companies.add("Microsoft");
        companies.add("Amazon");
        companies.add("Google");
        companies.add("Samsung");
        companies.add("TechGlobal");
        companies.add("Facebook");
        companies.add("Oracle");
        companies.add("Tesla");

        /*
        TASK-1
        Count how many company starts with A
        2
         */

        System.out.println("\n-------TASK-1-------\n");
        int countA = 0;

        for (String company : companies) {
            if(company.toUpperCase().startsWith("A")) countA++;
        }

        System.out.println(countA);


        /*
        TASK-2
        Count how many company has at least 7 characters
        4
         */

        System.out.println("\n-------TASK-2-------\n");

        int count7 = 0;

        for (String company : companies) {
            if(company.length() >= 7) count7++;
        }

        System.out.println(count7);

        /*
        TASK-3
        Count how many company name ends with "le" or "la"
        4
         */

        System.out.println("\n-------TASK-3-------\n");

        int countEnd = 0;

        for (String company : companies) {
            if(company.endsWith("le") || company.endsWith("la")) countEnd++;
        }

        System.out.println(countEnd);


        System.out.println("\n-------TASK-4-------\n");
        /*
        TASK-4
        Count how many words starts with uppercase and how many with lowercase
        Uppercase = 2
        Lowercase = 3
         */
        LinkedList<String> objects = new LinkedList<>();
        objects.add("World");
        objects.add("cup");
        objects.add("pencil");
        objects.add("remote");
        objects.add("TV");

        int countUpperCase = 0;
        int countLowerCase = 0;

        for (String object : objects) {
            if(Character.isUpperCase(object.charAt(0))) countUpperCase++;
            else countLowerCase++;
        }
        System.out.println("Uppercase = " + countUpperCase);
        System.out.println("Lowercase = " + countLowerCase);


    }
}
