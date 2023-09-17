// Write a Java program to create a new array from a given array of integers, new array will contain the elements from the given array before the last element value 6.

public class Exercise54 {
    
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int [] newArray = {array[0], array[1], array[2], array[3], array[4]};

        int z = 0;

        while (z < newArray[newArray.length-1]) {
            System.out.println(newArray[z]);
            z += 1;
        }

    }

}
