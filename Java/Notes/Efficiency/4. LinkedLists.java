package Efficiency;

class LinkedLists {
    
    public static void main(String [] args) {

        //Linked Lists
            // since MyArrayList is implemented using an array, the methods:
                // get(index)
                // set(index, object)
                // add(object)
            // are quite efficient, however the methods:
                // add(index, object)
                // remove(index)
            // are inefficient

            // linked Data structures are more efficient at adding and removing elements from specific index anywhere on the list


            // Nodes
                // Each node contains an element and each node is linked to its next neighbour
                // as shown in class Node<E>:

            // Adding Nodes:
                // the variable head refers to the first node in the list
                // the variable tail refers to the last node in the list

                // Node<String> head = null;
                // Node<String> tail = null;

                // when adding nodes, the first node has to be referenced as both the head and the tail, until a new node takes its place
                // when adding the 2nd node, you reference it as tail.next / head.next making it one above or one below
                    // the tail.next and tail parameters are not the same [tail.next is the following node in the list] [tail is the final node in the list] 


            // Traversing a Linked List:
                // Each node contains the element and a data field named next that points to the next element
                // if a node is the last one in the list, its pointer data field next contains the value null

                // Node<E> current = head;
                // while(current != null) {
                    // System.out.println(current.element);
                    // current = current.next;
                // }

                // Doubly Linked Lists are special linked lists, where the node contains a point both forwards and backwards
            
                // Methods
                
                    // - LinkedList()               - creates a default empty Linked List
                    // - LinkedList(Collection)     - creates a linked list from an existing collection
                    // - addFirst(Object)           - adds the object to the head of the list
                    // - addLast(Object)            - adds the object to the tail of the list
                    // - getFirst()                 - returns the first element in the list
                    // - getLast()                  - returns the last element in the list
                    // - removeFirst()              - returns and removes the first element of the list
                    // - removeLast()               - returns and removes the last element of the list 



            }

    class Node<E> {
        E element; // holding the value
        Node <E> next; // holding a reference to the next node

        // combination of these two items, make up a single node within the list (making it a List that is linked by a 'next' parameter [linked list])

        public Node(Node <E> n, E e) { // assigning a next parameter is optional
            element = e;
            next = n;
        }

    }

}
