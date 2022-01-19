package mathClassMethods;

public class AverageOf5Numbers {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            int first = (int) (Math.random() * 11);
            int second = (int) (Math.random() * 11) + 10;
            int third = (int) (Math.random() * 11) + 20;
            int fourth = (int) (Math.random() * 11) + 30;
            int fifth = (int) (Math.random() * 11) + 40;
            int average = ((first + second + third + fourth + fifth) / 5);


            System.out.println("Number 1 = " + first);
            System.out.println("Number 2 = " + second);
            System.out.println("Number 3 = " + third);
            System.out.println("Number 4 = " + fourth);
            System.out.println("Number 5 = " + fifth);
            System.out.println("The Average of these numbers = " + average);


            // Akin solution


        }
    }
}
