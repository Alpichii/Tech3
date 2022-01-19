package ifElseStatements;

import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt();
        if(number > 100) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        System.out.println("End of the program");
    }
}
