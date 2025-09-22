package Computation;

import java.util.Scanner;

// for using inputs in java we must first import the function from the above library

class Input {
    
    public static void main(String [] args){

        // Input Statements

        System.out.println("Enter your name: ");

        try ( // create a input variable (in this case called input)
                Scanner input = new Scanner(System.in)) {
            String name = input.nextLine();
            
            // nextLine is used for strings exclusively, each variable will have its own name | nextInt | nextDouble
            
            System.out.println("your name is " + name);
        }

    }

}
