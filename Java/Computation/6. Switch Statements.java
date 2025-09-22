package Computation;

import java.util.Scanner;

class SwitchStatements {

    public static void main(String [] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter an integer [1-12]: ");
            int month = input.nextInt();
            
            // Switch Statements allow the user to create a system, that responds to a number provided by a user
            // The Default Switch Statement is the case that occurs when something outside of the scope of the remaining cases is provided (if the user types in 34 for instance)
            switch(month){
                
                case 1 -> System.out.println("January");
                case 2 -> System.out.println("February");
                case 3 -> System.out.println("March");
                case 4 -> System.out.println("April");
                case 5 -> System.out.println("May");
                case 6 -> System.out.println("June");
                case 7 -> System.out.println("July");
                case 8 -> System.out.println("August");
                case 9 -> System.out.println("September");
                case 10 -> System.out.println("October");
                case 11 -> System.out.println("November");
                case 12 -> System.out.println("December");
                default -> System.out.println(month + " is a value that does not correspond with the request");
            }              
        }
    }
}
