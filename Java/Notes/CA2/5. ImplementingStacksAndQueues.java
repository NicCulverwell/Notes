package CA;

class ImplentingStacksAndQueues {

    public static void main(String [] args) {

        // Design and implement a stack class using an array list
        // Design and implement a queue class using an linked list
        // Design and implement a priority queue class using an heap

        // a stack can be viewed as a special type of list
        // elements are accessed, inserted and deleted only from the top of the stack

        // array lists are more efficient for implementing a stack, as only the end is accessible

        // the last slot in the array is used as the 'top' as it is more efficient to add a final slot, then it is to move every element 1 accross
            // if the last slot is used, then T(n) = O(1) for push and pop functions
            // if the first slot is used, then T(n) = O(n) for push and pop functions
    
        // if a linkedlist is used, then index 0 is more effective (however linked lists contain more primitive operations than arrays, making them less effective)


        // Designing a Stack
            // Using inheritance
                // you can defined the stack class by extending the array list class: ArrayList -- GenericStack
            // Using Composition
                // you can defined an array list as a data field in the stack class: GenericStack -- ArrayList
                // composition is preferable

    }


}
