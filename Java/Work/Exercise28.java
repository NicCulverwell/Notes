// Write a Java program that accepts three integers from the user and return true if the second number is greater than first number and third number is greater than second number. 

import java.util.Scanner;

public class Exercise28 {
    
public static void main(String [] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Write three numbers:");

int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt();

if (z > y && y > x) {
    System.out.println("Congratulations! You submitted numbers in ascending order!");
} else if (x > y && y > z) {
    System.out.println("Whoopee! You submitted numbers in descending order!");
} else {
    System.out.println("I got no idea what you doing my guy");
}

sc.close();

}

}
