import java.util.Scanner;

class Matrix_Calc {

    int row;
    int col;

    int[][] m1;
    int[][] m2;

    public void set_Matrix() {

        Scanner input = new Scanner(System.in);

        System.out.println();
        
        System.out.print("Enter number of rows for matrix 1 and 2: ");
        row = input.nextInt();

        System.out.print("Enter number of columns for matrix 1 and 2: ");
        col = input.nextInt();
        
        // Initializing the matrixes
        m1 = new int[row][col];
        m2 = new int[row][col];

        System.out.println();
        System.out.println("Enter elements for matrix 1:");

        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                System.out.printf("matrix1[%d][%d]= ", i, j);
                m1[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements for matrix 2:");

        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                System.out.printf("matrix2[%d][%d]= ", i, j);
                m2[i][j] = input.nextInt();
            }
        }

        input.close();
    }

    public void get_matrix() {

        System.out.println();

        System.out.println("Showing matrix 1 and 2 : ");

        System.out.println();

        System.out.print("m1 =");

        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                System.out.print("\t" + m1[i][j]);
            }

            System.out.println();
        }

        System.out.println();

        System.out.print("m2 =");

        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                System.out.print("\t" + m2[i][j]);
            }

            System.out.println();
        }
    }

    public void add_matrix() {

        System.out.println();
        System.out.println("After adding matrix 1 and 2 : ");
        System.out.println();

        System.out.print("m1+m2 =");

        for(int i = 0; i < row; i++) {

            for(int j = 0; j < col; j++) {

                System.out.print("\t" + (m1[i][j] + m2[i][j]));
            }

            System.out.println();
        }
    }
}

public class Matrix {

    public static void main(String[] args) {

        Matrix_Calc calc = new Matrix_Calc();

        calc.set_Matrix();
        calc.get_matrix();
        calc.add_matrix();
    }
}
