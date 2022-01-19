package homeworks;

public class Training {
    public static void main(String[] args) {
        int inputNumber1 = 4;
        int inputNumber2 = 8;
        int inputNumber3 = 8;


        if ((inputNumber1 == inputNumber2 && inputNumber1 == inputNumber3 && inputNumber2 == inputNumber3)) {
            System.out.println("TRIPLE MATCH");
        } else if (inputNumber1 == inputNumber2 || inputNumber1 == inputNumber3 || inputNumber2 == inputNumber3) {
            System.out.println("double match ");
        } else {
            System.out.println("NO MATCH");
        }


    }
}