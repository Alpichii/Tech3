package loops.doWhileLoop;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit;
        do {
            System.out.println("Please different fruit name:");
            fruit =input.nextLine();
        }
        while (!fruit.equalsIgnoreCase("apple"));
        System.out.println(fruit);
    }
}
