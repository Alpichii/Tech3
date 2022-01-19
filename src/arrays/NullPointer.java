package arrays;

import java.util.Arrays;

public class NullPointer {
    public static void main(String[] args) {
        String name = null;

        //System.out.println(name.length()); //this throws NullPointerException

        name = "John";
        System.out.println(name.startsWith("J"));
        System.out.println(name.length());
        System.out.println(name.indexOf("o"));

        String[] names = {"", "Mariam", "", null};

        names[1] = "Viktoriya";
        System.out.println(names.length);
        System.out.println(names[1].toLowerCase()); //
        System.out.println(names[0].length()); // 0
        //System.out.println(names[3].length()); //this throws NullPointerException


        System.out.println("Hello World");
        System.out.println("End of Program");

        char[] c = {'2', 'A', 65, 97};
        int[] i = {23, 45, 67, Integer.parseInt("34653"), 'A', 'b', 'W'};

        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(i));
    }
}
