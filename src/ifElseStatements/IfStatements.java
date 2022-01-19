package ifElseStatements;

public class IfStatements {
    public static void main(String[] args) {

        System.out.println("--------Task-1----------");
        int age = 40;

        if (age > 25) {
            System.out.println("The age is = " + age);
            System.out.println("You are in the club!");
        }

        System.out.println("--------Task-2----------");
        /*
        Create a boolean variable and assign it true if weather is rainy, false otherwise
        if it is rainy, print "The weather is rainy today"
        if weather  is not rainy, then print "The weather is nice today"
        Otherwise, do not print anything
         */
        boolean isRainy = true;

        if(isRainy){
            System.out.println("The weather is rainy today");
        }
        else {
            System.out.println("The weather is nice today");
        }

        boolean isBlue = false;
        boolean isPink = false;

        if(isBlue){

        }
        else if(isPink){
        }
        else{
            System.out.println("Another color");
        }
        System.out.println("End of the program!");
    }
}
