package oop.oop_part2.inheritance;

import enums.Gender;

public class Programmer extends Person{
    String companyName;

    Programmer(){

    }

    Programmer(String name, int age, Gender gender, String companyName) {
        super(name, age, gender);
//        super.age = age;
//        super.name = name;
//        super.gender = gender;
        this.companyName = companyName;
    }

    void code(){
        System.out.println(this.name + " codes");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}