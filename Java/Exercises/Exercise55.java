// Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative.

import java.util.Scanner;

public class Exercise55 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input 3 numbers:");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x % 10 == y % 10 && x % 10 == z % 10) {
            System.out.println("All three numbers have the same rightmost digit");
        } else if (x % 10 == z % 10) {
            System.out.println("Your first input has the same rightmost digit as the third input");
        } else if (y % 10 == z % 10){
            System.out.println("Your second input has the same rightmost digit as the third input");
        } else if(x % 10 == y % 10) {
            System.out.println("Your first input has the same rightmost digit as the second input");
        } else {
            System.out.println("Unfortunately, no two numbers have the same rightmost digit");
        }

        sc.close();

    }

}
