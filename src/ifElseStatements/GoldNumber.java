package ifElseStatements;

public class GoldNumber {
    public static void main(String[] args) {
/*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points

        POSITIVE     -> 10
        MORE THAN 25 -> 10
        -7           -> 10
        7            -> 100
        */

        int randomNumber = (int) (Math.random() * 101) - 50;
        System.out.println("The random number is = " + randomNumber);
        int sum = 0;

        if(randomNumber > 0){
            sum += 10;
            if(randomNumber == 7){
                sum += 100;
            }
            else if(randomNumber > 25){
                sum += 10;
            }
        }
        else if (randomNumber == -7){
            sum += 10;
        }
        else{
            System.out.println("LOSER!!!");
        }

        System.out.println("You won " + sum + " points!!!");

        System.out.println("End of the program!");
    }
}
