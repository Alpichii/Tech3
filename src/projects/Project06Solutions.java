package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project06Solutions {

    /*
    TASK-1 - countMultipleWords() method
    •Write a method that takes a String[] array as an argument and counts how many
    strings in the array has multiple words
    •This method will return an int which is the count of multiple words
    •NOTE: be careful about these as they are not multiple words ->"",    "   ",    "
    abc",      "abc   "

    Test data 1:
    ["foo", "", " ", "foo bar", "java is fun", " ruby "]

    Expected output 1:
    2
     */

    public static int countMultipleWords(String[] arr){
        int count = 0;

        for (String s : arr) {
            if(s.trim().contains(" ")) count++;
        }

        return count;
    }

    /*
    TASK-2 - removeNegatives() method
    •Write a method that takes an "ArrayList<Integer> numbers" as an argument and
    removes all negative numbers from the given list if there are any
    •This method will return an ArrayList with removed negatives
    Test data 1:
    [2, -5, 6, 7, -10, -78, 0, 15]
    Expected output 1:
    [2, 6, 7, 0, 15]
     */

    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        Iterator<Integer> iter = numbers.iterator();

        while(iter.hasNext()){
            if(iter.next() < 0) iter.remove();
        }

        return numbers;
    }


    /*
    TASK-3 - validatePassword() method
    •Write a method that takes a "String password" as an argument and checks if the
    given password is valid or not
    •This method will return true if given password is valid, or false if given password
    is not valid
    •A VALID PASSWORD:
    -should have length of 8 to 16 (length of 7 or 17 should return false)
    -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
    -should NOT have any space
     */

    public static boolean validatePassword(String password){
        if(password.contains(" ") || password.length() < 8 || password.length() > 16) return false;

        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecial= false;

        char[] characters = password.toCharArray(); //['a', 'b','c']

        for (char c : characters) {
            if(Character.isDigit(c)) hasDigit = true;
            else if(!Character.isLetterOrDigit(c)) hasSpecial = true;
            else if(Character.isUpperCase(c)) hasUppercase = true;
            else hasLowercase = true;
        }

        return hasDigit && hasSpecial && hasLowercase && hasUppercase;
    }


    /*
    TASK-4 - validateEmailAddress() method
    •Write a method that takes a "String email" as an argument and checks if the
    given email is valid or not
    •This method will return true if given email is true, or false if given email is not
    valid
    •A VALID EMAIL:
    -should NOT have any space
    -should not have more than one "@" character
    -should be in the given format <2+chars>@<2+chars>.<2+chars
     */

    public static boolean validateEmailAddress(String email){
        if(email.contains(" ") || !email.contains("@") || !email.contains(".")) return false;
        if(email.length()-1 != email.replace("@", "").length()) return false;

        String part1 = email.substring(0, email.indexOf("@"));
        String part2 = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        String part3 = email.substring(email.lastIndexOf(".")+1);

        return part1.length() >= 2 && part2.length() >= 2 && part3.length() >= 2;
    }


    public static void main(String[] args) {
        System.out.println("\n-----TASK-1-Example------\n");
        String[] words = {" hello ", "hello world", "good morning", "   good", "   "};
        System.out.println(countMultipleWords(words));



        System.out.println("\n-----TASK-2-Example------\n");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, -5, -6, 7, 0));
        System.out.println(removeNegatives(numbers));


        System.out.println("\n-----TASK-3-Example------\n");
        System.out.println(validatePassword("abcd")); //false
        System.out.println(validatePassword("")); // false
        System.out.println(validatePassword("74835gekrhsgdkruty74kuwyrgsku")); // false
        System.out.println(validatePassword("Axyz 123!")); // false
        System.out.println(validatePassword("AXbcd123$")); // true

        System.out.println("\n-----TASK-4-Example------\n");
        System.out.println(validateEmailAddress("java@gmail@.com"));
        System.out.println(validateEmailAddress("java@gmail"));
        System.out.println(validateEmailAddress("jav a@gmail.com"));
        System.out.println(validateEmailAddress("java@gmail.com"));

    }
}
