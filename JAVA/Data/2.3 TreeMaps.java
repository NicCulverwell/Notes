package Data;
import java.util.*;

class TreeMaps {

    public static void main(String [] args) {

        // Tree Maps are Sub Classes of Maps
            // implements the SortedMap, very efficient for traversing the keys in a sorted order
            // by default, the data is sorted in ascending order of keys -> in this case names

        Map<String, Integer> map = new TreeMap<>();

        map.put("Smith", 30);
        map.put("Anderson", 31);
        map.put("Lewis", 29);
        map.put("Cook", 29);

        System.out.println(map);

        map.remove("Smith");

        System.out.println(map);

    }


}