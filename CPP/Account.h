#ifndef ACCOUNT_H
#define ACCOUNT_H

class account {

    int BALANCE;
    int ID;

    public: 

    class account(int ID, int BALANCE) {
        this->BALANCE = BALANCE;
        this->ID = ID;
    };

    void Deposit(int value){};

    void Withdraw(int withdraw) {};

    int getBalance() {};

    int getID() {};  

};

#endif