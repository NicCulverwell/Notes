#ifndef ACCOUNT_H
#define ACCOUNT_H

class Account {
private:
    int ID;
    int BALANCE;

public:
    // Constructor
    Account(int id, int balance);

    // Methods
    void Deposit(int value);
    void Withdraw(int value);
    int getBalance();
    int getID();
};

#endif
