package Data;
import java.util.*;

class LinkedHashMaps {

        // LinkedHashMap:
            // extends the HashMap with a linked list implementation that supports the ordering of the entries

            // the entries of a LinkedHashMap can be retrieved in:
            // - the order they were inserted into the map (insertion order)
            // - the order they were most recently accessed in (access order)

            // no-argument constructor constructs a LinkedHashMap with [insertion order]
            // LinkedHashMap(initialCapacity, LoadFactor, true) - this will create a LHM with [access order]

    public static void main(String [] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        // By default entries into a LinkedHashMap are retained in the order of insertion

        map.put("Smith", 30);
        map.put("Anderson", 31);   
        map.put("Lewis", 29);
        map.put("Cook", 29);

        System.out.println(map);


    }

}
