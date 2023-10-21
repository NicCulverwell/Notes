package Intro;

// Basic Template of a Java Program

class Introduction { 

        // Name of the class (acts as an index indicating the start and end of the code within the file)

    public static void main(String [] args) {
        // Body of the Program:

        // Acts very similarly to a main function of python
        // The Java Code will not run without the main class   
        // Every Statement within a class must end with a semicolon (;)

        // Variable Assignment and Declation:
        // declaring what type of variable you are working with is good practice (int, string, float, byte, short, char, boolean etc.)

        int age = 21;

        // Print Statements:
        //
        // VS Code will recognise "sysout" as a shortcut

        System.out.println(age);


        // Operators: 
        // + is addition | - is subtraction | / is divide | * is multiplication | % is modulus |
        // 10 / 6 = 2 in java (10 / 6.0 however will equal the correct number)


        int z = 10 + 5 - 25 / 5 * 1;
        System.out.println(z);



    }

    // Class Name:

    // Must begin with an Uppercase Letter
    // If more than one word use CamelCase (capitalise the first letter of each word, no spaces)
    // No Underscores
    // Name of a Java File Must correspond with the name of the Class



    // Variable Naming Conventions:

    // Descriptive 
    // Meaningful
    // Short

}