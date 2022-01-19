package oop.oop_part2.inheritance;

import oop.oop_part2.inheritance.Food;

public class Vegetable extends Food {

    //default constructor
    public Vegetable(){

    }

    //Custom constructor
    public Vegetable(String name, String color, String taste){
        super(name, taste);
        this.color = color;
    }

    public String color;

    @Override
    public String toString() {
        return "Vegetable{" +
                "taste='" + super.taste + '\'' +
                ", name='" + super.name + '\'' +
                ", isSpicy=" + super.isSpicy +
                ", isSweet=" + super.isSweet +
                ", color='" + this.color + '\'' +
                ", isOrganic='" + super.getIsOrganic() + '\'' +
                '}';
    }
}