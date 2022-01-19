package oop.oop_part1.class_object.carExample;

import java.util.ArrayList;
import java.util.Arrays;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X6", "suv","White", 2020, 3.5, true );
        Car car2 = new Car( "Chevrolet", "C8", "Coupe", "Black", 2021, 6.2, false);
        Car car3 = new Car("Mercedes", "C Class", "Sedan", "Black", 2020, 3.5, true);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1,car2,car3));

        for (Car Cars : cars) {
            System.out.println("Car's make and model = " + Cars.make + " " + Cars.model + " " + Cars.color +
                    " " + Cars.year + " " + Cars.engineSize + " " + Cars.hasSunRoof);
        }


    }
}
