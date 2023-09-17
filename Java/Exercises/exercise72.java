// Write a Java program to count the two elements of two given arrays of integers with same length, differ by 1 or less

public class exercise72 {

    public static void main(String [] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};

        int z = 0;
        int x = 0;

        while (z < array.length) {
            x += array[z];
            z += 1;
        }

        int a = 0;
        int b = 0;
        while (a < array2.length) {
            b += array2[a];
            a += 1;

        }

        System.out.println(x);
        System.out.println(b);

    }
    
}
