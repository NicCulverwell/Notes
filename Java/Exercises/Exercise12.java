// Write a Java program that takes three numbers as input to calculate and print the average of the numbers. 

import java.util.Scanner;

public class Exercise12 {
    public static void main(String args[]) {
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();
        int b = z.nextInt();
        int c = z.nextInt();

        System.out.println((a + b + c) / 3);

        z.close();
        
    }
}
