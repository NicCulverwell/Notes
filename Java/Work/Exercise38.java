// Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2

public class Exercise38 {
    
public static void main(String[] args) {

    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};

    if (array[0] == array[array.length-1]) {
        System.out.println("YAY");
    } else {
        System.out.println("NAY");
    }

}

}
