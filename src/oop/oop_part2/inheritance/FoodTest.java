package oop.oop_part2.inheritance;

public class FoodTest {
    public static void main(String[] args) {
        Food food1 = new Food("Apple", "Sweet");
        food1.isSpicy = false;
        food1.isSweet = true;
        food1.setIsOrganic(true, "1234"); // Exception

        System.out.println(food1);

        Vegetable vegetable1 = new Vegetable("Cucumber", "Green", "Juicy");
        //vegetable1.isSpicy = false;
        //vegetable1.isSweet = false;
        vegetable1.setIsOrganic(true, "1234");

        System.out.println(vegetable1);

        /*
        Food is a Food
        Vegetable is a Vegetable
        Vegetable is a Food
         */

        Food food2 = new Vegetable("Eggplant", "Purple", "Smth");

        System.out.println(food2);

        //Food food1, Food food2, Vegetable vegetable1

        System.out.println("\n------All foods in collection-------\n");
        Food[] foods = {food1, food2, vegetable1};

        for (Food food : foods) {
            System.out.println(food.name + "'s info = " + food);
        }

    }
}