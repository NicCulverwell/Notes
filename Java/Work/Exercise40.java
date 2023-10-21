// Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays.

public class Exercise40 {
    
    public static void main(String[] args) {

        int [] array = {1, 2, 3};
        int [] array2 = {4, 5, 6};

        int [] array3 = {array[array.length-3], array2[array2.length-1]};

        System.out.println(array3[0] + ", " + array3[1]);

    }

}
