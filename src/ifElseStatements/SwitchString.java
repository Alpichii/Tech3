package ifElseStatements;

public class SwitchString {
    public static void main(String[] args) {
        /*
Write a switch statement that switch cities
case London -> print "This is England"
case Paris -> print "This is France"
case Porto -> print "This is Portugal"
case Berlin -> print "This is Germany"
all other cases -> print "This is not in the list"
 */
        String city = "London";

        switch (city) {
            case "London":
                System.out.println("This is England");
                break;
            case "Paris":
                System.out.println("This is France");
                break;
            case "Porto":
                System.out.println("This is Portugal");
                break;
            case "Berlin":
                System.out.println("This is Germany");
                break;
            default:
                System.out.println("This is not in the list");


                System.out.println("End of the program");
        }
    }
}