#ifndef ACCOUNT_H
#define ACCOUNT_H

class Account {

    int BALANCE;
    int ID;

    public: 

    class Account(int ID, int BALANCE) {
        this->BALANCE = BALANCE;
        this->ID = ID;
    };

    void Deposit(int value){};

    void Withdraw(int withdraw) {};

    int getBalance() {};

    int getID() {};  

};

#endif