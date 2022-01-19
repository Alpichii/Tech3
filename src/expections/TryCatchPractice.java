package expections;

public class TryCatchPractice {
    public static void main(String[] args) {

        String name = "John";
        int[] numbers = {1, 2, 3, 5};

        String address = null;

        //Even if this line throws an exception continue with the rest of the program
        try{
            System.out.println(name.charAt(2));//StringIndexOutOfBoundsException - IndexOutOfBoundsException - Exception
            System.out.println(numbers[1]);
            System.out.println(address.contains("Chicago")); // NullPointerException
        }
        catch (Exception exception){
            System.out.println("The exception caught : " + exception.getMessage());
        }

        System.out.println("End of the program!");
    }
}