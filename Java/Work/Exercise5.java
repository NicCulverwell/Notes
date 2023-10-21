
// Write a Java program that takes two numbers as input and display the product of two numbers.

import java.util.Scanner;

public class Exercise5 {
    
    public static void main(String args[]) {

        Scanner z = new Scanner(System.in);

        int x = z.nextInt();
        int y = z.nextInt();

        System.out.println(x * y);


        z.close();
    }

}
