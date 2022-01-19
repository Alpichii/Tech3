package memoryManagement;

import java.nio.charset.StandardCharsets;

public class StringPool {
    public static void main(String[] args) {

        //One way of creating String Data - this will be store in Heap - String Pool
        String name1 = "Leo";
        String name2 = "Max";
        String name3 = "Leo";
        String name4 = "leo";

        System.out.println(name1.equals(name3)); // true
        System.out.println(name1.equals(name4)); // false
        System.out.println(name1 == name3); // true

        //A new way of creating String
        String n1 = new String("Leo"); // This will be stored in pool and object
        String n2 = new String("Leo");

        System.out.println(name1.equals(n1));
        System.out.println(n1.equals(n2)); // checks the value in pool if they are equal - true
        System.out.println(n1 == n2); // == checks the location for objects

        System.out.println(n1.getBytes(StandardCharsets.UTF_8));
        System.out.println(n2.getBytes(StandardCharsets.UTF_8));

        String address = new String("Chicago");
    }
}