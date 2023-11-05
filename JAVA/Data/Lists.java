package Data;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    
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








    // List Interface:

        // to allow duplicate elements to be stored in a collection, you use a [List] 
        // Lists can also determine where you store the element
        // - user can access the element by index

        // add(index, element)          - adds a new element to the specified index
        // addAll(index, Collection)    - adds all elements in the Collection to this list at the specified index
        // get(index)                   - returns the element in this list at the specified index
        // indexOf(element)             - returns the index of the first matching element
        // lastIndexOf(element)         - returns the index of the last matching element
        // listIterator()               - returns the list iterator for the element in this list
        // listIterator(index)          - returns the iterator for elements from the startIndex
        // remove(index, element)       - removes the element at the specified index
        // set(index, element)          - sets the element at the specified index
        // subList(fromIndex, toIndex)  - returns a sublist from fromIndex to toIndex


        // List Iterator
        //
        // - add(object)                - adds the specified object to the list
        // - hasPrevious()              - returns true if the list iterator has more elements when traversing backwards
        // - nextIndex()                - returns the index of the next element
        // - previousIndex()            - returns the index of the previous element
        // - previous()                 - returns the previous element in the list iterator
        // - set(object)                - replaces the last element returned by the previous/next method with the specifed element

        // ArrayList / LinkedList
        //
        // - if you need to support random access through an index without inserting or removing elements, ArrayList is the better option
        // - If you require insertion or deletion of elements from any place in the list, LinkedList is the better option
        // A list can grow or shrink dynamically
        // an array is fixed once it is set, if your application does not require insertion or deletion, then an array is the best solution

        // ArrayList
        //
        // - ArrayList()                - creates an empty list with the default initial capacity
        // - ArrayList(Collection)      - creates an array list from the existing collection
        // - ArrayList(InitialCapacity) - creates an empty list with the specified initial capacity
        // - trimToSize()               - trims the capacity of the ArrayList instance to be the lists current size
    
    
        // LinkedList
        //
        // - LinkedList()               - creates a default empty Linked List
        // - LinkedList(Collection)     - creates a linked list from an existing collection
        // - addFirst(Object)           - adds the object to the head of the list
        // - addLast(Object)            - adds the object to the tail of the list
        // - getFirst()                 - returns the first element in the list
        // - getLast()                  - returns the last element in the list
        // - removeFirst()              - returns and removes the first element of the list
        // - removeLast()               - returns and removes the last element of the list
    
    
    
    
    