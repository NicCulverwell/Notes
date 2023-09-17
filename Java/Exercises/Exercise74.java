// Write a Java program to check if a specified array of integers contains 10's or 30's.

public class Exercise74 {
    
    public static void main(String [] args) {

        int [] array = {1, 0, 5};

        int z = 0;
        int y = 0;

        while (z < array.length) {
            if(array[z] == 10 || array[z] == 30) {
                y += 1;
            }
            z += 1;
        }

        if (y > 0) {
            System.out.println("YAY");
        }
    

    }

}
