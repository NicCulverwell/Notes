// Write a Java program to divide two numbers and print on the screen.

import java.util.Scanner;

public class Exercise3 {
   public static void main(String args[]) {
       Scanner z = new Scanner(System.in);

    double x = z.nextDouble();
    double y = z.nextDouble();

    System.out.println("x / y = " + ( x / y ) );

    z.close();

   } 
}
