package oop.oop_part1.class_object.fruitExample;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitTest {

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("banana", "yellow", "moon shape", false ,true);
        Fruit fruit2 = new Fruit("apple", "red", "sphere", true ,false);
        Fruit fruit3 = new Fruit("avocado", "green", "oval", false, true);
        Fruit fruit4 = new Fruit("orange", "orange", "sphere", true, true);

        ArrayList<Fruit> fruits = new ArrayList<>(Arrays.asList(fruit1, fruit2, fruit3, fruit4));

        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
