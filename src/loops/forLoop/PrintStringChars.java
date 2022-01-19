package loops.forLoop;

public class PrintStringChars {
    public static void main(String[] args) {
/*
   Write a Java program to print each character of given String in a separate line:

String str = "TechGlobal School";

   Expected output:
   T
   e
   c
   .
   .
   .
   o
   o
   l
    */
        String s = "TechGlobal School";

        int countO = 0;

        for (int j = 0; j <= s.length()-1; j++) {
            System.out.println(s.charAt(j));
            if(s.charAt(j) == 'o') countO++;
        }


        System.out.println("The total occurrences of letter o is = " + countO);
    }
    }
