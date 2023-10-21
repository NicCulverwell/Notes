// Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.


public class Exercise26 {
    
    public static void main(String [] args) {

        int n = 3;

        while (n < 100) {
            System.out.println(n);
            n += 3;
        }

        System.out.println("\n");

        int x = 5;

        while ( x < 100) {
            System.out.println(x);
            x += 5; 
        }

        System.out.println("\n");
    
        int z = 3;

        while (z < 100) {
            if (z % 5 == 0 && z % 3 == 0) {
                System.out.println(z);
                z += 3;
            } else {
                z += 3;
            }
        }

    }

}

