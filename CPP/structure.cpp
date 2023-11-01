#include <iostream>

using namespace std;

struct Car { // Basic Introduction to a Class

    // Capable of storing and reproducing variables when called

    string brand;
    string model;
    int year;

};


int main() {

    Car porsche; // upon creating a structure, you can then create new variables using the structure name as a replacement to Integer or String;
                    // in this case, we have named the structure porsche


    porsche.brand = "Porsche";  // you can then change the values of the variables of the structure, specified towards the porsche
    porsche.model = "911";
    porsche.year = 1964;

    cout << porsche.brand << ", " << porsche.model << ", " << porsche.year;

    return 0;
}