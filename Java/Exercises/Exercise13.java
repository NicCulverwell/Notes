// Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;

public class Exercise13 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("\n" + (2*x + 2*y) + "\n");
        System.out.println(x * y);

        sc.close();

    }
}
