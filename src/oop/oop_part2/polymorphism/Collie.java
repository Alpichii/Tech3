package oop.oop_part2.polymorphism;

public class Collie extends Dog {
    @Override
    public void eat() {
        System.out.println("Collie eats");
    }

    @Override
    public void sleep() {
        System.out.println("Collie sleep");
    }

    public void protect(){
        System.out.println("Collie poretect");
    }



}
