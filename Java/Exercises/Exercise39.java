// Write a Java program to test if the first or the last element of two array of integers are same. The length of the array must be greater than or equal to 2

public class Exercise39 {
   
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] array2 = {1, 2, 3, 5, 6, 4, 7, 1, 10};
        
        if (array[array.length-1] == array2[array2.length-1]) {
            System.out.println("YAY");
        } else {
            System.out.println("NAY");
        }

    }

}
