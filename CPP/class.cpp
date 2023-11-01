#include <iostream>

using namespace std;

class Account {

    int BALANCE;
    int ID;

    // All Classes Require a Constructor Method:
        // Named the same as the Class Name (in this case Account)
        // Doesn't Neccessarily Need any data placed within it
        // Optionally can contain variables that would be required to instantiate the class
        // for an account to be set up, it requires an Integer representing the Account ID and an initial Balance
            // as such, you define these parameters within the bracket
            // there are no set rules, you can edit and change these as much as you want

    public:
        Account(int ID, int BALANCE) {
        this->BALANCE = BALANCE;  // takes the variable from the external source (when it is entered in the int main() { and equates it to the private variables stored within this class)
        this->ID = ID;
        }

        // Secondary Methods:
        // Methods are split into various parts
            // first, you must define what the method returns
            // if defined as an int method, then no matter what the method does it must return with an Integer
            // void methods, are defined as methods that do not need to return values

            // within the bracket of the method, you define predetermined variables
            // in the deposit method, the int value is defined, which means whenever the deposit method is called you have to give it some integer
            // this is used when the method requires something to work with. In the case of deposit, you need to tell the method how much is being deposited

        // Basic Methods are Generally divided into 2 categories:
            // 'Getters' and 'Setters'
        // Setters are methods that change the value of variables
            // Deposit(int deposit) takes in the variable deposit and adds it to the value of Balance accordingly
            // defined as 'void' methods,
        // Getters are methods that simply return a requested variable:
            // the getBalance method, when called, prints out the Balance variable
            // It does not change any data, nor does it create any new data


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

    Account Julia(01, 1000);

    Julia.Deposit(500);
    cout << "R" << Julia.getBalance() << "\n";

    Julia.Withdraw(800);
    cout << "R" << Julia.getBalance() << "\n";

    cout << "ID Number: " << Julia.getID() << "\n";

    return 0;
}