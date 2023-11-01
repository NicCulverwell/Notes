package JCF;
import java.util.*; 

class TestQueue { 
       public static void main(String[] args) { 

              PriorityQueue<String> Q1 = new PriorityQueue<String>(); 

              Q1.offer("Oklahoma"); 
              Q1.offer("Indiana"); 
              Q1.offer("Georgia"); 
              Q1.offer("Texas");

              System.out.println("Priority queue using Comparable:"); 

              while (Q1.size() > 0) { 
                      System.out.print(Q1.remove() + " "); 
               } 

               PriorityQueue<String> Q2 = new PriorityQueue<String>( 4, Collections.reverseOrder());

               Q2.offer("Oklahoma"); 
               Q2.offer("Indiana"); 
               Q2.offer("Georgia"); 
               Q2.offer("Texas"); 

               System.out.println("\nPriority queue using Comparator:");
                
               while (Q2.size() > 0) { 
                        System.out.print(Q2.remove() + " "); 
               } 
      } 
} 

