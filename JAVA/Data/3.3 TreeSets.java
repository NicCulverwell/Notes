package Data;
import java.util.*;


class TreeSets {

    // TreeSets:
        // Uses Sorted Set as an interface, which is a sub-interface of Set
            // guarantees that the elements in the set are sorted
        // TreeSet is a concrete class that implements the SortedSet interface through the NavigableSet Interface
            // NavigableSet extends the SortedSet to provide navigation methods:
            // lower(e), floor(e), ceiling(e) and higher(e)

    public static void main(String [] args) {

        TreeSet<String> set = new TreeSet<String>(); 
                

        set.add("London"); 
        set.add("Paris"); 
        set.add("New York"); 
        set.add("San Francisco"); 
        set.add("Beijing"); 

        // TreeSets take in elements in order of Ascension (Alpahabetical / Numerical)
        System.out.println(set); 
       
       // Navigable Set Functions:
        System.out.println("first(): " + set.first()); 
        System.out.println("last(): " + set.last()); 
        System.out.println("headSet(\"New York\"): " + set.headSet("New York")); // headSet() creates a set of all element prior to the specific element
        System.out.println("tailSet(\"New York\"): " + set.tailSet("New York")); // tailSet() creates a set of all elements after and inclusing the specific element
       

        System.out.println("lower(\"P\"): " + set.lower("P")); // returns the highest value option, that comes before "P" will not return the value if it is equal to "P"
        System.out.println("higher(\"P\"): " + set.higher("P")); // returns the lowest value option, that comes after "P" will not return the value if it is equal to "P"
        System.out.println("floor(\"P\"): " + set.floor("P")); // returns the highest value option, that comes before "P"
        System.out.println("ceiling(\"P\"): " + set.ceiling("P")); // returns the lowest value option, that comes after "P"
        System.out.println("pollFirst(): " + set.pollFirst()); // retrieves and removes the first element 
        System.out.println("pollLast(): " + set.pollLast());  // retrieves and removes the last element
        System.out.println("New tree set: " + set);

    }

}
