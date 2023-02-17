import java.util.Scanner;

import ex6.Student;
import ex6.StudentManagement;

public class Ex6Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();
        while (true) {
            System.out.println("Enter 1: Add new student");
            System.out.println("Enter 2: Display 20 year old student");
            System.out.println("Enter 3: Display number of student whose age is 23 and hometown is DN");
            System.out.println("Enter 4: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Class: ");
                    String stdClass = scanner.nextLine();
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Hometown: ");
                    String hometown = scanner.nextLine();
                    Student student = new Student(stdClass, name, age, hometown);
                    management.addNewStudent(student);
                    System.out.println(student);
                    break;
                case 2:
                    management.showStdInAge20().forEach(o -> System.out.println(o.toString()));
                    break;
                case 3:
                    System.out.println(management.showNumberOfStudent(23, "DN"));
                    break;
                case 4:
                    return;
                default:
                    continue;
            }
        }
    }
}
