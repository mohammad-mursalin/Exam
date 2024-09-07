public class DividedDifference {
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

        // System.out.print("Enter the value where interpolation is needed : ");
        // double p = scanner.nextDouble();

        int n = 6;

        double[] x = {4,5,7,10,11,13};
        double[] y = {48,100,294,900,1210,2028};

        double p = 15;

        double[][] diffTable = new double[n][n];

        for (int i = 0 ; i < n ; i++) {

            diffTable[i][0] = y[i];
        }

        for(int i = 1 ; i < n ; i++) {

            for(int j = 0 ; j < n-i ; j++) {

                diffTable[j][i] = (diffTable[j + 1][i - 1] - diffTable[j][i - 1]) / (x[j + i] - x[j]);

            }
        }

        double result = y[0], term = 1;

        for(int i = 1 ; i < n ; i++) {

            term *= (p-x[i-1]);

            result += term*diffTable[0][i];
            
        }

        System.out.println("Interpolated value at f("+p+") is " +result);
    }
}
