package methodUtility;

public class Printer {
    //create methods here

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    //printMyInfo() -
    public static void printMyInfo() {
        System.out.println("My name is John");
        System.out.println("My last name is Doe");
        System.out.println("My age is 40");
        System.out.println("I am from Earth");
        System.out.println("I like Moon and Sun");
    }

    //printInfo() works for everyone dynamically
    public static void printInfo(String name, String lName, int age, String country, String hobbies){
        System.out.println("My name is " + name);
        System.out.println("My last name is " + lName);
        System.out.println("My age is " + age);
        System.out.println("I am from " + country);
        System.out.println("I like " + hobbies);
    }
}



















