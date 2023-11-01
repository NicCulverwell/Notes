#include <iostream>

using namespace std;


class Rectangle {

    float length = 1;
    float width = 1;


    public: 

        Rectangle(float width, float length) {
            this->length = length;
            this->width = width;
        }


        float getPerimeter() {
            return length*2 + width*2;
        }


        float getArea() {
            return length*width;
        }


        void setLength(float length) {
            if(length > 0 && length < 20) {
                this->length = length;
            } else {
                cout << "You enetered an invalid number";
            }
        }


        void setWidth(float width) {
            if(width > 0 && width < 20) {
                this->width = width;
            } else {
                cout << "You enetered an invalid number";
            }
        }


        float getLength() {
            return length;
        }


        float getWidth() {
            return width;
        }

};


int main() {

    Rectangle test(5,10);

    cout << test.getArea();


}