// Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.

public class Exercise69 {
    
    public static void main(String [] args) {

        int [] array = {1, 2, 10, 4};

        int z = 0;
        int x = z + 1;
        int y = 0;


        while (z < array.length){

            if (array[z] == 10) {
                while (x < array.length) {

                    if (array[x] == 20) {
                        y += 1;
                    }
                    x += 1;
                }
            }

            z += 1;

        }

        if (y == 0) {
            System.out.println("Unfortunately it would seem that there are no 20's in this array that are followed by a 20");
        } else if (y == 1) {
        System.out.println("Congrats, there is a 20 within that array that is after a 10");
        } else {
            System.out.println("There are multiple instances of 20's that follow 10's in this array");
        }

    }

}
