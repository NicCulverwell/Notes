// Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2

public class Exercise60 {
    
    public static void main(String [] args) {

        int [] array = {10, 2, 3, 4, 1};

        if (array[0] == 10 || array[array.length-1] == 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
