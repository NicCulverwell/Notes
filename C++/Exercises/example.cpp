#include <iostream>
#include <cmath>
#include <string>

using namespace std;

int DeptNum, ItemNum;
int GoblinTeeth = 150;
int Price =0;
int PriceOne = 10;
int PriceTwo = 20;
int PriceThree = 30;
int PriceFour = 50;
bool CarryOn = true;

string answer = "yes"; 
// capitalism. 

int main(){

while (GoblinTeeth > 9 && CarryOn){
cout << "Welcome to the Dragem Eyeballs in-game store.\n";
cout << "What ya buyin?\n";


// do-while loop is where user keeps shopping i.e., chooses DeptNum 1, 2, or 3. 
    
    
        cout << "Please select the department number you'd like to explore\n\n";
        cout << "You currently have " << GoblinTeeth << " vegan goblin's teeth within your possession.\n\n";
        
            cout << "1. Potions\n";
            cout << "2. Pets\n";
            cout << "3. Weapons\n";
            cout << "4. Exit the shop\n";

            cout << "Insert department number here: ";
            cin >> DeptNum;

                if (DeptNum == 1)
                {
                    cout << "You've selected Potions! You currently have " <<GoblinTeeth<< ". Please choose from the items below: \n\n";
                    cout << "1. Witches' craft brew, cost: " << PriceOne << " vegan goblin teeth\n";
                    cout << "2. Bubbles, toils, troubles & toenails tea, cost: " << PriceTwo << " vegan goblin teeth\n";
                    cout << "3. Starbucks' limited frog & tadpole smoothie, cost: " << PriceThree << " vegan goblin teeth\n";
                    cout << "4. A cappuccino (to revive yourself from the dead), cost: " << PriceFour << " vegan goblin teeth\n\n";

                    cout << "Insert number here: ";
                    cin >> ItemNum;
                
                    switch (ItemNum)
                        {
                        case 1: 
                        if(PriceOne > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceOne;
                            cout << "Thank you, that will be " << PriceOne<< " vegan goblin teeth" <<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 2:
                        if(PriceTwo > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceTwo;
                            cout << "Great choice, that'll be " << PriceTwo<< " vegan goblin teeth"<<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 3:
                        if(PriceThree > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                        GoblinTeeth -= PriceThree;
                            cout << "A personal favorite! That'll be " << PriceThree<<" vegan goblin teeth" <<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 4: 
                        if(PriceFour> GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                        GoblinTeeth -= PriceFour;
                            cout << "I'm a simple man myself. Thank you, the amount deducted from your account will be " << PriceFour<<" vegan goblin teeth"<< endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        default:
                            cout << "You've selected an invalid number.";
                        }
                
                }

                else if (DeptNum == 2)
                {
                    cout << "You've selected Pets! You currently have " <<GoblinTeeth<< ". PLease choose from the items below: \n\n";
                    cout << "1. Your childhood dog, cost: " << PriceOne << "\n";
                    cout << "2. Flying zebra, cost: " << PriceTwo << "\n";
                    cout << "3. A mini cannibal dragon, cost: " << PriceThree << "\n";
                    cout << "4. Sticky frog, cost: " << PriceFour << "\n\n";

                    cout << "Insert number here";
                    cin >> ItemNum;

                    switch (ItemNum)
                        {
                        case 1: 
                        if(PriceOne > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceOne;
                            cout << "Thank you, that will be " << PriceOne<< " vegan goblin teeth" <<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 2:
                        if(PriceTwo > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceTwo;
                            cout << "Great choice, that'll be " << PriceTwo<< " vegan goblin teeth"<<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 3:
                        if(PriceThree > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceThree;
                            cout << "A personal favorite! That'll be " << PriceThree<<" vegan goblin teeth" <<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 4: 
                        if(PriceFour> GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceFour;
                            cout << "I'm a simple man myself. Thank you, the amount deducted from your account will be " << PriceFour<<" vegan goblin teeth"<< endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        default:
                            cout << "You've selected an invalid number.";
                        }
                }

                else if (DeptNum ==3)

                {
                    cout << "You've selected Weapons! You currently have " <<GoblinTeeth<< ". PLease choose from the items below: \n\n";
                    cout << "1. Flying broomstick, cost: " << PriceOne << "\n";
                    cout << "2. Magical rosary, cost: " << PriceTwo << "\n";
                    cout << "3. King Arthur's sword, cost: " << PriceThree << "\n";
                    cout << "4. A pen to write hate mail, cost: " << PriceFour << "\n\n";

                    cout << "Insert number here";
                    cin >> ItemNum;

                    switch (ItemNum)
                        {
                        case 1: 
                        if(PriceOne > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceOne;
                            cout << "Thank you, that will be " << PriceOne<< " vegan goblin teeth" <<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 2:
                        if(PriceTwo > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceTwo;
                            cout << "Great choice, that'll be " << PriceTwo<< " vegan goblin teeth"<<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 3:
                        if(PriceThree > GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceThree;
                            cout << "A personal favorite! That'll be " << PriceThree<<" vegan goblin teeth" <<endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        case 4: 
                        if(PriceFour> GoblinTeeth)
                        {
                            cout << "Ewwww you're poor?? Get out!\n";
                            break;
                        }
                            GoblinTeeth -= PriceFour;
                            cout << "I'm a simple man myself. Thank you, the amount deducted from your account will be " << PriceFour<<" vegan goblin teeth"<< endl;
                            cout << "You have " << GoblinTeeth << " vegan goblin teeth remaining!\n";
                        break;

                        default:
                            cout << "You've selected an invalid number.";
                        }

                }

    if (DeptNum == 4)
                    {
                        cout << "Thank you for shopping at the Dragem Eyeballs store. Never show your face here again, you communist scum.\n";
                        // break;
                        // CarryOn = false;
                    }
                    
    else if (DeptNum < 1 && DeptNum > 4)
    {
        cout << "You have selected an invalid number.\n";
    }

    else {
        cout << "Want to keep shopping? (yes/no)\n";
        cin >> answer;

        if (answer == "yes")
        {
            CarryOn = true;
        }

        else{
            cout << "You smell. Please vacate the area immediately.\n";
            CarryOn = false;
        }

    }
}
return 0;

}