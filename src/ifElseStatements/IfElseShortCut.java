package ifElseStatements;

import methodUtility.ScannerUtility;

public class IfElseShortCut {
    public static void main(String[] args) {

        int age = ScannerUtility.askAge();
        System.out.println("Age is = " + age);

        if (age < 16){
            System.out.println("You cannot join the club");
        }
        else if (age >= 16 && age < 21){
            System.out.println("You might joining the club");
        }
        else{
            System.out.println("You welcome to join the club!");
        }
    }
}
