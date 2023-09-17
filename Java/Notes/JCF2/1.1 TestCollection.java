package JCF;
import java.util.*;

 
class TestCollection { 
     public static void main(String[] args) { 
        
         ArrayList<String> collection1 = new ArrayList<>(); // Making an Array and defining the parameters around what kind of variables are permitted | Note the using of diamond brackets
           collection1.add("New York"); // basic functions of adding/removing from the list still apply
          collection1.add("Atlanta"); 
           collection1.add("Dallas"); 
           collection1.add("Madison"); 

        System.out.println("A list of cities in collection1:"); 
        System.out.println(collection1); 


 
          System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas")); 



 
         collection1.remove("Dallas"); 
         System.out.println("\n" + collection1.size() + " cities are in collection1 now"); 


 
         Collection<String> collection2 = new ArrayList<String>(); 
         collection2.add("Seattle"); 
          collection2.add("Portland"); 
        collection2.add("Los Angles"); 
         collection2.add("Atlanta"); 

}
}