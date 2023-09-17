// Write a Java program to multiply two given integers without using the multiply operator

import java.util.Scanner;

public class Exercise36 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input Two numbers:");

        int x = sc.nextInt();
        int y = sc.nextInt();

        int z = x;

        while (z != x * y) {
            z += y;
        }

        System.out.println(z);

        sc.close();

    }

}
