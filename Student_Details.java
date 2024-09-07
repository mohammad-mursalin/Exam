import java.util.Scanner;

class Student {

    private String name;
    private int roll;
    private String section;

    public void set_details () {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter name of student : ");
        name = scanner.next();
        scanner.nextLine();

        System.out.print("Enter roll : ");
        roll = scanner.nextInt();

        System.out.print("Enter section : ");
        section = scanner.next();
        scanner.nextLine();

        scanner.close();
    }

    public void get_details() {

        System.out.println();
        System.out.println("Information of Student " +name);
        System.out.println("Name : " +name);
        System.out.println("Roll : " +roll);
        System.out.println("Section : " +section);
    }
}

public class Student_Details {
    
    public static void main(String[] args) {

        Student student = new Student();

        student.set_details();

        student.get_details();
    }
}
