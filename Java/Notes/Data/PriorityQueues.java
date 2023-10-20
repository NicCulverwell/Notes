package Data;

import java.io.Serializable;
import java.util.Iterator;

public class PriorityQueues {

        // Priority Queue
        // - elements are assigned priority
        // - elements with the highest priority are removed first

        // - PriorityQueue()                            - creates a default queue with initial capacity 11
        // - PriorityQueue(initialCapacity)             - cretaes a default queue with a specificed initial capacity
        // - PriorityQueue(Collection)                  - creates a queue from a pre-existing collection
        // - PriorityQueue(initialCapacity, Comparator) - creates a queue with the specified intial capacity and the comparator

        public static void main(String [] args) {

                MyPriorityQueue<String> queue = new MyPriorityQueue<>();

                queue.offer("test");

                System.out.println(queue.peek());

        }
        
        static class MyPriorityQueue<E> extends java.util.AbstractQueue<E> implements Serializable {

                public boolean offer(E e) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'offer'");
                }

                public E poll() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'poll'");
                }

                public E peek() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'peek'");
                }

                public Iterator<E> iterator() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
                }

                public int size() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'size'");
                }

                


        }



}
