package homeworks; //salih

public class HomeworkR1 {
    public static void main(String[] args) {

        System.out.println("\n---TASK-1---\n");
        String s1 = "JavaScript";

        if (s1.length() >= 1) {
            System.out.println("Length is = " + s1.length());
            System.out.println("First char is = " + s1.charAt(0)); //first char
            System.out.println("Last char is = " + s1.charAt(s1.length() - 1));

            if (s1.toLowerCase().contains("a") || s1.toLowerCase().contains("e") || s1.toLowerCase().contains("i")
                    || s1.toLowerCase().contains("o") || s1.toLowerCase().contains("u")) {
                System.out.println("This String has vowel");
            } else {
                System.out.println("This String does not have vowel");
            }
        } else {
            System.out.println("Length is zero");
        }

        System.out.println("\n---TASK-2---\n");
        String s2 = "civic";

        if (s2.length() >= 3) {
            if (s2.length() % 2 == 0) { // for even strings
                System.out.println(s2.substring(s2.length() / 2 - 1, s2.length() / 2 + 1));
            } else { // for the odd strings
                System.out.println(s2.charAt(s2.length() / 2));
            }
        } else {
            System.out.println("Length is less than 3");
        }

        System.out.println("\n---TASK-3---\n");
        String s3 = "Python";

        if (s3.length() >= 4) {
            System.out.println("First 2 characters are = " + s3.substring(0, 2));
            System.out.println("Last 2 characters are = " + s3.substring(s3.length() - 2));
            System.out.println("The other characters are = " + s3.substring(2, s3.length() - 2));
        } else {
            System.out.println("INVALID INPUT");
        }

        System.out.println("\n---TASK-4---\n");
        String s4 = "x";
        if (s4.length() >= 2) {
            System.out.println(s4.substring(0, 2).equalsIgnoreCase(s4.substring(s4.length() - 2)));
        } else {
            System.out.println("Length is less than 2");
        }

        System.out.println("\n---TASK-5---\n");
        String s5One = "Orange";
        String s5Two = "Red";

        if (s5One.length() >= 2 && s5Two.length() >= 2) {
            System.out.println(s5One.substring(1, s5One.length() - 1).concat(s5Two.substring(1, s5Two.length() - 1)));
        } else {
            System.out.println("INVALID INPUT");
        }

        System.out.println("\n---TASK-6---\n");
        String s6 = "xxgreenxx";
        s6 = s6.toLowerCase();
        if (s6.length() > 3) { // s6.length() >= 4
            boolean isFirstTwoXx = s6.indexOf("xx") == 0;
            boolean isLastTwoXx = s6.lastIndexOf("xx") == s6.length() - 2;

            System.out.println(isFirstTwoXx && isLastTwoXx);
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}