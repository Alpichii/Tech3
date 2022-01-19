package memoryManagement;

import oop.oop_part1.constuctors.Dog;

public class DataTypes {
    public static void main(String[] args) {

        int age;
        age = 45;
        System.out.println(age);

        Dog dog1 = new Dog(); // Reference types
        System.out.println(dog1); // it goes to stack to find dog1, Then, dog1 is going to get info for the Dog object from heap

        Dog dog2 = new Dog(); // with each new keyword a new object will be created in the heap
        System.out.println(dog2);

        Dog dog3 = dog2;

        System.out.println(dog1.equals(dog2)); // false
        System.out.println(dog2.equals(dog3)); // true
    }
}