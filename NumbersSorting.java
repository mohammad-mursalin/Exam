import java.util.Arrays;
import java.util.Scanner;

class Sort_Numbers {

    int[] numbers;
    int n;

    public void set_numbers() {

        Scanner scanner = new Scanner(System.in);

        // Here we are taking the length of the array

        System.out.print("\nTotal number of numbers to be sort : ");
        n = scanner.nextInt();
        System.out.println();

        numbers = new int[n];

        System.out.print("Enter the numbers : ");

        for( int i = 0 ; i < n ; i++) {

            numbers[i] = scanner.nextInt();
        }

        System.out.println();

        scanner.close();
    }

    public void numbers_sort () {

        Arrays.sort(numbers); // Here sort is a library function of class Arrays of java.util package

        System.out.print("Numbers sorted in ascending order :");

        for( int i = 0 ; i < n ; i++) {

            System.out.print(" " +numbers[i]);
        }

        System.out.println();

        System.out.print("Numbers sorted in descending order :");

        for( int i = n-1 ; i >= 0 ; i--) {

            System.out.print(" " +numbers[i]);
        }

        System.out.println();
    }
}

public class NumbersSorting {
    
    public static void main(String[] args) {

        Sort_Numbers sort_numbers = new Sort_Numbers();

        sort_numbers.set_numbers();

        sort_numbers.numbers_sort();
        
    }
}
