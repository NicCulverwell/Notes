package Data;

import java.util.Vector;

class Vectors {
    
    public static void main(String [] args) {

        String n = " \n";


        // Vectors are Advanced Arrays, that are capable of adapting their size autonomously

        Vector<String> vector = new Vector<>();                      // Generic Instantiation

        vector.add("Johannesburg");                                // adds new elements to the end of the vector - increases vector size if needed
        vector.add("Pretoria");
        vector.add(1, "Cape Town");                    // can add elements to a specific point in the array - will shift elements up if needed
        vector.remove(2);                                      // removes the element at the specified index

        System.out.println(n + vector + n);

        System.out.println(vector.contains("Johannesburg") + n);   // returns true, if the specified element exists within the vector

        System.out.println(vector.firstElement() + n);               // returns the element stored at index 0

        System.out.println(vector.isEmpty());                        // returns true if the vector is empty

        System.out.println(vector.size());                           //  returns the size of the vector


        Vector<String> vectorTwo = new Vector<>(10); // Vectors can be insantiated with a size
        System.out.println(vectorTwo);



    }

}
