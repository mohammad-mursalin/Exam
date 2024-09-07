#include <iostream>
using namespace std;

class grade
{
    string name;
    double marks;

public:
    grade() {}

    void setData(string s, double m)
    {
        name = s;
        marks = m;
    }

    double calGradepoint()
    {
        double point;
        string result;

        if (marks >= 80 && marks <= 100)
        {
            point = 5.0;
            result = "A+";
        }
        else if (marks >= 75 && marks < 80)
        {
            point = 4.5;
            result = "A";
        }
        else if (marks >= 70 && marks < 75)
        {
            point = 4.0;
            result = "A-";
        }
        else if (marks >= 60 && marks < 70)
        {
            point = 3.5;
            result = "B+";
        }
        else if (marks >= 55 && marks < 60)
        {
            point = 3.0;
            result = "B";
        }
        else if (marks >= 50 && marks < 55)
        {
            point = 2.5;
            result = "C";
        }
        else if (marks >= 40 && marks < 50)
        {
            point = 2.0;
            result = "D";
        }
        else if (marks >= 0 && marks < 40)
        {
            point = 0.0;
            result = "F";
        }

        cout << "Your gradepoint in " << name << " = " << point << "\n";
        cout << "You got " << result << " in " << name << endl;

        return point;
    }
};

double calculateCumulativeGradePoint(grade *ptr, int size)
{
    double cumulativeGradePoint = 0.0;

    // for (int i = 0; i < size; i++)
    // {
    //     cumulativeGradePoint += (ptr + i)->calGradepoint();
    // }
    for (int i = 0; i < size; i++)
    {
        if ((ptr + i)->calGradepoint() == 0)
        {
            return cumulativeGradePoint = 0;
            break;
        }
        else
        {
            cumulativeGradePoint += (ptr + i)->calGradepoint();
        }
    }

    return cumulativeGradePoint / size;
}

int main()
{
    int size;
    cout << "How many subjects you have?"
         << "\n";
    cin >> size;
    string sub;
    double score;

    grade *ptr = new grade[size];
    for (int i = 0; i < size; i++)
    {
        cout << "Enter the subject name and score : " << endl;
        cin >> sub >> score;
        (ptr + i)->setData(sub, score);
    }

    double cumulativeGradePoint = calculateCumulativeGradePoint(ptr, size);
    cout << "Cumulative Grade Point: " << cumulativeGradePoint << endl;

    delete[] ptr;
    return 0;
}