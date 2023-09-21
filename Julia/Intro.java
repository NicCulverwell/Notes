package Julia;

public class Intro {
    
    public static void main(String [] args) {

        Account Julia = new Account(1000, 51);

        System.out.println(Julia.GetBalance() + "\n");

        Julia.SetBalance(5000);

        System.out.println(Julia.GetBalance());

    }

}
