package methods;

import methodUtility.RandomNumberGenerator;

import java.util.Random;

public class FindBiggestRandomNumber {
    public static void main(String[] args) {
        System.out.println(RandomNumberGenerator.getRandomNumber(50, 75));

        int num1 = RandomNumberGenerator.getRandomNumber(50,75);
        int num2 = RandomNumberGenerator.getRandomNumber(50,75);
        int num3 = RandomNumberGenerator.getRandomNumber(50,75);
        int maxOfThree = Math.max(Math.max(num1, num2), num3);
        int minOfThree = Math.min(Math.min(num1, num2), num3);
        System.out.println(num1 + " " + num2 + " " + num3);
        System.out.println(maxOfThree);
        System.out.println(minOfThree);
    }
}
