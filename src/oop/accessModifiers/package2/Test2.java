package oop.accessModifiers.package2;

import oop.accessModifiers.package1.Mercedes;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(Mercedes.make);

        Mercedes m1 = new Mercedes();

        System.out.println(m1.model);

        m1.drive();
    }
}
