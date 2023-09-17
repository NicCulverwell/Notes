//  Write a Java program to rearrange all the elements of a given array of integers so that all the odd numbers come before all the even numbers.

import java.util.Arrays;
import java.util.Scanner;

public class Exercise67 {
    

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers please:");

        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int j = sc.nextInt();
        int i = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();


        int[] array = {c, d, e, f, g, h, i, j, k, l};
        int b = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int a = 0;
        int p = 0;

        int [] newArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        while (b < array.length-1) {
            while (a < array.length-1) {
                 if (array[a] > array[a + 1]) {
                     p = array[a];
                     array[a] = array[a + 1];
                    array[a + 1] = p;
                    }
                 a += 1;

            }
          a -= array.length-1;
          b += 1;
        }

        while (z < array.length) {
            if (array[z] % 2 == 1) {
               newArray[x] = array[z];
               x += 1;  
            }
            z += 1;
        }

        while (y < array.length) {
            if (array[y] % 2 == 0) {
                newArray[x] = array[y];
                x += 1;
            }
            y += 1;
        }

        System.out.println(Arrays.toString(newArray));

        sc.close();

    }
}
