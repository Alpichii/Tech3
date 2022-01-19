package ifElseStatements;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class ternaryOperator {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 11);
        int b = (int) (Math.random() * 11);

        System.out.println("Number a = " + a);
        System.out.println("Number b = " + b);

        //Greatest or smallest number
        if (a > b) {
            System.out.println(a + " is the greatest");
            System.out.println(b + " is the smallest");
        } else if (a == b) {
            System.out.println(a + " and " + b + " are equal");
        } else {
            System.out.println(b + " is the greatest");
            System.out.println(a + " is the smallest");
        }
    }
}