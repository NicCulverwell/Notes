package Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Iterators {
    
    public static void main(String [] args) {

        // Iterator interface
            //  Iterators enables traversal of the elements in a collection one after the other 

            // next() - calls the next available element in the collection 
            // hasNext() - returns true if there is another element in the collection 
            // remove() - deletes the last element found by the iterator


        Collection<String> collection = new ArrayList<>();
        collection.add("pretoria");
        collection.add("cape town");
        collection.add("johannesburg");
        collection.add("durban");

        // It must be defined as the same generic as the collection, and bound to that collection as well
        Iterator<String> iterator = collection.iterator(); 
        System.out.print("| ");

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " | ");
        }            

        System.out.println("\n\nAs the remove() function has been called, it shall remove the current element it has stored, which is the last one\n");

        iterator.remove();

        System.out.println(collection);

    }

}
