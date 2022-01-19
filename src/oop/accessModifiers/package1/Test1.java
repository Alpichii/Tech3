package oop.accessModifiers.package1;

public class Test1 {
    public static void main(String[] args) {
        Mercedes m1 = new Mercedes();

        System.out.println(Mercedes.make);
        System.out.println(m1.model); //null

        m1.drive();

        // Tesla t1 = new Tesla(); //constructor is private
        // t1.drive(); // private method

        System.out.println(m1.price); // 0.0
        //System.out.println(t1.price); price is not accessible

    }
}
