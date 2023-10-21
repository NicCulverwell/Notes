package Computation;

class Account {

    // Attributes of the Object

    // variables defined within the object, that are privatized so that they cannot be used anywhere else
    private String accountNumber;
    private double balance;

    // Methods of the Object

    // Divided into 'getter' methods and 'setter' methods
    // getter methods are used to access the value of a certain attribute
    // setter methods are used to change the value of a certain attribute
    // getters and setters should be named as a verb, for clarification


    public String getaccountNumber() {
        return accountNumber;           // this creates a new method, that can be used anywhere (public), inwhich a user can ask for the Account number of a specific account
    }

    public double getbalance(){
        return balance;
    }

    public void deposit(double amount){     // the void statement, allows you to create a function that does not have a return value, thus as we are editing a pre-existing number, we dont need to return a number to the user
        balance += amount;
        System.out.println("Your current bank balance is R" + balance);
    }

    
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Not enough Funds");
        }

        System.out.println("Your current bank balance is R" + balance);
    }

    public Account(String initAccountNumber, double initBalance){   // init stands for initialize   -   This tells the code what to ask for when you first make an object
        balance = initBalance;
        accountNumber = initAccountNumber;
    }


}


class Objects {
    
    public static void main(String [] args) {

        // Objects are interactable classes of code, that can be extracted from the main clause 
        // used to solve multiple problems that are dynamically intuitive
        // Benefits:
        // Use of problem space vocabulary
        // More effective reuse of code
        // code that is ready for change

        // Procedural Programming:
        // Code is read one line at a time, where variables are created, those variables are used, and then a return statement is generated

        // Functional Programming:
        // Not very popular, and used in a very niche environment
        // all statements are written as a function

        // Object-Oriented Programming
        // Programs are written as objects which pass messages to each other
        // Objects are created using a class
        // Objects contain attributes (which determine their state) and methods (which determine their behaviour)
        // messages are passed from one object to another by invoking the methods defined by the object 


        Account nicholas = new Account("0109205076085", 2000 );   // once you have created an object, you must then construct a variable associated with that object

        nicholas.deposit(1000);
        nicholas.withdraw(500);
    }

}
