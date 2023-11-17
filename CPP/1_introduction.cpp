// C++ Language

#include <iostream> // #include is an import function to bring in external libraries
                        // <iostream> is a library containing the functions to input and output data from and to the user

using namespace std; // generic import, formatted differently, as it does not actually add new things, rather makes current functions simpler

int main() { 

// main function - a requirement for every coding project, not necessarily every file however
    // defined as an int function, meaning that at the end of the function it must come back with an integer


    int exampleOne = 5; // within all parts of a cpp file, you can create variables and name them as you want

    // Variable Types:
        // Integers: Whole Numbers
        // String: Series of letters (or numbers), defined by " "
        // Character: singular letter, defined by ' '
        // Float / Double / Long: Numbers, that contain decimals, of various lengths
        // Boolean: true or false statement
        

        string exampleTwo = "Hello";
        char exampleThree = 'x';
        float exampleFour = 5.4;

        cout << exampleTwo; // the cout << function prints out a statement to the user. In this case it will print out the string exampleTwo, which is "Hello"




    return 0; // as previously stated, the return function is required, and is defaulted to returning 0
}