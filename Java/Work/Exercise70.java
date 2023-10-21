// Write a Java program to check if the value 20 appears three times and no 20's are next to each other in a given array of integers.

public class Exercise70 {
    
    public static void main(String [] args) {

        int [] array = {1, 20, 20, 2, 20};

        int x = 0;
        int y = 0;
        int z = 0;
    
            while (z < array.length) {
                if (array[z] == 20) {
                    y += 1;
                }

                if (z > 1 && array[z] == array[z - 1] && array[z] == 20) {
                    x += 1;
                }

                z += 1;
            }

            if (y == 3 && x == 0) {
                System.out.println("There are exactly 3 20's in this array, and they are all separate from each other");
            } else if (y == 3 && x > 0) {
                System.out.println("There are exactly 3 20's in this array, however they are not separate from each other");
            } else {
                System.out.println("There are not exactly 3 20's in this array");
            }


    }
}