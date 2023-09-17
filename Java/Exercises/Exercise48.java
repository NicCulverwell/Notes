// Write a Java program to check if a string starts with a specified word.

import java.util.Scanner;


public class Exercise48 {
    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input a sentence!");

        String x = sc.nextLine();
        System.out.println(x.startsWith("Hello"));

        sc.close();

    }
}
