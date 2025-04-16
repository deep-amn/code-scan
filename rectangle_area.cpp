// rectangle_area.cpp
// A simple C++ program to calculate the area of a rectangle

#include <iostream>
using namespace std;

int main() {
    double width, height;

    cout << "=== Rectangle Area Calculator ===" << endl;

    cout << "Enter the width: ";
    cin >> width;

    cout << "Enter the height: ";
    cin >> height;

    double area = width * height;

    cout << "The area of the rectangle is: " << area << endl;

    return 0;
}
