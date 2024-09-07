#include <iostream>
using namespace std;

class Sorting {
private:
    int length;
    int numbers[100];

public:
    void get_numbers() {

        cout << "Enter the number of numbers to be sorted: ";
        cin >> length;

        cout << "Enter the numbers to be sorted: ";

        for(int i = 0; i < length; i++) {

            cin >> numbers[i];
        }
    }

    void sort_numbers() {

        for(int i = 0; i < length; i++) {

            for(int j = i + 1; j < length; j++) {

                if(numbers[i] > numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    void in_ascending() {

        cout << "\nNumbers in ascending order: ";

        for(int i = 0; i < length; i++) {

            cout << numbers[i] << " ";
        }
        cout << endl;
    }

    void in_descending() {

        cout << "Numbers in descending order: ";

        for(int i = length - 1; i >= 0; i--) {

            cout << numbers[i] << " ";
        }
        cout << endl;
    }
};

int main() {

    Sorting sort;

    sort.get_numbers();
    sort.sort_numbers();
    sort.in_ascending();
    sort.in_descending();

    return 0;
}
