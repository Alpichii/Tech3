package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {

        System.out.println("----------Task-1----------");
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 51);

        System.out.println(random);

        if (random >= 10 && random <= 25) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("----------Task-2----------");

        int ranNum = (int) (Math.random() * 100) + 1;
        System.out.println(ranNum);
        if (ranNum <= 25) {
            System.out.println("1st quarter is 1-25 " + " Number is " + ranNum);
        } else if (ranNum <= 50) {
            System.out.println("2nd quarter is 26-50" + " Number is " + ranNum);
        } else if (ranNum <= 75) {
            System.out.println("4th quarter is 76-100" + " Number is " + ranNum);
        }
        if (ranNum <= 50 && ranNum >=1) {
            System.out.println("1st half is 1-50" + " Number is " + ranNum);
        } else if (ranNum > 50 && ranNum <= 100) {
            System.out.println("2nd half is 51-100 " + " Number is " + ranNum);
        }
        System.out.println("----------Task-3----------");

        System.out.println("Please enter 5 numbers between 1 to 10");

        int firNum = input.nextInt();
        int secNum = input.nextInt();
        int thirdNum = input.nextInt();
        int fouNum = input.nextInt();
        int fivNum = input.nextInt();

        System.out.println((firNum * 5) + (secNum * 4) + (thirdNum * 3) + (fouNum * 2) + fivNum);

        if (firNum >= 1 && firNum <= 10 && secNum >= 1 && secNum <= 10 && thirdNum >= 1 && thirdNum <= 10 && fouNum >= 1
                && fouNum <= 10 && fivNum >= 1 && fivNum <= 10) {
        } else {
            System.out.println("You entered invalid number!!!! \nZERO POINT \n !!!LOSER!!!");
        }
    }
}
