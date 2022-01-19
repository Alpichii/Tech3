package expections;

public class Permissions {

   /*
    Create a method that checks age of user, takes an argument age
    if age is more than 16, it is allowed to have driver licence -> You are allowed to have driver licence!
    if the age is less than 16, the method will throw an exception
    "Age of {age} is not allowed to have driver licence"
     */

    public void checkAge(int age){
        if(age > 16) System.out.println("You are allowed to have driver licence!");
        else throw new RuntimeException("Age of " + age + " is not allowed to have driver licence");
    }

    /*
    Create a method that takes an int as an argument to state the day in the week
    1 - Sunday
    2 - Monday
    7 - Saturday
    method name = checkIn()
    if it is weekday user is allowed to check in from 10 AM to 5 PM -> Check in hours are from 10 AM to 5 PM
    if it is weekend user is allowed to check in 10 AM to 3 PM -> Check in hours are from 10 AM to 3 PM
    if the input is not in the range of 1-7, then throw an exception with message
    "The input does not represent any day!!!"
     */

    public void checkIn(int day){
        switch (day) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Check in hours are from 10 AM to 5 PM");
                break;
            case 1:
            case 7:
                System.out.println("Check in hours are from 10 AM to 3 PM");
                break;
            default : throw new RuntimeException("The input " + day + " does not represent any day!!!");
        }
    }
}






