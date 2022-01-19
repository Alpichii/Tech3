package stringOfMethods;

public class ReplaceMethod {
    public static void main(String[] args) {
        /*
        -this method is used to replace some characters or sequence of characters in a String
        -it is a non-static method
        -it is a return method and it returns a new String that has been replaced
        -it takes 2 args, sometimes chars, sometimes Strings
        -First argument is what you want to replace,
            the second argument is what you wanted to be implemented in your String
         */


        String s = "Today is Sunday";
        String replaced = s.replace("Sunday", "Monday")
                .toLowerCase().replace("day", "$$$")
                .replace('o', '#').replace(' ', '_');

        System.out.println(replaced);


        String word = "JavaScript";
        String newWord = word.replace("Hello", "Ruby");
        System.out.println(newWord);
    }
}