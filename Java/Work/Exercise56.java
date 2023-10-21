// Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.

import java.util.Scanner;

public class Exercise56 {
    
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input 3 numbers, The Start, The End and the Divisor:");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int z = 0;

        System.out.println("\n Here we go: \n");

        while (z < y) {
            if ( z > x && z % a == 0) {
                System.out.println(z);
            }
            z += 1;
        }
        sc.close();
    }

}
