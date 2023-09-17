// Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length). 

public class Exercise65 {
    
    public static void main(String[] args) {

        int[] array = {17, 2, 8, 4, 5};

        if (array[0] > array[array.length/2] && array[0] > array[array.length-1]) {
            System.out.println("The first integer is the largest");
        } else if (array[array.length/2] > array[0] && array[array.length/2] > array[array.length-1]) {
            System.out.println("The middle integer is the largest");
        } else {
            System.out.println("The last integer is the largest");
        }

    }

}
