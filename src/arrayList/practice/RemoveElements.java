package arrayList.practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        /*
        TASK-1
        Create a list to store below elements
        Dog
        Cat
        Cat
        Cat
        Bird
        Fish
        Cat

        Print your list
        Print your sorted
         */

        System.out.println("\n---------TASK-1----------\n");
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Fish");
        animals.add("Cat");

        System.out.println("Animals list before sorting = " + animals);
        Collections.sort(animals);
        System.out.println("Animals list after sorting = " + animals);

        /*
        Remove all the Cat objects from the list

        EXPECTED OUTPUT:
        [Bird, Dog, Fish]
         */

        System.out.println("\n---------TASK-2 - 1st way----------\n");

        /*
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i).equals("Cat")) {
                animals.remove("Cat");
                i--;
            }
        }
        System.out.println(animals);
         */

        /*
        System.out.println("\n---------TASK-2 - 2nd way----------\n");
        ArrayList<String> listWithoutCat = new ArrayList<>();

        for (String animal : animals) {
            if(!animal.equals("Cat")) listWithoutCat.add(animal);
        }

        System.out.println(listWithoutCat);
         */

        /*
        System.out.println("\n---------TASK-2 - 3rd way----------\n");
        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("Cat");

        animals.removeAll(removeList);
        System.out.println(animals);
         */


        System.out.println("\n---------TASK-2 - 4th way----------\n");

        Iterator<String> myIterator = animals.iterator();

        while(myIterator.hasNext()){
            if(myIterator.next().equals("Cat")) myIterator.remove();
        }

        System.out.println(animals);
        System.out.println("End of the program");
    }
}