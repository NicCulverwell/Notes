package JCF;

import java.util.*; 

class TestTreeSet { 
         public static void main(String[] args) { 
                Set<String> set = new HashSet<String>(); 
                

                set.add("London"); 
                set.add("Paris"); 
                set.add("New York"); 
                set.add("San Francisco"); 
                set.add("Beijing"); 
                set.add("New York"); 


               TreeSet<String> treeSet = new TreeSet<String>(set); 
               System.out.println("Sorted tree set: " + treeSet); 
               
               
               System.out.println("first(): " + treeSet.first()); 
               System.out.println("last(): " + treeSet.last()); 
               System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York")); // headSet() creates a set of all element prior to the specific element
               System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York")); // tailSet() creates a set of all elements after and inclusing the specific element
               
               
               System.out.println("lower(\"P\"): " + treeSet.lower("P")); 
               System.out.println("higher(\"P\"): " + treeSet.higher("P")); 
               System.out.println("floor(\"P\"): " + treeSet.floor("P")); 
               System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P")); 
               System.out.println("pollFirst(): " + treeSet.pollFirst()); // removes the first element 
               System.out.println("pollLast(): " + treeSet.pollLast());  // removes the last element
               System.out.println("New tree set: " + treeSet);
      } 
}