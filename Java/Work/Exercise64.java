// Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.

import java.util.Arrays;

public class Exercise64 {
    
    public static void main(String [] args) {

        int[] array = {1, 2, 3};

        int[] newArray = {array[2], array[1], array[0]};


            System.out.println(Arrays.toString(newArray));
    }

}
