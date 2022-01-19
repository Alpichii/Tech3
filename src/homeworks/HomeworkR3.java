package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeworkR3 {
    public static void main(String[] args) {
        System.out.println("\n----------Task1----------\n");

        int[] numbers1 = {10, 23, 67, 23, 78};

        System.out.println(numbers1[1]);
        System.out.println(numbers1[0]);
        System.out.println(numbers1[2]);
        System.out.println(Arrays.toString(numbers1));

        System.out.println("\n----------Task2----------\n");

        ArrayList<String> elements2 = new ArrayList<>();
        elements2.add("Blue");
        elements2.add("Brown");
        elements2.add("Red");
        elements2.add("White");
        elements2.add("Black");
        elements2.add("Purple");

        System.out.println(elements2.get(1));
        System.out.println(elements2.get(3));
        System.out.println(elements2.get(5));
        System.out.println(elements2);

        System.out.println("\n----------Task3----------\n");

        ArrayList<Integer> numbers3 = new ArrayList<>();

        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);

        System.out.println(numbers3);

        Collections.sort(numbers3);
        System.out.println(numbers3);

        System.out.println("\n----------Task4----------\n");

        ArrayList<String> cities4 = new ArrayList<>();

        cities4.add("Istanbul");
        cities4.add("Berlin");
        cities4.add("Moscow");
        cities4.add("Madrid");
        cities4.add("Paris");

        System.out.println(cities4);
        Collections.sort(cities4);
        System.out.println(cities4);

        System.out.println("\n----------Task5----------\n");

        ArrayList<String> characters5 = new ArrayList<>();

        characters5.add("Spider Man");
        characters5.add("Iron Man");
        characters5.add("Black Panter");
        characters5.add("Deadpool");
        characters5.add("Captain America");

        System.out.println(characters5);
        if (characters5.contains("Wolwerine")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\n----------Task6----------\n");

        ArrayList<String> heros = new ArrayList<>();

        heros.add("Hulk");
        heros.add("Black Widow");
        heros.add("Captain America");
        heros.add("Iron Man");

        Collections.sort(heros);
        System.out.println(heros);

        if (heros.contains("Hulk") && heros.contains("Iron Man")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\n----------Task7----------\n");

        ArrayList<Character> c7 = new ArrayList<>();

        c7.add('A');
        c7.add('x');
        c7.add('$');
        c7.add('%');
        c7.add('9');
        c7.add('*');
        c7.add('+');
        c7.add('F');
        c7.add('G');
        c7.add('Q');

        System.out.println(c7);

        for (Character character : c7) {
            System.out.println(character);
        }

        System.out.println("\n----------Task8----------\n");

        ArrayList<String> objects = new ArrayList<>();

        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adopter");

        System.out.println(objects);

        Collections.sort(objects);
        System.out.println(objects);

        int counter = 0;
        int countEa = 0;

        for (String object : objects) {
            if (object.toUpperCase().startsWith("M") || object.toLowerCase().startsWith("m")) counter++;
        }
        for (String object : objects) {
            if (object.toLowerCase().startsWith("a") || object.toLowerCase().startsWith("e")
                    || object.toUpperCase().startsWith("A") && object.toUpperCase().startsWith("E")) {
                countEa++;
            }
        }
        System.out.println(counter);
        System.out.println(countEa);

        System.out.println("\n----------Task9----------\n");

        ArrayList<String> kitchen = new ArrayList<>();

        kitchen.add("Plate");
        kitchen.add("spoon");
        kitchen.add("fork");
        kitchen.add("Knife");
        kitchen.add("cup");
        kitchen.add("Mixer");

        System.out.println(kitchen);
        int countUpper = 0;
        int countLower = 0;
        int counterP = 0;
        int count = 0;

        for (String k9 : kitchen) {
            if (Character.isUpperCase(k9.charAt(0))) countUpper++;
            else countLower++;
        }

        for (String k9 : kitchen) {
            if (k9.toUpperCase().contains("P") && k9.toLowerCase().contains("p")) counterP++;
        }

        for (String k9 : kitchen) {
            if (k9.startsWith("P") || (k9.startsWith("p")) && k9.endsWith("P") || k9.endsWith("p")) count++;
        }

        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements having P or p = " + counterP);
        System.out.println("Elements starting or ending with P or p = " + count);

        System.out.println("\n----------Task10----------\n");

        ArrayList<Integer> num10 = new ArrayList<>();
        num10.add(3);
        num10.add(5);
        num10.add(7);
        num10.add(10);
        num10.add(0);
        num10.add(20);
        num10.add(17);
        num10.add(10);
        num10.add(23);
        num10.add(56);
        num10.add(78);

        System.out.println(num10);

        int divider10 = 0;
        int countGreatEven15 = 0;
        int countLessOdd20 = 0;
        int counte = 0;

        for (Integer n10 : num10) {
            if (n10 % 10 == 0) divider10++;
        }
        System.out.println("Elements that can be divided by 10 = " + divider10);

        for (Integer evens : num10) {
            if (evens > 15 && evens % 2 == 0) countGreatEven15++;
        }
        System.out.println("Elements that are even and greater than 15 = " + countGreatEven15);

        for (Integer odds : num10) {
            if (odds < 20 && odds % 3 == 0) countLessOdd20++;
        }
        System.out.println("Elements that are odd and less than 20 = " + countLessOdd20);

        for (Integer nums : num10) {
            if (nums > 50 || nums < 15) counte++;
        }
        System.out.println("Elements that are less than 15 or greater than 50 = " + counte);
    }
}