#include <iostream>

using namespace std;

class Account {

    int BALANCE;
    int ID;

    // All Classes Require a Constructor Method:
        // Named the same as the Class Name
        // Doesn't Neccessarily Need any data placed within it
        // Optionally can contain variables that would be required to instantiate the class
        // for an account to be set up, it requires an Integer representing the Account ID and an initial Balance

    public:
        Account(int ID, int BALANCE) {
        this->BALANCE = BALANCE;  // takes the variable from the external source (when it is entered in the int main() { and equates it to the private variables stored within this class)
        this->ID = ID;
        }

    // Secondary Methods:
        // Methods are split into various parts
            // first, you must define what the method returns(what the method spits back out when it is done)
            // if defined as an int method, then the method does something, and then returns with an Integer
            // void methods, are defined as methods that do not need to return values

            // within the bracket of the method, you define what predetermined variables
            // in the deposit method, the int value is defined, which means whenever the deposit method is called you have to give it some integer

        // Basic Methods are Generally divided into 2 categories:
            // 'Getters' and 'Setters'
        // Setters are methods that change the value of variables
            // Deposit(int deposit) takes in the variable deposit and adds it to the value of Balance accordingly
            // defined as 'void' methods,
        // Getters are methods that simply return a requested variable:
            // the getBalance method, when called prints out the Balance variable


        void Deposit(int value) { 
            BALANCE += value;
        }

        void Withdraw(int withdraw) {
            BALANCE -= withdraw;
        }


        int getBalance() {
            return BALANCE;
        }

            int getID() {
            return ID;
        }

};

int main() {

    Account account(01, 1000);

    account.Deposit(500);

    cout << "R" << account.getBalance() << "\n";

    account.Withdraw(800);

    cout << "R" << account.getBalance() << "\n";

    cout << "ID Number: " << account.getID() << "\n";

    return 0;
}