package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeLocalDate {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println(currentDate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(currentDate.format(dtf));

    }
}
