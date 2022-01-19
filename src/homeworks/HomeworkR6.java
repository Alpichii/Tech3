package homeworks;

import java.util.*;

public class HomeworkR6 {
    //--------------------Task-1--------------------
    public static boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }
    /*
    Requirement:
    -Create a method called hasLowerCase()
    -This method will take a String argument, and it will return boolean true if there is lowercase letter and false if it doesn’t.

    Test Data 1: “”
    Expected Result 1: false

    Test Data 2: “JAVA”
    Expected Result 2: false

    Test Data 3: “125$”
    Expected Result 3: false

    Test Data 4: “hello”
    Expected Result 4: true
    ------------------------------------------------*/

    //--------------------Task-2--------------------
    public static int[] noZero(int[] arr) {
        int currentFact = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 0)) arr[i] = currentFact;
        }
        return arr;
    }
    /*
    Requirement:
    -Create a method called noZero()
    -This method will take one Integer ArrayList argument and it will return an ArrayList with all zeros removed from the original Integer ArrayList.

    NOTE: Assume that ArrayList size will be at least 1.

    Test Data 1: [1]
    Expected Result 1: [1]

    Test Data 2: [1, 1, 10]
    Expected Result 2: [1, 1, 10]

    Test Data 3: [0, 1, 10]
    Expected Result 3: [1, 10]

    Test Data 4: [0, 0, 0]
    Expected Result 4: []
    ------------------------------------------------*/

    //--------------------Task-3--------------------
    public static int[][] numberAndSquare(int[] arr) {
        int[][] factArr = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            factArr[i][0] = arr[i];
            factArr[i][1] = arr[i] * arr[0];
        }
        return factArr;
    }
    /*
    Requirement:
    -Create a method called numberAndSquare()
    -This method will take an int array argument and it will return a multidimensional array with all numbers squared.

    NOTE: Assume that array size is at least 1.

    Test Data 1: [1, 2, 3]
    Expected Result 1: [[1, 1], [2, 4], [3, 9]]

    Test Data 2: [0, 3, 6]
    Expected Result 2: [[0, 0], [3, 9], [6, 36]]

    Test Data 3: [1, 4]
    Expected Result 3: [[1,1], [4, 16]]
    ------------------------------------------------*/

    //--------------------Task-4--------------------
    public static boolean[] containsValue(String[] str) {
       return new boolean[]{Arrays.binarySearch(str, "apple") >= 1} ;
    }
    /*
    Requirement:
    -Create a method called containsValue()
    -This method will take a String array and a String argument, and it will return a boolean. Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
    NOTE: Assume that array size is at least 1.
    NOTE: The method is case-sensitive

    Test Data 1: [“abc”, “foo”, “java”], “hello”
    Expected Result 1: false

    Test Data 2: [“abc”, “def”, “123”], “Abc”
    Expected Result 2: false

    Test Data 3: [“abc”, “def”, “123”, “Java”, “Hello”], “123”
    Expected Result 3: true

    Hint: Use binarySearch() for easy solution
    ------------------------------------------------*/

    //--------------------Task-5--------------------
    public static String reverseSentence(String str) {
        String[] empty = str.toLowerCase().split(" ");
        String reverse = "";
        for (int i = empty.length - 1; i >= 0; i--) {
            reverse += empty[i] + " ";
        }
        return reverse.trim();
    }
    /*
    Requirement:
    -Create a method called reverseSentence()
    -This method will take a String argument and it will return a String with changing the place of every word. All words should be in reverse order. Make sure that there are two words inside the sentence at least. If there is no two words return “There is not enough words!”.

    Test Data 1: “Hello”
    Expected Result 1: “There is not enough words!”

    Test Data 2: “Java is fun”
    Expected Result 2: “Fun is java”

    Test Data 3: “This is a sentence”
    Expected Result 3: “Sentence a is this”

    Hint: Use split() for easy solution
    Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case
    ------------------------------------------------*/

    //--------------------Task-6--------------------
    public static String removeSpecialsDigits(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", " ");
    }
    /*
    Requirement:
    -Create a method called removeSpecialsDigits()
    -This method will take a String array as argument, and it will return a String array without the special characters or digits from the beginning.
    NOTE: Assume that array size is at least 1.

    Test Data 1: [“123Java”, “#$%is”, “fun”]
    Expected Result 1: [“Java”, “is”, “fun”]

    Test Data 2: [“Selenium”, “123$%”, “###”]
    Expected Result 2: [“Selenium”, “”, “”]

    Test Data 3: [“Selenium”, “123#$%Cypress”]
    Expected Result 3: [“Selenium”, “Cypress”]
    ------------------------------------------------*/

    //--------------------Task-7--------------------
    public static String removeStringSpecialsDigits(String str) {
        return str.replaceAll("[^0-9$]", "");
    }
    /*Requirement:
    -Create a method called removeStringSpecialsDigits()
    -This method will take a String as argument, and it will return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.

    Test Data 1: “123Java #$%is fun”
    Expected Result 1: “Java is fun”

    Test Data 2: “Selenium”
    Expected Result 2: “Selenium”

    Test Data 3: “Selenium 123#$%Cypress”
    Expected Result 3: “Selenium Cypress”
    ------------------------------------------------*/

    //--------------------task-8--------------------
    public static String[] removeAndReturnCommons(String[] arrs) {
        ArrayList<String[]> words = new ArrayList<String[]>();

        ArrayList<String[]> arr = new ArrayList<>();
        for (String[] word : words) {
            if (!arr.contains(word)) arr.add(word);
        }
        return arrs;
    }
    /*
    Requirement:
    -Create a method called removeAndReturnCommons()
    -This method will take two String ArrayList and it will return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.

    Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
    Expected Result 1: []

    Test Data 2: [“Java”, “is”, “fun”], [“Java”, “C#”, “Python”]
    Expected Result 2: [“Java”]

    Test Data 3: [“Java”, “C#”, “C#”], [“Python”, “C#”, “C++”]
    Expected Result 3: [“C#”]
    ------------------------------------------------*/

    //--------------------Task-9--------------------
    public static String[] noXInVariables(String[] str) {
        String currentList = " ";
        for (int i = 0; i < currentList.length(); i++) {
            currentList = currentList.toLowerCase().replaceAll("x", "");
        }
        return str;
    }

    /*
    Requirement:
    -Create a method called noXInVariables()
    -This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
    If the element itself equals to x or X or contains only x letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.

    Test Data 1: [abc, 123, #$%]
    Expected Result 1: [abc, 123, #$%]

    Test Data 2: [xyz, 123, #$%]
    Expected Result 2: [yz, 123, #$%]

    Test Data 3: [x, 123, #$%]
    Expected Result 3: [123, #$%]

    Test Data 4: [xyXyxy, Xx, ABC]
    Expected Result 4: [yyy, ABC]
     -------------------------------------------------*/

    public static void main(String[] args) {
        String t1 = "JAVA";
        System.out.println(hasLowerCase(t1));

        int[] t2 = {0, 1, 10};
        System.out.println(Arrays.toString(noZero(t2)));

        int[] t3 = {0, 3, 6};
        System.out.println(Arrays.toString(numberAndSquare(t3)));

        String[] t4 = {"abc", "foo", "java"};
        System.out.println(Arrays.toString(containsValue(t4)));

        String t5 = "Java is fun";
        System.out.println(reverseSentence(t5));

        String[] t6 = {"123Java", "#$%is", "fun"};
        System.out.println(removeSpecialsDigits(Arrays.toString(t6)));

        String t7 = "23Java #$%is fun";
        System.out.println(removeStringSpecialsDigits(t7));

        String[] t8 = {"Java", "is", "fun", "abc", "xyz", "123"};
        System.out.println(Arrays.toString(removeAndReturnCommons(t8)));

        String[] t9 = {"abcx", "123", "#$%"};
        System.out.println(Arrays.toString(noXInVariables(t9)));
    }
}