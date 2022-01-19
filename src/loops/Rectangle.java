package loops;

public class Rectangle {
    public static void main(String[] args) {
        String s = "* * * ";
        for (int i = 1; i <= 9; i++) {
            if (i <= 3) System.out.println(s);
            else if (i <= 6) System.out.println(s + s);
            else System.out.println(s + s + s);
        }
        for (int i = 0; i < 10; i++) {
            if (i < 4) System.out.println("* * *");
            else if (i >= 4 && i <= 6) System.out.println("* * * * * *");
            else if (i >= 7 && i <= 9) System.out.println("* * * * * * * * * * * *");
        }
        String st = "*";
        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
            st += " * ";
            i++;
        }

    }
}