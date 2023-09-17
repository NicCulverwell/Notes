// Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both. 

public class Exercise66 {
    

    public static void main(String [] args) {
        
        int[] array = {1, 2, 20, 20, 5, 6, 7, 8, 6, 10};

        int x = 0;
        int y = 0;
        int z = 0;

        while (z < 9) {
            if (array[z] == array[z + 1] && array[z] == 10){
                x += 1;
            } else if (array[z] == array[z + 1] && array[z] == 20) {
                y += 1;
            }

            z += 1;

        }

        if (x > 0 && y > 0) {
            System.out.println("There are Two 10's and Two 20's next to each other, somewhere in the array");
        } else if (y > 0 && x == 0) {
            System.out.println("There are two 20's next to each other somewhere in the array");
        } else if (x > 0 && y == 0) {
            System.out.println("There are Two 10's next to each other somewhere in the array");
        } else {
            System.out.println("There are no cases of tens are twenties next to each other in this array");
        }

    }
}
