package Data;

import java.util.*;

class ArrayLists {
    
        // ArrayList
            // ArrayList()                - creates an empty list with the default initial capacity
            // ArrayList(Collection)      - creates an array list from the existing collection
            // ArrayList(InitialCapacity) - creates an empty list with the specified initial capacity
            // trimToSize()               - trims the capacity of the ArrayList instance to be the lists current size

        // if you need to support random access through an index without inserting or removing elements, ArrayList is the better option
        // an array is fixed once it is set, if your application does not require insertion or deletion, then an array is the best solution
    public static void main(String [] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10); // adds the 2nd number to the index of the 1st number
        arrayList.add(3,30);

        System.out.println("a list of integers in the array list:");
        System.out.println(arrayList);


        LinkedList<Object> linkedList = new LinkedList<>(arrayList); // as it is set as an object, it can use any variable

        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        System.out.println(linkedList);

    }

}
    
    
    
    
    