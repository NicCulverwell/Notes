// Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise

import java.util.Scanner;

public class Exercise33 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Input 4 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("Holy shit you picked the same 4 numbers!");
        } else {
            System.out.println("Waah");
        }
        sc.close();

    }

}
