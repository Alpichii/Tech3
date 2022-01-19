package loops.forLoop;

public class PrintNumbersDividedBy4And5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 45; i++) {
            if (i % 4 == 0 && i % 5 == 0) ;
            System.out.println(i);
        }
    }
}