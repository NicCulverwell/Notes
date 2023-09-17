// Write a Java program to check if a specified array of integers contains 10's or 30's

public class Exercise52 {
    
    public static void main(String [] args) {

        int [] array = { 10, 20, 40, 50, 60, 70, 80, 90};

        int x = 0;

        while( x < array[array.length-1]) {

            if (array[x] == 10 || array[x] == 30) {
                System.out.println("YAY");
            } else {
                System.out.println("NAY");
            }

            x += 1;

        }

    }




}
