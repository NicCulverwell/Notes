#include <iostream>
#include <string>

using namespace std;

int main() {

    // any variable within code, has a designated address
        // these addresses, can be stored in code, and referred to as pointers

    int x = 4;

    cout << "The value is: " << x << endl;      // as you know, this will simply print out the value of x, which is 4
    cout << "The address is: " << &x << endl;   // &x will return the address of the value, instead of the value itself

    int* ptr = &x;                              // int* creates a pointer for integers, that can be equated to the address of a value, in this case x

    cout << "The address is: " << ptr << endl;  // again this will print out the address, which has now gotten a standardised variable name

    cout << "The value is: " << *ptr << endl;   // by referencing the pointer ptr as *ptr, we now inverse the procedure, and print out the value at that address

    char* pointer = "test";                     // Strings cannot be declared as pointers, however you can declare a string as a char, and move the pointer down the string, printing out each letter individually

    while(*pointer != '\0') {                   // '/0' is the character equivalent to null      
        cout << *pointer;                       // the pointer can only point at a single character at a time
        pointer ++;                             // by increasing the pointer by 1, we tell the pointer to aim 1 character forward (moving down the string)
    }              


    return 0;
}