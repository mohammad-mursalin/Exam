#include <iostream>
using namespace std;

class Matrix_Calc {

private:
    int row;
    int col;
    
    int m1[100][100];
    int m2[100][100];
    

public:

    void set_Matrix() {

        cout << "\nEnter number of rows for matrix 1 and 2: ";
        cin >> row;

        cout << "Enter number of columns for matrix 1 and 2: ";
        cin >> col;

        // Initializing the matrices
        m1[row][col];
        m2[row][col];

        cout << "\nEnter elements for matrix 1:" << endl;

        for (int i = 0; i < row; ++i) {

            for (int j = 0; j < col; ++j) {

                cout << "matrix1[" << i << "][" << j << "]= ";
                cin >> m1[i][j];
            }
        }

        cout << "Enter elements for matrix 2:" << endl;

        for (int i = 0; i < row; ++i) {

            for (int j = 0; j < col; ++j) {

                cout << "matrix2[" << i << "][" << j << "]= ";
                cin >> m2[i][j];
            }
        }
    }

    void get_matrix() const {

        cout << "Showing matrix 1 and 2: " << endl << endl;

        cout << "m1 =";

        for (int i = 0; i < row; ++i) {

            for (int j = 0; j < col; ++j) {

                cout << "\t" << m1[i][j];
            }
            cout << endl;
        }

        cout << endl;

        cout << "m2 =";

        for (int i = 0; i < row; ++i) {

            for (int j = 0; j < col; ++j) {

                cout << "\t" << m2[i][j];
            }
            cout << endl;
        }
    }

    void add_matrix() {

        cout << "\nAfter adding matrix 1 and 2: " << endl << endl;

        cout << "m1+m2 =";
        
        for (int i = 0; i < row; ++i) {

            for (int j = 0; j < col; ++j) {

                cout << "\t" << (m1[i][j] + m2[i][j]);
            }
            cout << endl;
        }
    }
};

int main() {

    Matrix_Calc calc;

    calc.set_Matrix();
    calc.get_matrix();
    calc.add_matrix();

    return 0;
}
