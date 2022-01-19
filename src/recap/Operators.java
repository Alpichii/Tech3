package recap;

public class Operators {
    public static void main(String[] args) {
        /*
        Assignment Operators - is used to assign a value into a variable
        Shorthand Assignment Operators -> +=, -=, *=, %=, /=
        Arithmetic operators -> - + * / %
        Increment and Decrement Operators -> ++ --
        Logical Operators -> &&, ||, !
        Relational Operators -> ==, !=, <=, >=, <, >
         */

        System.out.println("\n-----Learning variables-----\n");
        // dataType variable = value;
        int age = 45; // initialization - declaring and assigning value

        String name; // declaration
        name = "Max"; // assignment with assignment operator

        /*
        Data types -> primitives & reference types (objects)
        Primitives -> byte, short, int, long, float, double, char, boolean
        Reference types -> String, Arrays, ArrayList, Scanner, Random, Math, Car, Fruit
        Car -> model, make, year, Engine, color
         */

        System.out.println(age); // 45
        System.out.println(name); // Max


        System.out.println("\n-----Learning arithmetic operators-----\n");
        System.out.println(1 + 3); // 4
        System.out.println(5 * 3); // 15
        System.out.println(20 % 5); // 0
        System.out.println(3 - 3); // 0
        System.out.println(4 / 2); // 2


        System.out.println("\n-----Learning remainder-----\n");
        /*
        if the number on the left is less than on the right, result is the number on the left
         */
        System.out.println(5 % 8); // 5 = 8 * 0 + 5, that is why remainder is 5
        System.out.println(17 % 25); // 17 = 25 * 0 + 17, that is why remainder is 17
        System.out.println(6 % 10); // 6 = 10 * 0 + 6, that is why remainder is 6

        System.out.println(12 % 7); // 12 = 7 * 1 + 5, that is why remainder is 5
        System.out.println(11 % 3); // 11 = 3 * 3 + 2, that is why remainder is 2
        System.out.println(25 % 8); // 25 = 8 * 3 + 1, that is why remainder is 1
        System.out.println(17 % 8); // 17 = 8 * 2 + 1, that is why remainder is 1

        System.out.println(5 % 5); // 5 = 5 * 1 + 0, that is why remainder is 0
        System.out.println(113 % 113); // 113 = 113 * 1 + 0, that is why remainder is 0


        System.out.println("\n-----Shorthand assignment operators-----\n");
        /*
        +=
        -=
        *=
        /=
        %=
         */

        String city = "Chicago";
        String cityReversed = "";

        /*
        cityReversed
        o
        og
        oga
        ogac
        ogaci
        ogacih
        ogacihC
         */

        for (int i = city.length()-1; i >= 0; i--) {
            char c = city.charAt(i);
            cityReversed += c;
        }

        System.out.println(cityReversed);


        int year = 2021;

        //what year is going be 15 years later -> 2036 2021 + 15
        year += 15; // year += 15 means the previous year value + 15 is the new value of year

        System.out.println(year);

        int number = 15; // find what is the result of number multiplied by 3 -> 45

        System.out.println(number *= 3);

        int num = 13; // find remainder by 5 and assign it to num, then print the num -> 3
        num %= 5;
        System.out.println(num); // 3


        System.out.println("\n-----More about + operator-----\n");
        /*
        + operator is used to find sum of numbers
        + operator is used to concatenate multiple strings or some other data types with string
         */

        double i1 = 2;
        double i2 = 2;
        System.out.println(i1 + i2); // arithmetic operator and the result is 4

        System.out.println("25" + 25); //concatenation 2525
        System.out.println("5" + "5" + "5"); //concatenation 555
        System.out.println(2 + 2 + "2"); // 42
        System.out.println("2" + 2 + 2); // 222
        System.out.println(2 + 2 + 3 + "2" + 2 + 3); //7223

        System.out.println("The result of 2 + 2 is equal to = " + 2 + 2); //

        System.out.println("The product of 3 and 5 is  = " + 3 * 5); // 15


        System.out.println("\n-----Relational Operators-----\n");
        /*
        Relational operators are used to compare usually number data
        byte, short, int, long, float, double, char
        >
        <
        ==
        !=
        <= less than or equal
        >= more than or equal

        'a' < 'Z' -> ASCII table
         97 < 90  -> false

        ' ' -> 32
        'A' -> 65
        'Z' -> 90
        'a' -> 97
        'z' -> 122
         */

        System.out.println(3 < 5); // true
        System.out.println(10 > 15); // false
        System.out.println(7 >= 6); // true
        System.out.println(6 == 6); // true 6 = 6 a is compiler error
        System.out.println(5 != 5); // false


        System.out.println("\n-----Increment and decrement-----\n");
        /*
        They are mostly used with fori loop and other loops
        When we count some things, we use ++ a lot
        add 1
        subtract 1

        post increment // we use post ones mostly
        post decrement
        pre increment
        pre decrement
         */


        int i = 0;
        System.out.println(++i); // 1, there is an assignment in these implicitly
        System.out.println(i); // 1
        System.out.println(++i); //2


        System.out.println("\n-----Logical Operators-----\n");
        /*
        &&
        ||

        AND Operator
        true && true    -> true
        false && true   -> false
        true && false   -> false
        false && false  -> false

        OR Operator
        true || true    -> true
        true || false   -> true
        false || true   -> true
        false || false  -> false

        !true   -> false
        !false  -> true
        */
        System.out.println(5 == 5 && 6 == 7); // true && false -> false
        System.out.println(3 > 5 || 0 == 10 || 2 < 5 || 5 > 20); // false || false || true || false -> true
        System.out.println(!true || !false); // false || true -> true

        System.out.println((!true || 2 >10) || true); //true

        System.out.println((10 - 15 < 0 && 3 * 5 < 10) || (23 > 10 || 2 != 2)); // true
    }
}