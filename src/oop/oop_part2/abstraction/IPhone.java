package oop.oop_part2.abstraction;

public class IPhone extends Phone{

    public IPhone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    private final String OS = "IOS";

    public String getOS() {
        return OS;
    }

    @Override
    public void call() {
        System.out.println(brand + " calls");
    }

    @Override
    public void text() {
        System.out.println(brand + " texts");
    }

    @Override
    public void ring() {
        System.out.println(brand + " rings");
    }
}
