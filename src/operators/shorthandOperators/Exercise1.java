package operators.shorthandOperators;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Exercise1 {

    /*
    Create 1 int variable
    int a = 8;
    Subtraction = 6
    Division = 4
    multiplication = 16
    Remainder = =
     */
    public static void main(String[] args) {

        int a =  8;

        a += 2;
        System.out.println("Addition = " + a);
        a = 8;
        a -= 2;
        System.out.println("Subtraction = " + a);

        a = 8;
        System.out.println("Multiplication = " + (a /= 2));
        a %= 8;
        System.out.println("Remainder = " +  (a %= 2));

    }
}
