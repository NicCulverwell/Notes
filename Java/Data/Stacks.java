package Data;

import java.util.Stack;

public class Stacks {
    
    public static void main(String [] args) {

    // Stacks
        // - represent a last-in-last-out stack of objects
        // - the elements are only accessed from the top of the stack
        // - you can retrieve insert or remove elements from the stack
    
        // - Stack()        - creates a new empty stack
        // - empty()        - returns true if the stack is empty
        // - peek()         - returns the top element of the stack
        // - pop()          - returns and removes the top element of the stack
        // - push()         - adds a new element to the top of the stack
        // - search(object) - returns the position of the specified object in the stack

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
    




        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Custom Stack");
        System.out.println("\n-------------------------------------------------------------");




        // Custom Implementation of a Stack:

        MyStack<String> stack = new MyStack<>();

        stack.push("Tom");
        stack.push("George");
        stack.push("Peter");
        
        System.out.println("The Index of Element Tom: " + stack.search("Tom"));
        
        System.out.println("The Size of the Stack: " + stack.getSize() + "\n");
        System.out.println("The Top Element: " +stack.peek());
        System.out.println("The Top ELement: " +stack.pop() + " | will be removed from the stack");
        System.out.println("The Top Element: " + stack.peek() + " (new)");

    }

}

class MyStack<E> extends java.util.Vector<E> { // Stacks are based on Vectors (Can use ArrayLists, as they are very Similar)

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return get(getSize()-1);
    }

    public Object pop() {

        Object o = get(getSize()-1);
        remove(getSize()-1);
        return o;
    }

    public Object push(E o) {
        add(o);
        return o;
    }

    public int search(E o) {
        return indexOf(o);
    }

    public String toString() {
        return "Stack: " + toString();
    }

}