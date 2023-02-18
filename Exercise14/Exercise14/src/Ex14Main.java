import java.util.Scanner;

import ex14.StudentManagement;
import ex14.entity.GoodStudent;
import ex14.entity.NormalStudent;
import ex14.entity.Student;
import ex14.validator.Validator;

public class Ex14Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("Enter 1: Add new student");
            System.out.println("Enter 2: Choose passed Student automatically");
            System.out.println("Enter 3: Show Full name and phone number of students (sort by full name)");
            System.out.println("Enter 4: Show Full name and phone number of students (sort by phone number)");
            System.out.println("Enter 5: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    // choose type of student to enter
                    System.out.println("Enter 1: Good Student");
                    System.out.println("Enter 2: Normal Student");
                    int option2 = Integer.parseInt(scanner.nextLine());
                    switch (option2) {
                        case 1: {
                            System.out.println("Full name: ");
                            String name = Validator.fullNameCheck("Insert again");
                            System.out.println("Date of Birth (dd/MM/yyyy): ");
                            String bd = Validator.doBCheck("Insert again");
                            System.out.println("Phone number (10 numbers): ");
                            String phone = Validator.phoneCheck("Insert again");
                            System.out.println("Gender (nam or nu): ");
                            String gender = Validator.genderCheck();
                            System.out.println("University name: ");
                            String university = Validator.stringCheck();
                            System.out.println("Grade Level: ");
                            String gradeLevel = Validator.stringCheck();
                            System.out.println("GPA: ");
                            int gpa = Validator.numberCheck();
                            System.out.println("Best reward name: ");
                            String reward = Validator.stringCheck();
                            Student student = new GoodStudent(name, bd, gender, phone, university, gradeLevel, gpa,
                                    reward);
                            management.addNewStd(student);
                            System.out.println(student);
                            break;
                        }
                        case 2: {
                            System.out.println("Full name: ");
                            String name = Validator.fullNameCheck("Insert again");
                            System.out.println("Date of Birth (dd/MM/yyyy): ");
                            String bd = Validator.doBCheck("Insert again");
                            System.out.println("Phone number (10 numbers): ");
                            String phone = Validator.phoneCheck("Insert again");
                            System.out.println("Gender (nam or nu): ");
                            String gender = Validator.genderCheck();
                            System.out.println("University name: ");
                            String university = Validator.stringCheck();
                            System.out.println("Grade Level: ");
                            String gradeLevel = Validator.stringCheck();
                            System.out.println("English Score: ");
                            int englishScore = Validator.numberCheck();
                            System.out.println("Entry test score: ");
                            int entryScore = Validator.numberCheck();
                            Student student = new NormalStudent(name, bd, gender, phone, university, gradeLevel,
                                    englishScore, entryScore);
                            management.addNewStd(student);
                            System.out.println(student);
                            break;
                        }
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                }
                case 2:
                    System.out.println("Choose number of passed student:");
                    int number = Integer.parseInt(scanner.nextLine());
                    management.chooseStudent(number).forEach(o -> System.out.println(o.toString()));
                    break;
                case 3:
                    management.filterByFullName();
                    break;
                case 4:
                    management.filterByPhoneNumber();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
