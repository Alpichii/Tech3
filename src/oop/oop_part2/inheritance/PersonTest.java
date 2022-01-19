package oop.oop_part2.inheritance;

import enums.Gender;
import oop.oop_part2.Singer;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25, Gender.MALE);

        System.out.println("\n----Person----\n");
        System.out.println(person1);
        person1.eat();
        person1.learn();
        person1.sleep();
        //person1.code(); Person cannot use Programmer members

        Programmer programmer1 = new Programmer("Alice", 35, Gender.FEMALE, "TechGlobal");

        System.out.println("\n----Person----\n");
        System.out.println(programmer1);
        programmer1.eat();
        programmer1.sleep();
        programmer1.learn();
        programmer1.code();


        Singer singer1 = new Singer();
        singer1.eat();
        singer1.sleep();
        singer1.learn();

    }
}
