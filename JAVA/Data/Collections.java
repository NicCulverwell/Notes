package Data;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {
    
    public static void main(String [] args) {

        ArrayList<String> collection1 = new ArrayList<>(); // Making an Array and defining the parameters around what kind of variables are permitted | Note the using of diamond brackets
        collection1.add("New York"); // basic functions of adding/removing from the list still apply
        collection1.add("Atlanta"); 
        collection1.add("Dallas"); 
        collection1.add("Madison"); 

        System.out.println("A list of cities in collection:"); 
        System.out.println(collection1); 


        System.out.println("\nIs Dallas in collection: " + collection1.contains("Dallas")); 

 
        collection1.remove("Dallas"); 
        System.out.println("\n" + collection1.size() + " cities are in collection now"); 


 
        Collection<String> collection2 = new ArrayList<String>(); 
        collection2.add("Seattle"); 
        collection2.add("Portland"); 
        collection2.add("Los Angles"); 
        collection2.add("Atlanta"); 

        System.out.println("\n\n-------------------------");
        System.out.println("For Loops in Data Structures");
        System.out.println("-------------------------\n");


        for(String element: collection2) { // element and set are both variables being called
            System.out.print(element.toLowerCase() + " | "); // essentially a for loop for a data structure
        }

    }

}
