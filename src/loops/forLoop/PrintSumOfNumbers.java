package loops.forLoop;

public class PrintSumOfNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to find sum of number from 10 to 150 ( 10 and 15 are included)

        Expected output:
        75

        10 + 11 + 12 + 13 + 14 + 15 = 75
         */
        int sum = 0;

        for (int i= 10; i <= 15; i++){
            sum += i;
            System.out.println(sum);
        }
    }
}
