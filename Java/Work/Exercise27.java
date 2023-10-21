//  Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.

import java.util.Scanner;

public class Exercise27 {
    

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("(50) Input Two Numbers:");
        
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x + y == 50) {
            System.out.println("Would you look at that! Your two numbers combined is the same as the number I put");
        } else {
            System.out.println("The sum of your two numbers is " + (x + y));
        }

        sc.close();

    }
}
