package oop.oop_part2.abstraction;

import java.util.ArrayList;
import java.util.List;

public class PhoneTest {
    public static void main(String[] args) {
        Samsung samsung = new Samsung("Samsung", "Black", 128, 750);
        System.out.println(samsung);

        IPhone iPhone = new IPhone("Apple", "Black", 64, 1000);
        System.out.println(iPhone);

        Nokia nokia = new Nokia("Nokia", "Blue", 8, 200);
        System.out.println(nokia);


        System.out.println(samsung.getOS());
        System.out.println(iPhone.getOS());
        System.out.println(nokia.getOS());

        List<Nokia> phones = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            phones.add(nokia);
        }

        System.out.println(phones.size());
        for (Nokia phone : phones) {
            System.out.println(phone);
        }
    }
}
