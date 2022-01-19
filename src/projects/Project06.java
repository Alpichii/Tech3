package projects;

import java.util.ArrayList;
import java.util.Iterator;

public class Project06 {

    //TASK-1
    public static int countMultipleWords(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].trim();
            if (s[i].contains(" ")) {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    //TASK-2
    /* Akin's solution:
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
    ArrayList<Integer> noNegatives = new ArrayList<>();

    for (Integer number : numbers) {
        if(number >= 0) noNegatives.add(number);
    }

    return noNegatives;
    }

   -----
   //functional programming!!!!
   public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
    Iterator<Integer> iter = numbers.iterator();

    while(iter.hasNext()){
        if(iter.next() < 0) iter.remove();
    }

    return numbers;
}
    */
    public static ArrayList removeNegatives(ArrayList<Integer> numbers) {

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num < 0) iterator.remove();
        }

        System.out.println(numbers);
        return numbers;
    }

    //TASK-3
    public static boolean validatePassword(String password) {

        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialFlag = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                if (password.length() < 17 && password.length() >= 8)
                    numberFlag = true;
            } else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            } else if (!Character.isLetterOrDigit(ch) && !Character.isSpaceChar(ch)) {
                specialFlag = true;
            }
            if (numberFlag && capitalFlag && lowerCaseFlag && specialFlag)
                return true;
        }
        return false;
    }

    //TASK-4
    public static boolean validateEmailAddress(String str) {

        if(str.contains(" "))
            return false;

        String str1 = str.substring(0, str.indexOf('@'));
        String str2 = str.substring(str.indexOf('@')+1, str.indexOf('.'));
        String str3 = str.substring(str.lastIndexOf('.')+1);

        if (str1.length() < 3 || str2.length() < 3 || str3.length() <3) {
            return false;
        }
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == '@' && str.charAt(i+1) == '@')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("\n----------Task-1----------\n");

        String[] d = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        Project06.countMultipleWords(d);


        System.out.println("\n----------TASK-2----------\n");

        ArrayList<Integer> n = new ArrayList<>();
        n.add(-3);
        n.add(10);
        n.add(7);
        n.add(0);
        n.add(-13);
        n.add(8);
        n.add(11);
        n.add(0);

        Project06.removeNegatives(n);

        System.out.println("\n----------TASK-3----------\n");

        String s = "Abcd123!";
        System.out.println(Project06.validatePassword(s));


        System.out.println("\n----------TASK-4----------\n");

        String s1 = "abcd@gmail.com";
        System.out.println(Project06.validateEmailAddress(s1));
    }
}