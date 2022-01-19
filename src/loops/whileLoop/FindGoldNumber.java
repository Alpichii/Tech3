package loops.whileLoop;

import java.util.Scanner;

public class FindGoldNumber {
    public static void main(String[] args) {

        int goldNumber = 7;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userNumber = scan.nextInt();

        while(userNumber != goldNumber){
            System.out.println("Please enter a new number");
            userNumber= scan.nextInt();
        }
        System.out.println("you win $1000");
    }
}
