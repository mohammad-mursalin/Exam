public class Lagrange {
    public static void main(String[] args) {
        
        int n = 4;

        double[] x = {5,6,9,11};
        double[] y = {12,13,14,16};

        double p = 10;

        double result = 0;
        double term = 1;

        for(int i = 0 ; i<n ; i++) {

            term = y[i];

            for(int j = 0 ; j < n ; j++) {

                if(i !=j){

                    term *= (p - x[j])/(x[i]-x[j]);
                }

            }

            result += term;
        }

        System.out.println("Interpolated value at f("+p+") is " +result);
    }
}
