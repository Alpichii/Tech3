package mathClassMethods;

import java.sql.PseudoColumnUsage;

public class RandomNumbers {
    public static void main(String[] args) {
        /*
        Math.random()  returns a random number between 0 and 1
        (int)(Math.random() * 10) - this will return number between 0 and 10
        0 is included but 10 is not included

        (int)(Math.random() * 10) + 1 - this will return number between 0 and 10
        0 is not included but 10 is included
         */
        System.out.println((int)(Math.random() * 10) + 1);


        /*
        How to get a random number between 0 and 100 both included
         */
        System.out.println((int)(Math.random() * 101));


        //How to get random numbers between 0 and 33 both included
        System.out.println((int)(Math.random() * 34));


        //How to get random numbers between 7 and 9 both included 7, 8, 9
        System.out.println( (int)(Math.random() * 3) + 7);

        //How to get numbers between -23 to -27 both included -23 -24 -25 -26 -27
        System.out.println( ((int)(Math.random() * 5)) - 27);

        /*

         */
        /*
        Math.random() returns a random number between 0 and 1
        (int)(Math.random() * 10 - this will return number between 0 and 10
        0 is included but 10 is not included
         */
        /*
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println((int) Math.random() * 10);
        System.out.println((int) (Math.random() * 10) + 1);


        System.out.println((int) (Math.random()) * 34);
        */
        /*
        for (int i = 0; i < 1000; i++) {
            System.out.println((int)(Math.random()*3 + 7));
        */
/*
        for (int i = 0; i < 100; i++) {
            System.out.println((int)(Math.random() * 5) - 27);//   -23 -24 -25 -26 -27
*/

        int firstNumber = (int)((Math.random()) * 11);
        int secondNumber = (int)((Math.random()) * 11);
        int average = (firstNumber + secondNumber) / 2;

        System.out.println("First number is = " + firstNumber +"\nSecond Number is = " +secondNumber
                + "\nAverage of " + firstNumber + " and " + secondNumber + " = " + average);



        }
    }
