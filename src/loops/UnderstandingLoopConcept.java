package loops;

public class UnderstandingLoopConcept {
    public static void main(String[] args) {
        //Hello World!

        // write a program that prints only all the even numbers between 0 and 50


        for (int i = 1; i <= 10; i++) { // 0 1 2 3 4 5 6 7 8 9 10
            System.out.println(i);
        }
/*
Write a Java program to print numbers backward starting from 100 to 0 (100 and 0 are included)

Expected output:
100
99
98
.
.
.
2
1
0
 */
        for (int i = 100; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("End of the program!");
    }
}
