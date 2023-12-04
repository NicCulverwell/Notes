package Data;
import java.util.*;

class LinkedHashSets {
    
    // LinkedHashSet:
        // - extends the HashSet with a LinkedList implementation
        // - imposes an ordering on the element
        //      - Elements are retrieved in the order that they were inserted

        
    public static void main(String [] args) {

        LinkedHashSet<String> set = new LinkedHashSet<String>();


        set.add("London"); 
        set.add("Paris"); 
        set.add("New York"); 
        set.add("San Francisco"); 
        set.add("Beijing"); 

        // Linked HashSets take elements in order of insertion
        System.out.println(set);

    }

}
