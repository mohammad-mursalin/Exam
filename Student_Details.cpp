#include <iostream>
#include <string>
using namespace std;

class Student {

private:
    string name;
    int roll;
    string section;

public:
    void set_details() {
        
        cout << "\nEnter name of student: ";
        cin >> name;

        cout << "Enter roll: ";
        cin >> roll;

        cout << "Enter section: ";
        cin >> section;
    }

    void get_details() {

        cout << "\nInformation of Student " << name << endl;
        cout << "Name: " << name << endl;
        cout << "Roll: " << roll << endl;
        cout << "Section: " << section << endl;
    }
};

int main() {

    Student student;

    student.set_details();
    student.get_details();

    return 0;
}
