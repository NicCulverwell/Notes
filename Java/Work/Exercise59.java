// Write a Java program to test that a given array of integers contains a 4 or a 7.

public class Exercise59 {
    
    public static void main(String [] args) {

        int [] array = {1, 2, 3, 5, 6, 5, 7, 8, 9};

        int z = 0;
        int x = 0;

        while (z < array[array.length-1]) {

            if (array[z] == 4 || array[z] == 7) {
                
                x += 1;

            }
            z += 1;
        }

        if (x > 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

}
