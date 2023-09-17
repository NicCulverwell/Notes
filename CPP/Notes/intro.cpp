#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int CalculateIntAverage(int num1, int num2, int num3) {

    return ((int)(num1) + (int)(num2) + (int)(num3)/3);

}

double CalculateDoubleAverage(int num1, int num2, int num3) {

    return (double)((num1 + num2 + num3)/3);

}

int main (){

    double FirstNum, SecondNum, ThirdNum, FirstDec, SecondDec, ThirdDec;

    string integerRequest = "Please enter an integer: \n";
    string decimalRequest = "Please enter a number with three decimals: \n";

    cout << integerRequest;
    cin >> FirstNum;

    cout << integerRequest;
    cin >> SecondNum;

    cout << integerRequest;
    cin >> ThirdNum;

    int answer1 = CalculateIntAverage(FirstNum, SecondNum, ThirdNum);

    cout << "The average of these integers is " << CalculateIntAverage << "but let's now try this again with decimals\n";

    cout << decimalRequest;
    cin >> FirstDec;

    cout << decimalRequest;
    cin >> SecondDec;

    cout << decimalRequest;
    cin >> ThirdDec;

    int answer2 = CalculateIntAverage(FirstDec, SecondDec, ThirdDec);

    cout << "The average of these numbers is:  " << answer2 << "to three decimal places\n";

    int answer3 = CalculateIntAverage(FirstDec, SecondDec, ThirdDec);

    cout << "And the average of these numbers rounded to the nearest integer is:  " << answer3;

    return 0;

}