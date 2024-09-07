
public class NewtonGregoryForwardInterpolation {

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // // Total number of points
        // System.out.print("Enter the total number of points: ");
        // int n = scanner.nextInt();

        // double[] x = new double[n];
        // double[] y = new double[n];

        // // Input x values
        // System.out.println("Enter the values of x: ");
        // for (int i = 0; i < n; i++) {
        //     x[i] = scanner.nextDouble();
        // }

        // // Input y values
        // System.out.println("Enter the values of y: ");
        // for (int i = 0; i < n; i++) {
        //     y[i] = scanner.nextDouble();
        // }

        // // Estimated interpolating point
        // System.out.print("Enter the value at which interpolation is desired: ");
        // double e = scanner.nextDouble();

        int n = 6;

        double[] x = {1911, 1921, 1931, 1941, 1951, 1961};
        double[] y = {12, 15, 20, 27, 39, 52};

        double e = 1946;

        double[][] diff = new double[n][n];

        for (int i = 0; i < n; i++) {
            diff[i][0] = y[i];
        }

        for (int i = 1; i < n; i++) {
            
            for (int j = 0; j < n - i; j++) {
                diff[j][i] = diff[j + 1][i - 1] - diff[j][i - 1];
            }
        }

        double result = y[0];

        double u = (e - x[0]) / (x[1] - x[0]);
        
        double term = 1.0; 

        for (int i = 1; i < n; i++) {
            
            term = term * (u - (i - 1)) / i;
            
            result = result + term * diff[0][i];
        }

        System.out.printf("Interpolated value at f(%.2f) is %.2f\n", e, result);
    }
}
