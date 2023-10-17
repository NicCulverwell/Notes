#include <iostream>

using namespace std;

int main() {

    string SignofCross ="Sign of Cross\n";
    string Creed = "Creed\n";
    string OurFather = "OurFather\n";
    string HailMary = "Hail Mary\n";
    string GloryBe = "Glory Be! \n";
    string Fatima = "Fatima!\n";
    string HailHolyQueen = "Hail Holy Queen";

    cout << SignofCross;
    cout << Creed;
    cout << OurFather;
    
    for(int counter = 1; counter <= 3; counter++) {
        cout << HailMary;
    }

    cout << GloryBe;

    for(int counter = 1; counter <=5; counter++) {

        cout << OurFather;

        for(int counter = 1; counter <= 10; counter++) {
            cout << HailMary;
        }

        cout << GloryBe;
        cout << Fatima;
    }

    cout << OurFather;

    for(int i = 1; i <= 10; i++) {
        cout << HailMary;
    }
    
    cout << HailHolyQueen;

    return 0;


}