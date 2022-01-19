package loops;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
Print all numbers starting from 1 to 30 (1 and 30 are included)
If number is divided by 3, then print "Fizz" instead of number
if number is divided by 5, then print "Bazz" instead pf number
if number is divided by both 3 and 5, then print "FizzBazz" 15 30
1
2
Fizz
4
Bazz
Fizz
7
8
Fizz
Bazz
11
Fizz
13
14
FizzBazz
.
.
.
29
FizzBazz

start point = 1
termination point = 30
update = increment (++)
 */
        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
