package Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterators {
    
    public static void main(String [] args) {

        // Iterator interface
            //  Iterators enables traversal of the elements in a collection one after the other 
        
        // Comparator Interface
            // Enables elements in a collection to be sorted  in a particular order


        // Iterator is a classic design pattern for walking through a data structure without having to expose the details of how data is stored in the data structure.
            // The [Collection interface] extends the Iterable interface. The Iterable interface defines the iterator method, which returns an Iterator. 
            // The [Iterator Interface] provides a uniform way  for  traversing  elements  in  various  types  of  collections.  The  iterator method  in  the Collection interface returns an instance of the Iterator interface, which 

            // provides sequential access to the elements in the collection using the next() method. 
            // checks whether there are more elements in the iterator using the hasNext() method , and 
            // Removes the last element returned using  the remove() method.


        Collection<String> collection = new ArrayList<>();
        collection.add("Pretoria");
        collection.add("Cape Town");
        collection.add("Johannesburg");
        collection.add("Durban");

        Iterator<String> iterator = collection.iterator();      // Iterators have the functions hasNext(), next() and remove()

        System.out.print("| ");

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " | ");
        }            

    }

}
