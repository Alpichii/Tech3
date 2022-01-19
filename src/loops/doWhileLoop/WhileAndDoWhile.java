package loops.doWhileLoop;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        /*
        Write a program to increase value of i by 2 until it becomes more than 25
        This is better to be solved with while loop - not do while
         */

        int i = 10;

        while(i <= 25){
            i += 2;
        }

        System.out.println(i); // 26
        System.out.println("End of the program");
    }
}
