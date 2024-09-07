public class BackwardNew {
    
        public static void main(String[] args) {
            
            double[] x = {1,2,3,4,5,6,7,8};
            double[] y = {1,8,27,64,125,216,343,512};
    
            double point= 7.5;
    
            double[][] diffTable = new double[x.length][x.length];
    
            for(int i = 0; i < y.length; i++)
    
                diffTable[i][0] = y[i];
    
            for(int i = 1 ; i < y.length; i++) {
    
                for(int j = y.length - 1 ; j >= i ; j--) {
    
                    diffTable[j][i] = diffTable[j][i-1] - diffTable[j-1][i-1];
                }
            }
    
            double u = (point-x[x.length-1])/(x[1]-x[0]);
    
            double result = y[x.length-1];
    
            double term = 1;
    
            for(int i = 1 ; i < x.length ; i++) {
    
                term *= (u + i-1)/i;
                result += term*diffTable[x.length-1][i];
            }

            System.out.printf("Interpolated value at f(%.2f) is %.2f\n", point, result);
        }
    
    
}
