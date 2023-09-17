package JCF;

import java.util.*;

class MapClasses {

    public static void main(String [] args) {

        // creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);    // hashmaps essentially can be used to associate to variables together within a list
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display Entries in the HashMap:");
        System.out.println(hashMap + "\n");

        System.out.println("\nThe age for " + "Lewis is " +  hashMap.get("Lewis")); 

        Map<String, Integer> treeMap = new TreeMap<>(hashMap); // converting a HashMap into a different kind of map
        System.out.println("Display Entries in ascending order of Key:");
        System.out.println(treeMap + "\n");


    }

}