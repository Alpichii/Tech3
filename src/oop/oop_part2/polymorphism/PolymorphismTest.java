package oop.oop_part2.polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        Animal animal1 =  new Animal();
        animal1.eat();
        animal1.eat("smth");
        animal1.sleep();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.sleep();

        System.out.println("\n---------------\n");
        /*
        EveryDog is an Animal
        but not every Animal is a Dog
         */

        Dog dog2 = new Dog(); // Dog in Dog shape


        System.out.println("\n------up-Casting--------\n");
        Animal dog3 = new Dog(); // Dog in Animal Shape
        dog3.eat(); // Dogs eats // // runtime polymorphism
        dog3.sleep();


        System.out.println("\n-----down-casting---------\n");

       /*
        Dog dog4 = (Dog) new Animal(); // java.lang.classcastexpection
        dog4.eat(); //Animal eats - DOg eats
        */

        Dog dog4 = new Dog();
       Dog dog5 = (Dog) dog4;

        System.out.println("\n=======Collie=======\n");
       
       Object Collie1 = new Collie();
       Animal Collie2 = new Collie();
       Dog Collie3 = new Collie();
       Collie Collie4 = new Collie();


       
       
       
    }
}
