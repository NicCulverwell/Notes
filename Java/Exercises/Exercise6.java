// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Exercise6 {
    
    public static void main(String args[]) {

        Scanner z = new Scanner(System.in);

        int x = z.nextInt();
        int y = z.nextInt();

        System.out.println("\n" + x + y + "\n\n");
        System.out.println(x - y + "\n\n");
        System.out.println(x * y + "\n\n");
        System.out.println(x / y + "\n\n");
        System.out.println(x % y + "\n\n");

        z.close();

    }

}