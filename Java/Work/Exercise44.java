// Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.

public class Exercise44 {
    
    public static void main(String[] args) {

        int [] array = {1, 2, 3};

        int [] newArray = {array[2], array[1], array[0]};

        int x = 0;

        while (x != 3) {
            System.out.println(array[x]);
            x += 1;
        }

        int z = 0;

        System.out.println("\nnewArray\n");

        while (z != 3) {
        System.out.println(newArray[z]);
        z += 1;
        }
    }

}
