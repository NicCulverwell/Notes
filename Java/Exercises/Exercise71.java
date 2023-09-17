// Write a Java program to check if a specified number appears in a given array of integers.
import java.util.Scanner;


public class Exercise71 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number:");

        int x = sc.nextInt();
        int z = 0;
        int y = 0;
        int [] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        while (z < array.length) {
            if ( array[z] == x) {
                y += 1;
            }

            z += 1;

        }
        
        if (y > 0) {
            System.out.println("Yay");
        }


        sc.close();


    }

}
