package Data;
import java.util.*;


class PriorityQueues {
    
    public static void main(String [] args){


        PriorityQueue<String> queue = new PriorityQueue<>();

        // Automatically Converts it into ascending order

        queue.add("London"); 
        queue.add("Paris"); 
        queue.add("New York"); 
        queue.add("San Francisco"); 
        queue.add("Beijing");

        System.out.println(queue);


    }

}
