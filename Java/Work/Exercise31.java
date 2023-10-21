// Write a Java program that accepts two integer values from the user and return the larger values. However if the two values are the same, return 0 

import java.util.Scanner;

public class Exercise31 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input Two numbers:");

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            System.out.println(x);
        } else if (y > x) {
            System.out.println(y);
        } else {
            System.out.println("0");
        }

        sc.close();

    }

}
