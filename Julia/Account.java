package Julia;

public class Account {

    private int Balance;
    private int AccNumber;

    public Account(int BALANCE, int ACCNUMBER) {
        Balance = BALANCE;
        AccNumber = ACCNUMBER;
    }
    
    public int GetBalance() {
        return Balance;
    }

    public int GetAccount() {
        return AccNumber;
    }

    public void SetBalance(int entry) {     
        Balance += entry;
    }

}
