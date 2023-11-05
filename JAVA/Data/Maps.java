package Data;

import java.util.*;

class MapClasses {

    public static void main(String [] args) {

        // creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);    // hashmaps essentially can be used to associate two variables together within a list
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display Entries in the HashMap:");
        System.out.println(hashMap);

        System.out.println("\nThe age for " + "Lewis is " +  hashMap.get("Lewis")); 

        Map<String, Integer> treeMap = new TreeMap<>(hashMap); // converting a HashMap into a different kind of map
        System.out.println("Display Entries in ascending order of Key:");
        System.out.println(treeMap);


    }

}

// MAP INTERFACE

    // An instance of Map represents a group of Objects, each of which is associated with a key
    // you can get the object from the map using a key, and you have to use a key to get an object into a map

    // The map interface maps keys to elements
    //  - the keys are like indices

    // Concrete Implementations of Maps:

        // HashMap:
        // - efficient for locating a value, inserting a mapping and deleting a mapping

        // LinkedHashMap:
        // - extends the HashMap with a linked list implementation that supports the ordering of the entries

        // TreeMap:
        // - implements the SortedMap, very efficient for traversing the keys in a sorted order (defaulted to ascending key order)


        // LinkedHashMap:

        // the entries of a LinkedHashMap can be retrieved in:
        // - the order they were inserted into the map (insertion order)
        // - the order they were most recently accessed in (access order)

        // no-argument constructor constructs a LinkedHashMap with [insertion order]
        // LinkedHashMap(initialCapacity, LoadFactor, true) - this will create a LHM with [access order]