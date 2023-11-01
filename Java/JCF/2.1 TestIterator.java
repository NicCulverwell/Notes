package JCF;

import java.util.*;
import java.util.Iterator;

class TestIterator {

    public static void main(String [] args) {

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