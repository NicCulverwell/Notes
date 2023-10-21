// Write a Java program to rotate an array (length 3) of integers in left direction.

public class Exercise42 {
    
    public static void main(String[] args) {

        int[] array = {1, 2, 3};

        int[] newArray = {array[1], array[2], array[0]};
        System.out.println(newArray[0]);
    }
}
