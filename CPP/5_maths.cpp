#include <iostream>

using namespace std;


int main() {

    // Maths in C++ forms a very similar basis to that of Normal Maths

    string example = "Example";

    cout << example;

    int exampleNo = 24;
    int count = 0;
    int numPrime = 0;

    while(count < exampleNo) {

        int num2 = 0;
        int numOfDividends = 0;

        while(num2 < count) {
            if(count % num2 == 0) {
                    numOfDividends++;
            }

            num2++;
        }

        if(numOfDividends == 2) {
            numPrime += 1;
        }

        count++;
    }

    cout << example;
    cout << numPrime;

    return 0 ;

}