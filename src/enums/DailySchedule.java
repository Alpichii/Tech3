package enums;

public class DailySchedule {
    public static void main(String[] args) {
         /*
         We can use switch case byte, short, int, String, char, enum

         HOW TO USE switch with enum
         Monday  -> School
         Tuesday -> School + Gym
         Wednesday -> School + Shopping
         Thursday -> School + Go out
         Friday -> Party
         Saturday -> School + Movie
         Sunday -> School + Rest
         */

        Day today = Day.Wednesday;

        switch (today){
            case Monday:
                System.out.println("School + Study");
                break;
            case Tuesday:
                System.out.println("School + Gym");
                break;
            case Wednesday:
                System.out.println("School + Shopping");
                break;
            case Thursday:
                System.out.println("School + Go out");
                break;
            case Friday:
                System.out.println("Party");
                break;
            case Saturday:
                System.out.println("School + Movie");
                break;
            case Sunday:
                System.out.println("School + Rest");
                break;
            default:
                System.out.println("NO DEFAULT");
        }

    }
}







