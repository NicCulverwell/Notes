// Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.

public class Exercise73 {

    public static void main(String [] args) {

        int [] array = {10, 10, 10, 20, 20};

        int x = 0;
        int z = 0;
        int y = 0;

        while (z < array.length) {
            if (array[z] == 10) {
                x += 1;
            } else if (array[z] == 20) {
                y += 1;
            }

                z += 1;
        }

        if (x > y) {
            System.out.println("There are more 10's than 20's");
        }


    }

}
