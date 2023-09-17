// Write a Java program to compute the area of a polygon up unitl hexagon

import java.util.Scanner;  

public class Exercise19 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many sides does this shape have? - Maximum of 6 sides" );
        int numberSides = sc.nextInt();

        if (numberSides == 3) {

            System.out.println("What is the height of this shape?" );
            int height = sc.nextInt();
    
            System.out.println("What is the length of this shape?" );
            int length = sc.nextInt();

            System.out.println("The area of the Triangle is " + (0.5 * length * height));

        } else if (numberSides == 4) {
    
            System.out.println("What is the height of this shape?" );
            int height = sc.nextInt();
    
            System.out.println("What is the length of this shape?" );
            int length = sc.nextInt();
            
            if (length == height) {
                System.out.println("The area of the Square is " + (length * height));
            } else {
                System.out.println("The area of the Rectangle is " + (length * height));
            }

        } else if (numberSides == 5) {

            System.out.println("What is the length of one side of the shape?" );
            int height = sc.nextInt();
            
            double answer = 0.25 * Math.sqrt(5 * (5 + 2* Math.sqrt(5))) * height * height;
            
            System.out.println("The area of the Pentagon is " + answer);

        } else {

            System.out.println("What is the length of one side of the shape?");
            int height = sc.nextInt();
            
            System.out.println("The area of the Hexagon is " + (3 * Math.sqrt(3) / 2 * height * height));
        }

        sc.close();

    }

}
