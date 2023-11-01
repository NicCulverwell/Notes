package Data;

import java.util.*;

public class Queues {
    
    public static void main(String [] args) {

                // Queues
        // - first-in-first-out data structure
        // - elements are appended at the end of the queue
        // - and removed from the beginning
        
        // - peek() / element() - retrieves head of the queue (null if the queue is empty)
        // - add() / offer()    - adds an element to the end of the queue (function with built in catch statements)
        // - remove() / poll()  - retrieves and removes the head of the queue (remove can be given a parameter to find)
        // - enqueue()          - adds an element to the front of the queue (not built into basic Queue Methods)
        // - dequeue()          - retrieves and removes an element from the front of the queue (not built into basic Queue Methods)

        Queue<Integer> test = new LinkedList<>();

        test.add(5);
        test.add(10);
        test.offer(15);

        System.out.println(test);

        test.poll();
        test.remove(10);



        System.out.println(test);



        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Custom Queue");
        System.out.println("\n-------------------------------------------------------------");


        // Custom Implementation of a Queue

        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("Pretoria");
        queue.enqueue("Cape Town");
        queue.enqueue("Johannesburg");
        queue.enqueue("Durban");
        
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        
        System.out.println(queue.poll());

    }

    static class MyQueue<E> extends java.util.LinkedList<E> {

        private LinkedList<E> list = new LinkedList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }
    
        public int size() {
            return list.size();
        }

        public void enqueue(E element) {
            list.addLast(element);
        }

        public E dequeue() {

            if(isEmpty()) {
                throw new NoSuchElementException();
            }
            
            E output = list.peek();
            list.removeFirst();
            return output;
        
        }

        public E peek() {

            if(isEmpty()) {
                throw new NoSuchElementException();
            }  
            return list.getFirst();
        }

    }



}
