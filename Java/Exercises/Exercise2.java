// Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);

        int x = z.nextInt();
        int y = z.nextInt();
        System.out.println("x + y = " + (x + y));

        z.close();

    }

}
