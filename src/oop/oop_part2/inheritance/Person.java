package oop.oop_part2.inheritance;

import enums.Gender;

public class Person {

    protected Person(){

    }

    protected Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected String name;
    protected int age;
    protected Gender gender;


    protected void eat(){
        System.out.println(this.name + " eats");
    }

    protected void sleep(){
        System.out.println(this.name + " sleeps");
    }

    protected void learn(){
        System.out.println(this.name + " learns");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}