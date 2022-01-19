package arrays.practice;

public class RemoveExtraSpaces {
    /*
    Create a method that takes a String, removes extra spaces and return it back

    "  I like Java   " -> "I like Java"
    "Apple    is   nice" -> "Apple is nice"
    "Good Morning" -> "Good Morning"
    */

    public static String removeExtraSpaces(String s) {
        s = s.trim();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') result += s.charAt(i);
            else if (s.charAt(i + 1) != ' ') result += s.charAt(i);
        }

        return result;
    }

    /*
    //2nd way:
     String result = "";

     String[] arr = s.split(" "); // ["Apple", "", "", "", "is", "", "", "", "nice"]

     for (String s1 : arr) {
         if(!s1.isEmpty()) result += s1 + " ";
     }

     return result.trim();
     }
    */
    public static void main(String[] args) {
        System.out.println(removeExtraSpaces("  I like Java   "));
        System.out.println(removeExtraSpaces("Apple    is   nice"));
    }
}







