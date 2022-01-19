package loops.whileLoop;


import methodUtility.RandomNumberGenerator;

public class Random7 {
    public static void main(String[] args) {
        /*
        Write a program that keeps generating random numbers bt 1 to 50
        until it generates 7
        count the attempts to get 7
        */

        int randomNumber = RandomNumberGenerator.getRandomNumber(1, 50);
        int attempt = 1;
        System.out.println("Attempt " + attempt + " is = " + randomNumber);

        while(randomNumber != 7){
            randomNumber = RandomNumberGenerator.getRandomNumber(1, 50);
            attempt++;
            System.out.println("Attempt " + attempt + " is = " + randomNumber);
        }

    }
}

