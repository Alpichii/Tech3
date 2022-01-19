package ifElseStatements;

public class SwitchChar {
    public static void main(String[] args) {
        /*
Write a switch statement that switch characters
case A -> print "This is uppercase first letter"
case Z -> print "This is uppercase last letter"
case a -> print "This is lowercase first letter"
case z -> print "This is lowercase last letter"
all other cases -> print "This is not first or last letter"

 */

        char c ='z';

        switch (c) {
            case 'A':
                System.out.println("This is uppercase first letter");
                break;
            case 'Z':
                System.out.println("This is uppercase last letter");
                break;
            case 'a':
                System.out.println("This is lowercase first letter");
                break;
            case 'z':
                System.out.println("This is lowercase last letter");
                break;
            default:
                System.out.println("This is not first or last letter");
        }
        System.out.println("End of the program");
    }
}
