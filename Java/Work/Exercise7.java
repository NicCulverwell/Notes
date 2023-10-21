// Write a Java program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;

public class Exercise7 {
  
    public static void main(String args[]) {

        Scanner z = new Scanner(System.in);

        int x = z.nextInt();

        System.out.println("\n" + x * 1 + "\n");
        System.out.println("\n" + x * 2 + "\n");
        System.out.println("\n" + x * 3 + "\n");
        System.out.println("\n" + x * 4 + "\n");
        System.out.println("\n" + x * 5 + "\n");
        System.out.println("\n" + x * 6 + "\n");
        System.out.println("\n" + x * 7 + "\n");
        System.out.println("\n" + x * 8 + "\n");
        System.out.println("\n" + x * 9 + "\n");
        System.out.println("\n" + x * 10 + "\n");

        z.close();
    }

}
