// Write a Java program to divide the two given integers using subtraction operator

import java.util.Scanner;

public class Exercise35 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the Dividend first and then the divider:");

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x > y) {
            System.out.println(x - y);

            x -= y;
        }

        sc.close();
    }

}
