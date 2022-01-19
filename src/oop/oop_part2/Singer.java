package oop.oop_part2;

import enums.Gender;
import oop.oop_part2.inheritance.Person;

public class Singer extends Person {
    public Singer(){

    }

    Singer(String name, int age, Gender gender, String bandName){
        super(name, age, gender);
        this.bandName = bandName;
    }

    String bandName;
}