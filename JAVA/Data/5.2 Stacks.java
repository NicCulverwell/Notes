package Data;

import java.util.Stack;

class Stacks {
    

        // Stacks
        // - represent a last-in-first-out container of objects
        // - the elements are only accessed from the top of the stack
        // - you can retrieve insert or remove elements from the stack
    
        // - Stack()        - creates a new empty stack
        // - empty()        - returns true if the stack is empty
        // - peek()         - returns the top element of the stack
        // - pop()          - returns and removes the top element of the stack
        // - push()         - adds a new element to the top of the stack
        // - search(object) - returns the position of the specified object in the stack


    public static void main(String [] args) {


        Stack<Integer> test = new Stack<>();

        System.out.println(test.empty() + " | returns true as the stack is currently empty\n");

        test.push(5);
        test.push(10);
        test.push(15);

        System.out.println(test.peek() + " | reveals the element at the top of the stack\n");
        System.out.println(test.pop() + " | reveals and removes the element at the top of the stack\n");
        
        System.out.println(test.peek() + " | as the previous function was a pop function, the first element was removed\n");

        System.out.println("The index of Element 10 is: " + test.search(10) + "\n");

        System.out.println("The entire Stack is: " + test + "\n");
    
        System.out.println(test.empty() + " | returns false as the stack is no longer empty");
    
    }

}

