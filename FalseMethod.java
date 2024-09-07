import java.util.Scanner;

public class FalseMethod {

    public static void main(String[] args) {
        
        double b,a,c=1,fb,fa,fc = 1,epsilon=0;

        int m,n,p,i=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("mx2 + nx +p = 0");

        System.out.print("m n p : ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        p = scanner.nextInt();

        // System.out.print("n = ");
        // n = scanner.nextInt();

        // System.out.print("p = ");
        // p = scanner.nextInt();

        System.out.print("Upper bound and Lower bound = ");
        b = scanner.nextDouble();
        a = scanner.nextDouble();

        // System.out.print("Lower bound = ");
        // a = scanner.nextDouble();

        while( (b-a) >= epsilon && i< 100) {

            fb = m*b*b + n*b + p;

            fa = m*a*a + n*a + p;

            if( fb*fa > 0) {

                System.out.println("Root not found in the given interval.");
                scanner.close();
                return;
            }

            c = (a*fb-b*fa)/(fb-fa);

            fc = m*c*c + n*c + p;

            if( fb*fc > 0 )
                b = c;

            else 
                a = c;

            if( fc == 0)
                break;

            i++;
            
        }

        if (Math.abs(fc) <= epsilon) {

            System.out.println(fc + "  "+i+"   Root is " + c);
        } 
        else {

            System.out.println(fc + "  "+i+"   Root "+c+" found within maximum iterations.");
            System.out.println("Increase iterations to get more closer value");
        }

        scanner.close();
    }
}