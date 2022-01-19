package recapHomeworks;

import java.util.Scanner;

public class RecapHwC3_07 {
    public static void main(String[] args) {

        System.out.println("\n-----------Task1----------\n");
        int generatedNumberT1 = (int) (Math.random() * 51);

        System.out.println(generatedNumberT1 >= 10 && generatedNumberT1 <= 25);


        System.out.println("\n-----------Task2----------\n");
        int generatedNumberT2 = (int) (Math.random() * 100) + 1; // 1 - 100

        if (generatedNumberT2 <= 50) {
            System.out.println(generatedNumberT2 + " is in the 1st half");
            if (generatedNumberT2 <= 25) {
                System.out.println(generatedNumberT2 + " is in the 1st quarter");
            } else {
                System.out.println(generatedNumberT2 + " is in the 2nd quarter");
            }
        } else {
            System.out.println(generatedNumberT2 + " is in the 2nd half");
            if (generatedNumberT2 <= 75) {
                System.out.println(generatedNumberT2 + " is in the 3rd quarter");
            } else {
                System.out.println(generatedNumberT2 + " is in the 4rd quarter");
            }
        }


        System.out.println("\n-----------Task3----------\n");
        Scanner scannerT3 = new Scanner(System.in);

        System.out.println("Please enter numbers between 1 to 10");
        int enteredNumber1T3 = scannerT3.nextInt();
        int enteredNumber2T3 = scannerT3.nextInt();
        int enteredNumber3T3 = scannerT3.nextInt();
        int enteredNumber4T3 = scannerT3.nextInt();
        int enteredNumber5T3 = scannerT3.nextInt();

        int sum = 0;

        if(enteredNumber1T3 >= 1 && enteredNumber1T3 <= 10) sum += enteredNumber1T3 * 5;
        if(enteredNumber2T3 >= 1 && enteredNumber2T3 <= 10) sum += enteredNumber2T3 * 4;
        if(enteredNumber3T3 >= 1 && enteredNumber3T3 <= 10) sum += enteredNumber3T3 * 3;
        if(enteredNumber4T3 >= 1 && enteredNumber4T3 <= 10) sum += enteredNumber4T3 * 2;
        if(enteredNumber5T3 >= 1 && enteredNumber5T3 <= 10) sum += enteredNumber5T3;

        System.out.println(sum);


        /*
        Scanner scannerT3_2 = new Scanner(System.in);

        System.out.println("Please enter numbers between 1 to 10");
        int enterednumber1T3 = scannerT3_2.nextInt();
        int enterednumber2T3 = scannerT3_2.nextInt();
        int enterednumber3T3 = scannerT3_2.nextInt();
        int enterednumber4T3 = scannerT3_2.nextInt();
        int enterednumber5T3 = scannerT3_2.nextInt();

        while(!((enterednumber1T3 > 0 && enterednumber1T3 <= 10) || (enterednumber2T3 > 0 && enterednumber2T3 <= 10) ||
                (enterednumber3T3 > 0 && enterednumber3T3 <= 10) || (enterednumber4T3 > 0 && enterednumber4T3 <= 10) ||
                (enterednumber5T3 > 0 && enterednumber5T3 <= 10))){
            System.out.println("You entered invalid numbers!!!" + "\n" + "Please enter numbers between 1 to 10");
            enterednumber1T3 = scannerT3.nextInt();
            enterednumber2T3 = scannerT3.nextInt();
            enterednumber3T3 = scannerT3.nextInt();
            enterednumber4T3 = scannerT3.nextInt();
            enterednumber5T3 = scannerT3.nextInt();

        }
        System.out.println((enterednumber1T3 * 5) + (enterednumber2T3 * 4) + (enterednumber3T3 * 3) +
                (enterednumber4T3 * 2) + enterednumber5T3);
        */


    }
}
