// Write a Java program to accepts an integer and count the factors of the number

import java.util.Scanner;

public class Exercise57 {
    
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number:");

        int x = sc.nextInt();
        int z = 1;
        int y = 0;

        while (z <= x) {
            if (x % z == 0) {
                y += 1;
            }
            z += 1;
        }

        if (y == 2 && x != 2) {
            System.out.println(x + " is a prime number");
        } else {
        System.out.println("There are " + y + " factors of " + x);
        }

        sc.close();
    }

}
