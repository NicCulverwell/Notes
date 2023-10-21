// Write a Java program to get the larger value between first and last element of an array (length 3) of integers .

public class Exercise43 {
    
    public static void main(String[] args) {

        int [] array = {10, 25, 9};

        if ( array[0] > array[2]) {
            System.out.println("The first digit is larger than the last one!");
        } else {
            System.out.println("The last digit is bigger than the first one!");
        }
    }

}
