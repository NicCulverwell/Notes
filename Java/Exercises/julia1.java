import java.util.Scanner;

    // scroll down to class julia1 {
    // start there, and work through each line, and then jump back up to check the Shop class, whenever a method is called from tavern.something()


class Shop {
    
    private Scanner input = new Scanner(System.in);
    private String currency = " vegan goblin teeth ";
    private String OptionOne;
    private String OptionTwo;
    private String OptionThree;
    private String OptionFour;
    private int PriceOne;
    private int PriceTwo;
    private int PriceThree;
    private int PriceFour;
    private int Decision;
    private int gold;


    public Shop(int DecisionInitial, int goldInitial) {
        Decision = DecisionInitial;
        gold = goldInitial;
    }

    public void Values() {

        if(Decision == 1) {
            OptionOne = "Healing Potion";
            PriceOne = 40;
            OptionTwo = "Stamina Potion";
            PriceTwo = 30;
            OptionThree = "Magicka Potion";
            PriceThree = 30;
            OptionFour = "Skooma";
            PriceFour = 100;
        } else if(Decision == 2) {
            OptionOne = "Dawnstar";
            PriceOne = 90;
            OptionTwo = "Mace of Molag Bal";
            PriceTwo = 70;
            OptionThree = "Auriel's Bow";
            PriceThree = 80;
            OptionFour = "Mehrunes Razer";
            PriceFour = 120;
        } else if(Decision == 3) {
            OptionOne = "Ebony Mail";
            PriceOne = 70;
            OptionTwo = "Dragonbone Platemail";
            PriceTwo = 90;
            OptionThree = "Iron Helmet";
            PriceThree = 20;
            OptionFour = "Auriel's Shield";  
            PriceFour = 80;          
        }
    }

    public void ShopCart() {

        System.out.println("\nWe have the Following Merchandise Available:\n");
        System.out.println("1. " + OptionOne + ", " + PriceOne + currency);
        System.out.println("2. " + OptionTwo + ", " + PriceTwo + currency);
        System.out.println("3. " + OptionThree + ", " + PriceThree + currency);
        System.out.println("4. " + OptionFour + ", " + PriceFour + currency + "(20% discount)");
    }

    public void Calculator(int Purchase) {

            if(Purchase == 1 && Afford(PriceOne)) {
                gold -= PriceOne;
                System.out.println("\nCongratulations on your purchase!");
            } else if(Purchase == 2 && Afford(PriceTwo)) {
                gold -= PriceTwo;
                System.out.println("\nCongratulations on your purchase!");
            } else if(Purchase == 3 && Afford(PriceThree)) {
                System.out.println("\nCongratulations on your purchase!");                
                gold -= PriceThree;
            } else if(Purchase == 4 && Afford(PriceFour)) {
                System.out.println("\nCongratulations on your purchase!");            
                gold -= PriceFour;
            }

            System.out.println("You have " + gold + currency + "remaining.");

    }

    public boolean Afford(int Price) {

        if(gold < Price) {
            System.out.println("You are unfortunately unable to afford that item");
            return false;
        } else {
            return true;
        }
    }

    public boolean Continue() {

        System.out.println("\nWould you like to continue shopping? (1/0)");
        Integer response = input.nextInt();

        if(response == 1 ) {
            return true;
        } else if(response == 0) {
            System.out.println("We will be seeing ya!");
            return false;
        } else {
            System.out.println("Stop with this nonsensical blabbering! Just have a look at the wares again!");
            return true;
        }

    }

}



class julia1 {
    

    public static void main(String [] args) { // int main()
        
        Scanner input = new Scanner(System.in); // Ignore this, this is a java function to allow us to do cin statements    
        boolean response = true;
        
        while(response) {

        System.out.println("\n What are ya buying?\n");
        System.out.println("1. Potions \n2. Weapons \n3. Armour \n4. Leave Shop ");

        int DecisionInitial = input.nextInt(); // cin >> Decision;

            if(DecisionInitial == 4) {
                System.out.println("\nGet out then, you scallywag!");
                break;
            }

        Shop tavern = new Shop(DecisionInitial, 300);
        tavern.Values();
        tavern.ShopCart();

        int Purchase = input.nextInt(); // cin
        tavern.Calculator(Purchase);
        
        response = tavern.Continue();

        }

        input.close(); // Ignore, this is for Java Input Statements again
    }

}