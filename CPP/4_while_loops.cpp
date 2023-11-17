#include <iostream>

using namespace std;


int main() {

    int foodSelection;

    cout << "Please purchase a shop item:\n";
    cout << "1. frogs\n";
    cout << "2. skeevers\n";
    cout << "3. rocks\n";
    cout << "4. quesadillas\n";
    cin >> foodSelection;

    while(true) {

        if (foodSelection != 1 || foodSelection != 2 || foodSelection != 3 || foodSelection != 4 || foodSelection != 5) { // compensating for idiots lul
            cout << "Please try again:\n";
            cin >> foodSelection;
        } else {
            cout << "good job";
            break;
        }

    }

    return 0;
}