// Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2

public class Exercise61 {


    public static void main(String [] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        if (array[0] == array[array.length-1]) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    
}
