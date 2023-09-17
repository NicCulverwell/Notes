// Write a Java program to count the number of even and odd elements in a given array of integers

public class Exercise49 {
    
    public static void main(String[] args) {

        int[] array = {1, 18274, 3213212, 4, 3232, 6, 756432, 6543, 327875594, 10};

        int odd = 0;
        int even = 0;
        int z = 0;

        while ( z != 10) {
            if (array[z] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }

            z += 1;
        }

        System.out.println(odd);
        System.out.println(even);


    }

}