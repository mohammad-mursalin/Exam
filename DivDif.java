public class DivDif {
    
    public static void main(String[] args) {
        
        int n = 6;

        double[] x = {4,5,7,10,11,13};
        double[] y = {48,100,294,900,1210,2028};

        double p = 15;

        double[][] diffTable = new double[n][n];

        for(int i = 0 ; i < n ; i++) {

            diffTable[i][0] = y[i];
        }

        for(int i = 1 ; i < n ; i++) {

            for( int j = 0 ; j < n-i ; j++) {

                diffTable[j][i] = (diffTable[j+1][i-1] - diffTable[j][i-1]) / (x[i+j] - x[j]);
            }
        }

        double result = y[0];
        double term = 1;

        for(int i = 1 ; i < n ; i++) {

            term *= (p-x[i-1]);

            result += term*diffTable[0][i];
        }

        System.out.println("Interpolated value at f("+p+") is " +result);
    }
}
