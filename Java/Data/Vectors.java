package Data;

import java.util.Vector;

public class Vectors {
    
    public static void main(String [] args) {

        String n = " \n";


        // Vectors are Advanced Arrays, that are capable of adapting their size autonomously

        Vector<String> test = new Vector<>();                      // Generic Instantiation

        test.add("Johannesburg");                                // adds new elements to the end of the vector - increases vector size if needed
        test.add("Pretoria");
        test.add(1, "Cape Town");                    // can add elements to a specific point in the array - will shift elements up if needed
        test.remove(2);                                      // removes the element at the specified index

        System.out.println(n + test + n);

        System.out.println(test.contains("Johannesburg") + n);   // returns true, if the specified element exists within the vector

        System.out.println(test.firstElement() + n);               // returns the element stored at index 0

        System.out.println(test.isEmpty());                        // returns true if the vector is empty

        System.out.println(test.size());                           //  returns the size of the vector


        Vector<String> testTwo = new Vector<>(10); // Vectors can be insantiated with a size
        System.out.println(testTwo);



    }

}
