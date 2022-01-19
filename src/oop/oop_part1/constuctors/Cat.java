package oop.oop_part1.constuctors;

public class Cat {

    public Cat(){
    System.out.println("0-arg constructor");
}
    //Create a 1-arg constructor - name
    public Cat(String name){
        this();
        System.out.println("1-arg constructor");
        this.name = name;
    }

    //Create a 2-arg constructor - name and color
    public Cat(String name, String color){
        this(name);
        System.out.println("2-args constructor");
        this.color = color;
    }

    //Create a 3-arg constructor - name, color and age
    public Cat(String name, String color, int age) {
        this(name, color);
        System.out.println("3-args constructor");
        this.age = age;
    }

    //Create a 4-arg constructor - name, color, age, weight
    public Cat(String name, String color, int age, double weight){
        this(name,color,age);
        System.out.println("4-args constructor");
        this.weight = weight;
    }

    /*
    Define attributes below
    name
    age
    color
    weight
     */

    String name;
    String color;
    int age;
    double weight;


    public static void main(String[] args) {
        Cat cat0 = new Cat();

        Cat cat1 = new Cat("Tom");

        Cat cat2 = new Cat("Azrael", "Black");

        Cat cat3 = new Cat("Fluffy", "White", 1);

        Cat cat4 = new Cat("Garfield", "Orange", 5, 15);
    }
}
