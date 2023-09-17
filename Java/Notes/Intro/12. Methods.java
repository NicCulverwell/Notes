package NOTES;

import java.util.Scanner;


class Methods {
    
    public static void main(String []  args) {

        // A Method is a block of code, providing a specific function, that can be called multiple times using different variables
        // Very useful for reducing the amount of code used within your programs

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Please enter a number: ");

        String answer = calculator(num);
        System.out.println("The number that you input was "+ answer);

        input.close();

    }


    // to help make code more understandable, you can create these separate entities called methods that can be used to create specific formulas
    // these formulas can be referenced and used multiple times throughout a coding script, and can be dynamicly changed with what inputs are used


    public static String calculator(int num1){  // "int num1" will be the variable that you give the code to work with. multiple input can be given and are separated by comma

        String answer1 = "";

        if(num1%2 == 0){
            answer1 = "even"; 
        } else{
            answer1 = "odd";
        }           

        return answer1;                         // If the method does not have a return type, then the initialisation will state public static void. otherwise the void keyword is not needed


    }


}
