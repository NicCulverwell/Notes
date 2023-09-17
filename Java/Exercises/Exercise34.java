// Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

import java.util.Scanner;

public class Exercise34 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Two decimal numbers:");

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ( x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("nice both numbers are between 0 and 1");
        } else {
            System.out.println("Waah");
        }

        sc.close();

    }

}
