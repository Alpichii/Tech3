package enums;

import java.time.Month;
import java.util.Arrays;

public class TestEnums {
    public static void main(String[] args) {
        System.out.println(Day.Monday);
        System.out.println(Day.Tuesday);
        System.out.println(Day.Wednesday);

        System.out.println("\n----Print each day----\n");
        for (Day day: Day.values()) {
            System.out.println(day);
        }

        System.out.println("\n-----Testing Month enum-----\n");
        for(Months month : Months.values()){
            System.out.println(month);
        }
        System.out.println(Months.May);

        System.out.println("\n-----Print in Arrays-----");
        Months[] allMonths = Months.values();  // assigning to Array
        System.out.println(Arrays.toString(allMonths));

        System.out.println("\n-----When you  want it in String-----\n");
        Month[] allMonth = Month.values();
        String firstDay = Day.Sunday.toString();



/*
Create a Month enum
Declare all 12 months in it
Then, in the TestEnum class, print 5th and 8th month
Then, print all months one by one
white_check_mark
eyes
raised_hands
React
Reply

6:23

 */

        
    }
}


