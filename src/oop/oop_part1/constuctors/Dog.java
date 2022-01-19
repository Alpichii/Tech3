package oop.oop_part1.constuctors;

public class Dog {

    //Hidden default constructor
    public Dog() {

    }

    public Dog(String breed, String name, String size) {
        this.breed = breed;
        this.name = name;
        this.size = size;
    }

    //Custom overloaded constructor - constructor chaining
    public Dog(String breed, String name, String size, String gender, String color, int age) {
        this(breed, name, size); // should be always first line in the body
        this.gender = gender;
        this.color = color;
        this.age = age;
    }


    //Instance variables
    public static final boolean hasTale = true;
    String breed;
    String name;
    String gender;
    String color;
    String size;
    int age;

    void barks() {
        System.out.println(this.breed + " barks");
    }

    void runs() {
        System.out.println(this.breed + " runs");
    }

    void eats() {
        System.out.println(this.breed + " eats");
    }

    //Override the toString() method
    public String toString() {
        return "[" +
                "breed: " + this.breed + ", " +
                "name: " + this.name + ", " +
                "gender: " + this.gender + ", " +
                "size: " + this.size + ", " +
                "color: " + this.color + ", " +
                "age: " + this.age + ", " +
                "hasTale: " + hasTale +
                "]";
    }


    //-------------------------------------------------
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Huskey";

        dog1.barks();
        dog1.runs();
        dog1.eats();


        /*
        Create a new dog2 object and give below info
        breed = German Shepherd
        name = Boomer
        gender = female
        size = medium
        color = white
        age = 5
         */
        Dog dog2 = new Dog("German Shepherd", "Boomer", "Female", "Medium", "White", 5);
        System.out.println(dog2);

        /*
        2 ways of instantiating Dog objects
        Instantiate Dog object with only breed, name and size
         */

        Dog dog3 = new Dog("German Shepherd", "Boomer", "Medium");
        dog3.age = 3;
        System.out.println(dog3);

    }
}

