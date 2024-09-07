public class Backward {
    public static void main(String[] args) {
        
        double[] x = {};
        double[] y = {};

        double point;

        double[][] diffTable = new double[x.length][x.length];

        for(int i = 0 ; i < x.length ; i++)

            diffTable[i][0] = y[i];

        for(int i = 1 ; i < y.length ; i++) {

            for(int j = 1 ; j < y.length ; j++) {

                diffTable[j][i] = diffTable[j][i-1] - diffTable[j-1][i-1];
            }
        }

        double u = (point-x[0])/(x[1]-x[0]);

        double result = y[x.length-1];

        double term = 1;

        for(int i = 1 ; i < x.length ; i++) {

            term *= (u +i-1)/i;
            result += term*diffTable[x.length-1][i];
        }
    }
}
