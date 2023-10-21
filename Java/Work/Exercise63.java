// Write a Java program to get the larger value between first and last element of an array (length 3) of integers

public class Exercise63 {
    
    public static void main(String [] args) {

        int [] array = {8, 2, 3, 4, 5, 6, 7, 8, 9, 5};

        if (array[0] > array[array.length-1]) {
            System.out.println(array[0] + " > " + array[array.length-1]);
        } else {
            System.out.println(array[array.length-1] + " > " + array[0]);
        }

    }

}
