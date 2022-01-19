package practiceWithSalih;

import java.util.Scanner;

public class LearningConcatenation {
    public static void main(String[] args) {
        Scanner inputScan;
        inputScan = new Scanner(System.in);

        System.out.println("what is your first name?");
        String firstName = inputScan.nextLine();

        System.out.println("what is your last name?");
        String lastName = inputScan.nextLine();

        System.out.println("what is your weight?");
        String lbs = inputScan.nextLine();

        System.out.println("what is your favorite number?");
        String favNumber = inputScan.nextLine();

        System.out.println("what is your gender?");
        String sex = inputScan.nextLine();

        System.out.println("what is your favorite color?");
        String color = inputScan.nextLine();

        System.out.println("First Name = " + firstName + "\nLast Name = " + lastName + "\nWeight = " + lbs +
                "\nFavorite Number = " + favNumber + "\nGender = " + sex + "\nFavorite Color = " + color);

    }
}



//---------------- Salih's code as example--------------------
/*
        Scanner inputScan;
        inputScan = new Scanner(System.in);

        System.out.println("what is your first name?");
        String firstName = inputScan.nextLine();

        System.out.println("what is your last name?");
        String lastName = inputScan.nextLine();

        System.out.println("what is your weight?");
        String weight = inputScan.nextLine();

        System.out.println("what is your favorite number?");
        String favNumber = inputScan.nextLine();

        System.out.println("what is your gender?");
        String sex = inputScan.nextLine();

        System.out.println("what is your color?");
        String color = inputScan.nextLine();
     ------------------------------------------
      int num1 = 45;
int num2 = 32;

double divisionResult =  (double) num1 / (double)num2;

System.out.println("num1 + num2 = " + (num1 + num2));  //4532
System.out.println("num1 - num2 = " + (num1 - num2));
System.out.println("num1 / num2 = " + divisionResult);
System.out.println("num1 * num2 = " + (num1 * num2));


   }
}
 */