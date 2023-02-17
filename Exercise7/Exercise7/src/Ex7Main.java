import java.util.Scanner;

import ex7.Teacher;
import ex7.TeacherManagement;

public class Ex7Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TeacherManagement management = new TeacherManagement();
        while (true) {
            System.out.println("Enter 1: Add new Teacher");
            System.out.println("Enter 2: Delete teacher");
            System.out.println("Enter 3: Calculate salary");
            System.out.println("Enter 4: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Basic salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Bonus:");
                    double bonus = Double.parseDouble(scanner.nextLine());
                    System.out.println("Penalty: ");
                    double penalty = Double.parseDouble(scanner.nextLine());
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Hometown: ");
                    String hometown = scanner.nextLine();
                    System.out.println("ID: ");
                    String id = scanner.nextLine();
                    Teacher teacher = new Teacher(salary, bonus, penalty, name, age, hometown, id);
                    management.addNewTeacher(teacher);
                    System.out.println(teacher);
                    break;
                case 2:
                    System.out.println("Delete teacher: ");
                    String identification = scanner.nextLine();
                    management.delete(identification);
                    break;
                case 3:
                    System.out.println("Calculate Fee for customer: ");
                    String idCard = scanner.nextLine();
                    management.getActualSalary(idCard);
                    break;
                case 4:
                    return;
                default:
                    continue;
            }
        }
    }
}
