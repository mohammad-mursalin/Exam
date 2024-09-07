#include <iostream>
using namespace std;

class Check_Number {

    int number_1;
    int number_2;

public:
    // Method to set numbers
    void set_numbers() {

        int number_1, number_2;

        cout << endl;
        cout << "Enter the first number: ";
        cin >> number_1;

        cout << "Enter the second number: ";
        cin >> number_2;
        cout << endl;
    }

    // Method to check which number is greater
    void check() {

        if (number_1 > number_2) {

            cout << number_1 << " is greater than " << number_2 << endl;
        }
        else if (number_1 < number_2) {

            cout << number_2 << " is greater than " << number_1 << endl;
        } 
        else {
            
            cout << "Numbers are equal" << endl;
        }

        cout << endl;
    }
};

int main() {

    // Create an instance of Check_Number
    Check_Number check_number;

    // call the set_numbers method

    check_number.set_numbers();

    // Call the check method
    check_number.check();

    return 0;
}
