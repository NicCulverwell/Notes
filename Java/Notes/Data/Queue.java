package Data;

import java.util.*;

public class Queue {

    public static void main(String [] args) {

        // Queues
        // - first-in-first-out data structure
        // - elements are appended at the end of the queue
        // - and removed from the beginning
        
        // - poll()         - retrieves and removes the head of the queue (null if the queue is empty)
        // - peek()         - retrieves but does not remove the head of the queue (null if the queue is empty)
        // - element()      - retrieves but does not remove the head of the queue (throws an exception if the the queue is empty)
        // - enqueue()      - adds an element to the end of the queue (function with built in catch statements)
        // - dequeue()      - retrieves and removes an element from the front of the queue (function with built in catch statements)


        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("Pretoria");
        queue.enqueue("Cape Town");
        queue.enqueue("Johannesburg");
        queue.enqueue("Durban");


        // System.out.println(queue.element());

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
