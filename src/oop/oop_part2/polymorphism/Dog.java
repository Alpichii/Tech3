package oop.oop_part2.polymorphism;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void eat(String str) {
        System.out.println("Dog eats" + str);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}
