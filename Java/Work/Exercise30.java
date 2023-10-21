// Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others. 

import java.util.Scanner;

public class Exercise30 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input three numbers please ( x ; y ; z):");
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        if (x > y + 20) {
            System.out.println("True: x is 20 units greater than at least y");
        } else if (x > z + 20) {
            System.out.println("True: x is 20 units greater than at least z");            
        } else if (y > z + 20) {
            System.out.println("True: y is 20 units greater than at least z");  
        } else if (y > x + 20) {
            System.out.println("True: y is 20 units greater than at least x");  
        } else if (z > x + 20) {
            System.out.println("True: z is 20 units greater than at least x");  
        } else if (z > y + 20) {
            System.out.println("True: z is 20 units greater than at least y");  
        } else {
            System.out.println("False");
        }

        sc.close();
        
    }
}
