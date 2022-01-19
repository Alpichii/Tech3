package arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleElements {
    public static void main(String[] args) {
        List<String> japanCars = new ArrayList<>();

        japanCars.add("Toyota");
        japanCars.add("Honda");
        japanCars.add("Nissan");
        japanCars.add("Subaru");

        System.out.println("Japan cars are = " + japanCars);

        List<String> germanCars = new ArrayList<>();
        germanCars.add("BMW");
        germanCars.add("Mercedes");
        germanCars.add("Audi");
        germanCars.add("Mercedes");
        germanCars.add("Volkswagen");

        System.out.println("German cars are = " + germanCars);


        //ADDING MULTIPLE ELEMENTS
        System.out.println("\n---------ADDING MULTIPLE ELEMENTS--------\n");
        List<String> inventory = new ArrayList<>();
        inventory.addAll(japanCars); // true
        inventory.addAll(germanCars); // true
        inventory.add("Maserati");
        inventory.add("Tesla");

        System.out.println("All cars are = " + inventory);


        //REMOVING MULTIPLE ELEMENTS
        System.out.println("\n---------REMOVING MULTIPLE ELEMENTS--------\n");
        //inventory.removeAll(japanCars);
        //inventory.clear();
        //inventory.removeAll(inventory);


        //Remove Mercedes, Tesla, Honda
        List<String> removeList = new ArrayList<>(); // {"BMW", "Mercedes"}
        removeList.add("Mercedes");
        removeList.add("Tesla");
        removeList.add("Honda");
        removeList.add("Kia");

        inventory.removeAll(removeList);
        System.out.println(inventory);
    }
}
