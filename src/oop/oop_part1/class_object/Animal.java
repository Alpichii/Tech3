package oop.oop_part1.class_object;

import java.util.ArrayList;
import java.util.Arrays;

public class Animal {
    /*
    1. ATTRIBUTES - INSTANCE VARIABLES - STATES
    species
    color
    family
    carnivore
    herbivore
    omnivore
    hasEyes
     */

    final static boolean hasEyes = true;
    String species;
    String color;
    String family;
    boolean isCarnivore;
    boolean isHerbivore;
    boolean isOmnivore;

    public Animal(String lion, String beige, String mammal, boolean b) {
    }

    /*
    2. BEHAVIORS - FUNCTIONS - METHODS
    eat()
    sleep()
    makeSounds()

    Create these methods non-static
     */

    public void eat(){
        System.out.println(species + " eats!");
    }

    public void sleep(){
        System.out.println(species + " sleeps!");
    }

    public void makeSounds(){
        System.out.println(species + " make sounds!");
    }

    //Override toString() method
    @Override
    public String toString() {
        return "[" +
                "species: " + species + ", " +
                "color: " + color + ", " +
                "family: " + family + ", " +
                "isCarnivore: " + isCarnivore + ", " +
                "isHerbivore: " + isHerbivore + ", " +
                "isOmnivore: " + isOmnivore + ", " +
                "hasEyes: " + hasEyes +
                "]";
    }


    public static void main(String[] args) {
        /*
        Create an a1 Animal object
        And define its information as below
        Lion
        Beige
        Mammal
        Carnivore

        Create an a2 Animal object
        And define its information as below
        Cow
        Black
        Mammal
        Herbivore

        Create an a3 Animal object
        And define its information as below
        Cat
        Gray
        Mammal
        Omnivore

        Create an a4 Animal object
        And define its information as below
        Parrot
        White
        Bird
        Herbivore

        Print their information
         */

        Animal a1 = new Animal("Lion", "Beige", "Mammal", true);
        Animal a2 = new Animal("Cow", "Black", "Mammal", true );
        Animal a3 = new Animal("Cat", "Gray", "Mammal", true);
        Animal a4 = new Animal("Parrot", "White", "Bird", true);

        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));

        for (Animal animal : animals) {
            System.out.println("\n-----" + animal.species + "'s info----");
            System.out.println("All info we have for " + animal.species + " is = " + animal);
            System.out.println(animal.species + "'s color is = " + animal.color);
            System.out.println(animal.species + "'s family is = " + animal.family);
            System.out.println(animal.species + " is eating meat = " + animal.isCarnivore);
            System.out.println(animal.species + " is eating plant = " + animal.isHerbivore);
            System.out.println(animal.species + " is eating meat & plant = " + animal.isOmnivore);
        }
    }

}