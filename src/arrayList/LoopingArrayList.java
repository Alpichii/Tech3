package arrayList;

import java.util.ArrayList;
import java.util.List;

public class LoopingArrayList {
    public static void main(String[] args) {

        List<Double> balances = new ArrayList<>();
        balances.add(10.5);
        balances.add(7.0);
        balances.add(20.6);
        balances.add(23.7);
        balances.add(10.0);

        System.out.println("Balances list = " + balances);


        //Looping list element with fori loop
        System.out.println("\n-----------FOR I LOOP----------\n");

        for (int i = 0; i < balances.size(); i++) {
            System.out.println("Element " + (i+1) + " = " + balances.get(i));
        }


        //Looping list element with foreach loop
        System.out.println("\n-----------FOR EACH LOOP----------\n");
        for (Double element : balances) {
            System.out.println(element);
        }

    }
}
