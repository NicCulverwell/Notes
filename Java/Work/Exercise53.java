

// Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array after the last element value 6.

public class Exercise53 {
    
    public static void main(String [] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int [] newArray = {array[6], array[7], array[8], array[9]};

        int z = 0;

        while (z < newArray[newArray.length-1]) {

            System.out.println(newArray[z]);
            z += 1;
        }

    }

}
