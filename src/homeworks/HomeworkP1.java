package homeworks;

import java.util.Scanner;

public class HomeworkP1 {
    public static void main(String[] args) {
        System.out.println("\n----------HomeworkP1-Task1-------------");
        String str = "SDLC is step by step procedure to create an application";
        str = str.toLowerCase();

        System.out.println(str.length());
        System.out.println(str.indexOf("sdlc"));
        System.out.println(str.lastIndexOf("application"));

        System.out.println("\n----------HomeworkP1-Task2-------------");
        String str2 = "   I know how to code with Pyhton   ";
        str2 = str2.toUpperCase().replace("PYHTON", "JAVA");

        System.out.println(str2);

        System.out.println("\n----------HomeworkP1-Task3-------------");
        String str3 = "     SDLC has planning, design," +
                " development, testing, deployment and maintenance phases    ";

        str3 = str3.trim();

        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(str3.length() - 1));

        System.out.println("\n----------HomeworkP1-Task4-------------");
        String s1 = "   TECH  ";
        String s2 = "  glo    ";
        String s3 = "  BAL        ";

        String s4 = (s1.trim() + s2.trim() + s3.trim()).toLowerCase().replace('t', 'T')
                .replace('g', 'G');

        System.out.println(s4);

        System.out.println("\n----------HomeworkP1-Task5-------------");
        Scanner scan = new Scanner(System.in);
        System.out.println(" Please enter your favorite color: ");
        String favColor = scan.nextLine();

        char firstChar = favColor.charAt(0);
        char lastChar = favColor.charAt(favColor.length() - 1);

        System.out.println(firstChar + " " + lastChar);
        System.out.println("1st character is = " + firstChar);
        System.out.println("2nd character is = " + lastChar);
        System.out.println("First 3 characters are = " + favColor.substring(0, 3));
        System.out.println("Last 3 characters are = " + favColor.substring(favColor.length() - 3));

        System.out.println("\n----------HomeworkP1-Task6-------------");
        System.out.println(" Please enter a full sentence");
        String sen = scan.nextLine();
        sen = sen.toLowerCase();

        String first = sen.substring(0, sen.indexOf(" "));
        String last = sen.substring(sen.lastIndexOf(" ") + 1);

        System.out.println("1st word is = " + first);
        System.out.println("2st word is = " + last);

        System.out.println("\n----------HomeworkP1-Task7-------------");
        System.out.println("Please enter a full sentence");
        String s7 = scan.nextLine();

        s7 = s7.toUpperCase();
        boolean contain$ = s7.contains("$");
        if (contain$ == true) {
            System.out.println("This sentence contains $ character \n$ character's index is = " + s7.indexOf('$'));
        }else{
            System.out.println("This sentence does not contain $ character");
        }
    }
}
