// Write a Java program that accepts two integers from the user and return true if they have the same rightmost digit. The integers are non-negative

import java.util.Scanner;



public class Exercise29 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input two numbers:");

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % 10 == y % 10) {
        System.out.println("Those numbers have the same right most digit!");
        } else {
        System.out.println("shame");
        }

        sc.close();
        
    }
}
