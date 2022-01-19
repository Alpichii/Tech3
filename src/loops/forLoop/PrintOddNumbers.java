package loops.forLoop;

import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter a odd number");
        int oddNum = scan.nextInt();

        if (oddNum % 2 == 0)
            System.out.println("You Entered invalid number \nPLEASE ENTER ODD NUMBER");
        else
            for (int i =0; i <= oddNum; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }
