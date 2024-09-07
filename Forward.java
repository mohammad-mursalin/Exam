public class Forward {
    public static void main(String[] args) {
        
        double[] x = {};
        double[] y = {};

        double point;

        double[][] diffTable = new double[x.length][x.length];

        for(int i = 0; i < y.length; i++)

            diffTable[i][0] = y[i];

        for(int i = 1 ; i < y.length; i++) {

            for(int j = 0 ; j< y.length - i; j++) {

                diffTable[j][i] = diffTable[j+1][i-1] - diffTable[j][i-1];
            }
        }

        double u = (point-x[0])/(x[1]-x[0]);

        double result = y[0];

        double term = 1;

        for(int i = 1 ; i < x.length ; i++) {

            term *= (u-(i-1))/i;
            result += term*diffTable[0][i];
        }
    }
}
