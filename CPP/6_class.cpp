#include <iostream>
#include <Account.h>
using namespace std;

int main() {

    Account test(01, 1000);

    test.Deposit(500);
    cout << "R" << test.getBalance() << "\n";

    test.Withdraw(800);
    cout << "R" << test.getBalance() << "\n";

    cout << "ID Number: " << test.getID() << "\n";

    return 0;
}