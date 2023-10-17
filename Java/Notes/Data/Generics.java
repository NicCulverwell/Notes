package Data;

public class Generics {
    
    // Make a file explaining Generics

        public static void main(String [] args) {

            Print<Integer> example = new Print<>(52);

            example.print();

        }

    public static class Print<T> {

        T object;

        public Print(T object) {
            this.object = object;
        }

        public void print() {
            System.out.println(object);
        }

    }

}
