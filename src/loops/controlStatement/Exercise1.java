package loops.controlStatement;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //write a program that prints numbers from 1 to 30

        //from these numbers, skip all that can be divided by 4
        // 1 2 3 5 6 7 9 10 11 13 14 15

        //from these numbers, do not print any number that is more than 15

        for (int i = 1; i <= 30; i++) {
            if(i % 4 == 0) continue;
            if(i > 15) break;
            System.out.println(i);
        }
    }
}
