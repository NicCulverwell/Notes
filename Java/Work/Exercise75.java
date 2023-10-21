// Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array after the last element value 10.

import java.util.Arrays;

public class Exercise75 {
        
    public static void main(String [] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] newArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int z = 0;

        while (z < array.length) {
            newArray[z] = array[z];
            z += 1;
        }

        if (z == array.length) {

            newArray[newArray.length-1] = 10;

        }

        System.out.println(Arrays.toString(newArray));

    }

}
