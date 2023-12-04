package Data;
import java.util.*;

class LinkedLists {
    
    // LinkedList
        
        // Linked Lists contain pointers within them, that indicate what the next element in the list is
        // this is achieveed through the use of nodes
        // In Circly Linked Lists, the Tail Node(Last element)'s pointer indicates towards the head node (first element)
        // In Doubly Linked lists, each node has 2 pointers, one pointing forward one node and the other pointing back one node


        // - LinkedList()               - creates a default empty Linked List
        // - LinkedList(Collection)     - creates a linked list from an existing collection
        // - addFirst(Object)           - adds the object to the head of the list
        // - addLast(Object)            - adds the object to the tail of the list
        // - getFirst()                 - returns the first element in the list
        // - getLast()                  - returns the last element in the list
        // - removeFirst()              - returns and removes the first element of the list
        // - removeLast()               - returns and removes the last element of the list

    public static void main(String [] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Durban");
        list.add(1, "Johannesburg");
        list.add(2, "Cape Town");
        list.add(3, "Port Elizabeth");
        list.add(4, "Westville");
        list.addLast("Pretoria");

        System.out.println(list);

        list.add(0, "Kloof"); // adds the 2nd number to the index of the 1st number
        list.add(3,"Umhlanga");

        System.out.println(list);
        


    }

}
