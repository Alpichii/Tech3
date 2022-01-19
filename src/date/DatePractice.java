package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {
    public static void main(String[] args) {
            Date currentDate = new Date();
            System.out.println(currentDate);

            //Print whatever is today -> current day
            SimpleDateFormat sdf = new SimpleDateFormat("EEE");
            String day = sdf.format(currentDate);

            System.out.println(day);

            // Print date in the format of MM/dd/yyyy
            sdf = new SimpleDateFormat("MM-dd-yyyy");
            System.out.println(sdf.format(currentDate)); // 11/09/2021

            // Print date in the format of Tue hh:mm PM
            sdf = new SimpleDateFormat("EEE hh:mm a");
            System.out.println(sdf.format(currentDate));
        }
    }

