package oop.oop_part2.polymorphism;

public class Animal {

    public void eat(){
        System.out.println("Animal eats");
    }

    public void eat(String str){
        System.out.println("Animal eats" + str);
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }

}
