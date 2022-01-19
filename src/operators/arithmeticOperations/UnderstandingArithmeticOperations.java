package operators.arithmeticOperations;

public class UnderstandingArithmeticOperations {
    public static void main(String[] args) {
        int age = 40; // assignment operator

        System.out.println("Current age = " + age); // 40

        //What will be the age after 25 years
        age = 65; // re-assignment

        System.out.println("Age after 25 years = " + age); // 65


        String name = "John";
        System.out.println("The name is = " + name);
        name = "Lionel";


        System.out.println("\n----------ADDITION------------\n");
        //Addition
        int addition = 3 + 7;
        System.out.println("The sum of 3 and 7 is = " + addition);

        int number1 = 20;
        int number2 = 3;

        int sumOfNumbers = number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is = " + sumOfNumbers);

        System.out.println("\n----------SUBTRACTION------------\n");
        //Subtraction

        int subtraction = 10 - 8;
        System.out.println("The subtraction result of 10 and 8 is = " + subtraction);
        int subtractionOfNumbers = number1 - number2;
        System.out.println("The subtraction of " + number1 + " and " + number2 + " is = " + subtractionOfNumbers);

        System.out.println("\n----------DIVISION------------\n");
        //Division - Please divide number1 with number2 and print result with a nice message

        int divisionOfNumbers = number1 / number2; // 20 / 3 = 6
        System.out.println("The division of " + number1 + " and " + number2 + " is = " + divisionOfNumbers);

        System.out.println("\n----------MULTIPLICATION------------\n");
        //Multiplication - Please multiply number1 with number2 and print result with a nice message
        int productOfNumbers = number1 * number2;
        System.out.println("The product of " + number1 + " and " + number2 + " is = " + productOfNumbers);

        System.out.println("\n----------REMAINDER------------\n");
        //Remainder - Please find remainder of number1 with number2 and print result with a nice message
        int remainderOFNumbers = number1 % number2;
        System.out.println("The remainder of " + number1 + " with " + number2 + " is = " + remainderOFNumbers);




    }
}
