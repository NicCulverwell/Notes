package Data;

public class Generics {
    
    // Generics Allow you to create classes and methods that don't have a specified variables
        // When calling the class, you must indicate which variable you are instantiating
        // indicated by an <E>

        public static void main(String [] args) {

            Print<Integer> example = new Print<>(52);

            example.print();

        }

    public static class Print<E> {

        E object;

        public Print(E object) {
            this.object = object;
        }

        public void print() {
            System.out.println(object);
        }

    }

}