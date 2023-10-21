// Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn

import java.util.Scanner;

public class Exercise21 {
   
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a Number:");
        int x = sc.nextInt();

        System.out.println(x + " + " + (x * 11) + " + " + (x * 111));

        sc.close();

    }

}
