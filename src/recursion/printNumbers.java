package recursion;

class PrintNumbers {

    /*
    Create a method that takes an positive int as an argument
    and prints number starting 1 to number itself
    printNumbers

    EXAMPLE: 5
    1
    2
    3
    4
    5
     */

    //Non-recursive regular solution
    public static void printNumbers(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }


    //Recursive solution 5
    public static void printNumbers2(int number){
        System.out.println(number);
        if(number > 1) printNumbers2(number-1);
    }


    public static void main(String[] args) {
        //printNumbers(5);
        printNumbers2(20);
    }

}



















