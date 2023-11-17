#include <iostream>
#include <vector>

using namespace std;

    void print(vector<int> test) { // basic function to print out every element of the vector

        int num = 0;
        cout << "[ ";

        while(num < test.size()) {
            cout << test[num] << " ";
            num ++;
        }

        cout << "]";
        cout << "\n";
    }

int main() {

    cout << "\nTest One:\n";


    vector<int> test; // Instantiation of a Vector

    test.push_back(5);  // adds a value to the Vector
    test.push_back(10);
    test.push_back(8);
    test.push_back(11);
    print(test);

    test.insert(test.begin(), 4); // this will insert 4, into the 1st slot of the vector (elements will be shifted accordingly)
    print(test);

    int size = test.size(); // returns how many variables are being stored in the vector
    int sizeMax = test.max_size(); // returns the maximum capacity of the vector


    cout << "\nTest Two:\n";


    vector<int> testTwo = {1,2,3,4,5,6,7,8,9}; // Vectors can be instantiated with default values

    testTwo.resize(6); // Changes the size of the vector, preexist variables will be deleted if neccessary
    print(testTwo);  

    testTwo.erase(testTwo.begin()); // erase function removes the elements at the location of the iterator
    print(testTwo); 

    testTwo.erase(testTwo.begin(), testTwo.begin()+3); // begin() moves the iterator to the first element
    print(testTwo); 


    cout << "\nTest Three:\n";


    vector<int> testThree(10); // You can instantiate a vector by indicating its max size

    testThree.insert(testThree.begin(), 5);
    testThree.insert(testThree.begin() + 1, 10);
    testThree.insert(testThree.begin() + 2, 8);
    testThree.insert(testThree.begin() + 3, 11);
    print(testThree);

    testThree.resize(5);
    print(testThree);

    testThree.shrink_to_fit();
    print(testThree);

    testThree.swap(testTwo); // equates the vector TestThree to testTwo (will dynamically change the size of the vector accordingly)
    print(testThree);


    return 0;
}