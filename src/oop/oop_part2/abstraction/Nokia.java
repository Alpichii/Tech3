package oop.oop_part2.abstraction;

public class Nokia extends Phone {

    public Nokia(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    private final String OS = "Android";

    public String getOS() {
        return "Android";
    }


    @Override
    public void call() {
        if (3310 > 0) {
            System.out.println(brand + " calls");
        } else {
            System.out.println(brand + "does not calls");
        }

    }
        @Override
        public void text () {
            System.out.println(brand + " texts");
        }

        @Override
        public void ring () {
            System.out.println(brand + " rings");
        }
    }
