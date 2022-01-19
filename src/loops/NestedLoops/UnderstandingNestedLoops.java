package loops.NestedLoops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Outer: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("    Inner: " + j);
                for (int k = 1; k <= 2; k++) {
                    System.out.println("        Inner's inner: " + k);
                }
            }
        }
    }
}
