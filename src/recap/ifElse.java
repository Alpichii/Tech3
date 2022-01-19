package recap;

public class ifElse {
    public static void main(String[] args) {
        int fahrenheit = 30;

        if (fahrenheit <= 40) {
            System.out.println("It is cold");
        } else if (fahrenheit <= 60) {
            System.out.println("It is okay");
        } else if (fahrenheit <= 75) {
            System.out.println("It is warm");
        } else {
            System.out.println("it is hot");
        }


        int age = 13; // thirteen

        if(age < 13){
            System.out.println("Kid");
        }
        else if(age <= 19) {
            System.out.println("Teenager");
        }
        else{
            System.out.println("Adult");
        }

        int number  = 7;

        if(number > 0){
            System.out.println("POSITIVE");
        }else{
            System.out.println("NOT POSITIVE");
        }
        if(number > 0 && number == 7){
            System.out.println("The Number is my favorite number");
        }else {
            System.out.println("It is not my favorite number");
        }





    }
}