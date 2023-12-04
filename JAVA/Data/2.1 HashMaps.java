package Data;
import java.util.*;

class HashMaps {

    public static void main(String [] args) {


        // maps:
            // efficient for locating a value, inserting a mapping and deleting a mapping
            // items are not stored in any particular order

        Map<String, Integer> map = new HashMap<>();

        map.put("Smith", 30);
        map.put("Anderson", 31);    // HashMaps essentially can be used to associate two variables together within a list
        map.put("Lewis", 29);
        map.put("Cook", 29);

        System.out.println("Display Entries in the map:");
        System.out.println(map);

        System.out.println("\nThe age for " + "Lewis is " +  map.get("Lewis")); 

        System.out.println("The Key Set is: " + map.keySet());


    }

}



