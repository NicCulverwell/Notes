// Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator. 

import java.util.Scanner;

public class Exercise58 {
    
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the Dividend:");
        int x = sc.nextInt();
        System.out.println("input the Divisor:");
        int y = sc.nextInt();
        int a = x;
        int z = 0;

        while (a > y) {
            a -= y;
            z += 1;
        }

        System.out.println(x + " divided by " + y + " is equal to " + z + " remainder " + a + ".");

        sc.close();
    }

}
