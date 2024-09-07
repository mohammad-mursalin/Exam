import java.util.Scanner;

class Add {

    String string_1;
    String string_2;

    public void set_strings() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String 1 : ");
        string_1 = scanner.next();
        scanner.nextLine();

        System.out.print("Enter String 2 : ");
        string_2 = scanner.nextLine();

        scanner.close();
    }

    public void strings_add () {

        String string_3 = string_1 + string_2;  // we could also use string_3 = string_1.concat(string_2);

        System.out.println();
        System.out.println("After adding two strings : " +string_3);
    }
}

public class Add_Strings {
    
    public static void main(String[] args) {
        
        Add add = new Add();

        add.set_strings();

        add.strings_add();

    }
}
