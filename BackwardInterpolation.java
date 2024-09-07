
public class BackwardInterpolation {
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Number of point : ");
        // int n = scanner.nextInt();
        
        // double[] x = new double[n];
        // double[] y = new double[n];

        // System.out.print("Enter the value of x : ");

        // for (int i = 0 ; i < n ; i++) {

        //     x[i] = scanner.nextDouble();
        // }

        // System.out.print("Enter the value of y : ");

        // for (int i = 0 ; i < n ; i++) {

        //     y[i] = scanner.nextDouble();
        // }

        // System.out.print("Enter the value wherer interpolation is needed : ");
        // double p = scanner.nextDouble();

        int n = 8;

        double[] x = {1,2,3,4,5,6,7,8};
        double[] y = {1,8,27,64,125,216,343,512};

        double p = 7.5;

        double[][] diffTable = new double[n][n];

        for (int i = 0 ; i < n ; i++) {

            diffTable[i][0] = y[i];
        }

        for( int i = 1 ; i < n ; i++ ) {

            for( int j = i ; j < n ; j++) {

                diffTable[j][i] = diffTable[j][i-1] - diffTable[j-1][i-1];
            }
        }

        double u = (p - x[n-1])/(x[1]-x[0]);

        double result = y[n-1], term = 1;


        for ( int i = 1 ; i < n ; i++ ) {

            term = term * ( u + i - 1 )/i;
            result = result + term * diffTable[n-1][i];
        }

        System.out.printf("Interpolated value at f(%.2f) is %.2f\n", p, result);

        // scanner.close();
    }
}
