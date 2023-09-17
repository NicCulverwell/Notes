// Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.

public class Exercise51 {
    
    public static void main(String[] args) {

        int [] array = {10, 20, 20, 10, 10, 10, 20, 20, 20, 10, 10, 10, 20, 10};

        int x = 0;
        int y = 0;
        int z = 0;

        while (z < array[array.length-1]) {

            if (array[z] == 10) {
                x += 1;
            } else {
                y += 1;
            }

            z += 1;

        }

        System.out.println(x);
        System.out.println(y);


    }

}
