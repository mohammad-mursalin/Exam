import java.util.Scanner;

public class BisectionalMethod {
    
    public static void main(String[] args) {
        
        double a , b, c = 0, fa, fb, fc = 1, epsilon=0.0001;
        int m, n, p, i=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("mx2 + nx +p = 0");

        System.out.print("m n p : ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        p = scanner.nextInt();

        System.out.print("Upper bound and Lower bound : ");
        b = scanner.nextDouble();
        a = scanner.nextDouble();

        while( (b-a) >= epsilon && i< 100) {

            fb = m*b*b + n*b + p;

            fa = m*a*a + n*a + p;

            if (fa * fb > 0) {
                
                System.out.println("Root not found in the given interval.");
                scanner.close();
                return;
            }

            c = (a+b)/2;

            fc = m*c*c + n*c + p;

            if (fc * fa < 0) 
                b = c;

            else 
                a = c;

            if( fc == 0)
                break;

            i++;
            
        }

        if (Math.abs(fc) <= epsilon) {

            System.out.println(fc + "  "+i + "  Root is approximately " + c);
        } 
        else {

            System.out.println(fc + "  "+i+"  Root found at " + c + " within maximum iterations.");
            System.out.println("Increase the number of iterations for a more accurate result.");
        }

        scanner.close();

    }
}
