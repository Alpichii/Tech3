package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        HashMap<Integer, String> objects = new HashMap<>();
        objects.put(1, "Computer");
        objects.put(2, "Projector");
        objects.put(3, "Remote");
        objects.put(4, "Mouse");
        objects.put(5, "Keyboard");
        objects.put(6, "Pen");

        System.out.println(objects);

        //Remove all key value pairs where value starts with P
        Map<Integer, String> objectsWithoutP = new HashMap<>();

        for(Integer i : objects.keySet()){
            if(!objects.get(i).toLowerCase().startsWith("p")){
                objectsWithoutP.put(i, objects.get(i));
            }
        }

        System.out.println(objectsWithoutP);

        /* ConcurrentModificationException - You CANNOT remove elements with for each loop
        for (Integer integer : objects.keySet()) {
            if(objects.get(integer).startsWith("P")) objects.remove(integer);
        }

        You CANNOT use fori loop as well as map does not work with indexes
        You CANNOT use iterator as Map does not extend to Collection and Iterable interfaces
         */

    }
}
