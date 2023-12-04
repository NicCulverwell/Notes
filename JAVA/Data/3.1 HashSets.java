package Data;
import java.util.*;


class HashSets {

    // HashSet:
        // - implements set
        // - stores duplicate-free elements
        // - objects added to a hash set need to implement hasCode() in a manner that produces unique hash codes

    public static void main(String [] args) {

        Set<String> set = new HashSet<String>(); 
                

        set.add("London"); 
        set.add("Paris"); 
        set.add("New York"); 
        set.add("San Francisco"); 
        set.add("Beijing"); 
        set.add("New York"); // will not store this element, as sets do not store duplicates
    
        // Hash Sets have no apparent order of intake
        System.out.println(set);

        set.remove("San Francisco");

        System.out.println(set);

    }


}


    
