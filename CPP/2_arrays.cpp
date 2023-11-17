#include <iostream>

using namespace std;

int main() {


    int array[] = {1,2,3,4,5};  // arrays are variables that store multiple instances of the same variable type - in this case integers

    cout << array[0];           // with an array, you can choose to print out a single part of the array [the indexing of an array starts at 0] 

    array[2] = 10;              // arrays can have any variable changed, however you cannot change the size of an array, once it is instantialised

    string arrayTwo[10];        // You can instantiate an array, by indicating how big the array is, but not whats contained within it

    return 0;
}