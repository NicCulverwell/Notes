#include <iostream>
#include <vector>

using namespace std;

struct Car
{
    string make;
    string model;
    unsigned int year; 
    float price; 
};

int Dialogue() {

    int Choice;
    
    cout << "\nPlease Select an Option: " << endl;
    cout << "1. Add a Car to the List: \n" 
         << "2. Print the Current Catalogue: \n" 
         << "3. Determine the Price of a Car: \n" 
         << "4. Discount a Car: \n" 
         << "5. Remove a Car from the Catalogue: \n" 
         << "6. Exit the Shop:\n";
        cin >> Choice;

    return Choice;
}

void FindPrice(vector <Car> car) {

    unsigned int year;
    string model;

    cout << "Please Give us some Information: \n";

    cout << "\nYear: ";
    cin >> year;

    cout << "Model: ";
    cin >> model;


    for(int i=0; i < car.size(); i++) {
        if(car[i].model == model && car[i].year == year) {
            cout << "$" <<  car[i].price << endl;
        }
    }
}

vector<Car> Discount(vector <Car> car) {

    int year;
    string model;
    float price;

    cout << "Please Give us some Information: \n";

    cout << "Year:";
    cin >> year;

    cout << "Model:";
    cin >> model;

    cout << "New Price: ";
    cin >> price;

    for(int i=0; i < car.size(); i++) {

        if(car[i].model == model && car[i].year == year) {
            car[i].price = price;
        }
    }

    return car;

}

int Delete(vector <Car> car) {

    unsigned int year;
    string model;

    cout << "Please Give us some Information: \n";

    cout << "Year:";
    cin >> year;

    cout << "Model:";
    cin >> model;


    for(int i=0; i < car.size(); i++) {
        if(car[i].model == model && car[i].year == year) {
            return i;
        }
    }
}

bool Continue() {

        string AddAnother = "\nWould you like to Continue? (YES/NO)\n";
        bool UserAnswer;
        string Continue;

        cout << AddAnother;
        cin >> Continue;

        if (Continue == "YES") {
            UserAnswer = true;
        } else {
            UserAnswer = false;
        }

    return UserAnswer;
}

Car AddCar() {
    string AddMake = "Make: ";
    string AddModel = "Model: ";
    string AddYear = "Year: ";
    string AddPrice = "Price($): "; 
    Car car;

    cout << AddMake << endl;
    cin >> car.make;

    cout << AddModel << endl;
    cin >> car.model;

    cout << AddYear << endl;
    cin >> car.year;

    cout << AddPrice << endl;
    cin >> car.price;

    return car;

}

void Print(vector <Car> Car1)
{
    for (int i=0; i < Car1.size(); i++)
    {
        cout << "\n" << Car1[i].make << " ";
        cout <<  Car1[i].model << ", ";
        cout << Car1[i].year << ", $";
        cout << Car1[i].price << endl;
    }
}

int main()
{
    vector<Car> Catalogue; 
    bool UserAnswer = true;

    while (UserAnswer)
    {

        int Choice = Dialogue();

        if(Choice == 1) {
            Car car = AddCar();
            Catalogue.push_back(car);
        } else if (Choice == 2) {
            Print(Catalogue);
        } else if(Choice == 3) {
            FindPrice(Catalogue);
        } else if(Choice == 4) {
            Catalogue = Discount(Catalogue);
        } else if(Choice == 5) {
            int i = Delete(Catalogue);
            Catalogue.erase(Catalogue.begin()+i);
        } else {
            break;            
        }

        UserAnswer = Continue();

    }

    return 0;
}