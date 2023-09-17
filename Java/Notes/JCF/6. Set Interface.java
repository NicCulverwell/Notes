package JCF;

class SetInterface {

    public static void main(String [] args) {

        // Extends the Collection Interface

        // Does not introduce new methods or constants
        // Stipulates that an instance of a set contains no duplicate elements
        // Concrete Classes that implement set interfaces must ensure that no duplicate elements can be added to the set


        // AbstractSet Class
        // - convenience class
        // - extends Abstract Collection
        // - implements set
        
        // AbstractSet provides concrete implementations for;  
        // - equals() 
        // - hasCode() - set of the sum of all hashcodes of all elements in that set
        
    
        // Set Interface has 3 Concrete Classes:
        // - HashSet
        // - LinkedHashSet
        // - TreeSet


        // HashSet:
        // - implements set
        // - stores duplicate-free elements
        // - objects added to a hash set need to implement hasCode() in a manner that produces unique hash codes
    
        // LinkedHashSet:
        // - extends the HashSet with a LinkedList implementation
        // - imposes an ordering on the element
        //      - Elements are retrieved in the order that they were inserted

        // TreeSet Class and SortedSet Interface:
        // - Sorted Set is a sub-interface of Set, which guarantees that the elements in the set are sorted
        // - TreeSet is a concrete class that implements the SortedSet interface through the NavigableSet Interface
        //      - NavigableSet extends the SortedSet to provide navigation methods:
        //            - lower(e), floor(e), ceiling(e) and higher(e)
    
        // you can use an iterator to traverse the elements in a sorted order
        // the elements can be sorted in 2 ways, 
        // - Comparable Interface 
        // - Specific a comparator for elements in the set if:
        //      - the class of the elements does not implement the Comparable interface
        //      - you dont want to use the compareTo() method in the class that implements the Comparable interface 
        //  - this approach is referred to as [approach by comparator]


        

    }

}