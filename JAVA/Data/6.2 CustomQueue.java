package Data;

import java.util.*;

class CustomQueue {
    
    public static void main(String [] args) {

        // Custom Implementation of a Queue:
            // Works identically to a normal queue
            // however it is a custom made class
            // see MyQueue Class at the bottom

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

}

class MyQueue<E> extends java.util.LinkedList<E> {

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
