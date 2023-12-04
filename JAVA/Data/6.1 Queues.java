package Data;

import java.util.*;

class Queues {
    
    // Queues
        // - first-in-first-out data structure
        // - elements are appended at the end of the queue
        // - and removed from the beginning
        
        // - peek() / element() - retrieves head of the queue (null if the queue is empty)
        // - add() / offer()    - adds an element to the end of the queue (function with built in catch statements)
        // - remove() / poll()  - retrieves and removes the head of the queue (remove can be given a parameter to find)
        // - enqueue()          - adds an element to the front of the queue (not built into basic Queue Methods)
        // - dequeue()          - retrieves and removes an element from the front of the queue (not built into basic Queue Methods)

    public static void main(String [] args) {


        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(10);
        queue.offer(15);

        System.out.println(queue);

        queue.poll();
        queue.remove(10);

        System.out.println(queue);


    }
}