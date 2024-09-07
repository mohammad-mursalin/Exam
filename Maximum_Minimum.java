import java.util.Scanner;

class Check_Number {

    int number_1;
    int number_2;

    public void set_numbers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the first number : ");
        number_1 = scanner.nextInt();

        System.out.print("Enter the second number : ");
        number_2 = scanner.nextInt();
        System.out.println();

        scanner.close();
    }

    public void check() {

        if(number_1 > number_2) {

            System.out.println(number_1+ " is greater than " +number_2);
        }
        else if(number_1 < number_2) {

            System.out.println(number_2+ " is greater than " +number_1);
        }
        else {

            System.out.println("Numbers are equal");
        }

        System.out.println();
    }
}

public class Maximum_Minimum {

    public static void main(String[] args) {

        Check_Number check_number = new Check_Number();

        check_number.set_numbers();

        check_number.check();

    }

}

