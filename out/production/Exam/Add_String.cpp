#include <iostream>
#include <string>
using namespace std;

class Add {

public:

    string string_1, string_2;

    void set_strings () {

        cout << "Enter String 1: ";
        cin >> string_1;

        cout << "Enter String 2: ";
        cin >> string_2;
    }
    void strings_add() {

        string string_3 = string_1 + string_2;  // we could also use string_3 = string_1.append(string_2);

        cout << "\nAfter adding two strings : " << string_3 << endl;
    }
};

int main() {
    
    Add add;
    add.set_strings();
    add.strings_add();

    return 0;
}
