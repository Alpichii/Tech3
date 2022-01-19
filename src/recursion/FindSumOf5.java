package recursion;

public class FindSumOf5 {
    /*
    Write a method that finds 1+2+3+4+5
    And return sum
     */

    //Non-recursive solution
    public static int sumOf5(){
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }

    //Recursive method
    public static int sumOf5Recursive(int num){
        if(num > 0) return num + sumOf5Recursive(num-1); // 5 + 4 + 3 +2 + 1 + 0
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumOf5());

        System.out.println(sumOf5Recursive(5));
    }
}
