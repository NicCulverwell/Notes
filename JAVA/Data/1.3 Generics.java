package Data;

class Generics {
    
    // Generics Allow you to create classes and methods that don't have a specified variables
        // When calling the class, you must indicate which variable you are instantiating
        // indicated by an <E>

        public static void main(String [] args) {

            Print<Integer> example = new Print<>(52); // replacing <E> with a variable of your choice, allows you to vary how you use data structures

            example.print();

        }

    public static class Print<E> { // <E> means that any variable type can be placed there as a substitute for this blueprint

        E object;

        public Print(E object) {
            this.object = object;
        }

        public void print() {
            System.out.println(object);
        }

    }

}