package Data;

class CustomStack {
    
    public static void main(String [] args) {

        // Custom Implementation of a Stack:
            // Works identically to a normal stack
            // however it is a custom made class
            // see MyStack Class at the bottom

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