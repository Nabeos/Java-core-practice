import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex13.Certificate;
import ex13.Employee;
import ex13.EmployeeManagement;
import ex13.Experience;
import ex13.Fresher;
import ex13.Intern;
import ex13.validator.Validator;

public class Ex13Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();
        while (true) {
            System.out.println("Enter 1: Add new Employee");
            System.out.println("Enter 2: Delete Employee by id");
            System.out.println("Enter 3: Search employee by Type");
            System.out.println("Enter 4: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Enter 1: Experience");
                    System.out.println("Enter 2: Fresher");
                    System.out.println("Enter 3: Intern");
                    int option2 = Integer.parseInt(scanner.nextLine());
                    switch (option2) {
                        case 1: {
                            System.out.println("ID:");
                            String id = scanner.nextLine();
                            Employee existed = management.getEmployee(id);
                            if (existed != null) {
                                System.out.println(
                                        "Already had employee, you can edit this employee (can be blank if no update)");
                                System.out.println(existed.toString());
                                if (existed instanceof Experience) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Experience in year (must insert 0): ");
                                    int expInYear = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Pro Skill: ");
                                    String skill = scanner.nextLine();
                                    management.editExp(id, name, bd, phone, email, expInYear, skill);
                                } else if (existed instanceof Fresher) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Graduation date: ");
                                    String graDate = scanner.nextLine();
                                    System.out.println("Graduation rank: ");
                                    String rank = scanner.nextLine();
                                    System.out.println("Education: ");
                                    String edu = scanner.nextLine();
                                    management.editFresher(id, name, bd, phone, email, graDate, rank, edu);
                                } else if (existed instanceof Intern) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Majors: ");
                                    String majors = scanner.nextLine();
                                    System.out.println("Semester: ");
                                    String semester = scanner.nextLine();
                                    System.out.println("University: ");
                                    String university = scanner.nextLine();
                                    management.editIntern(id, name, bd, phone, email, majors, semester, university);
                                }
                            } else {
                                System.out.println("Full name: ");
                                String name = Validator.nameCheck("Insert again");
                                System.out.println("Birth day: ");
                                String bd = Validator.birthDayCheck("Insert again");
                                System.out.println("Phone: ");
                                String phone = Validator.phoneCheck("Insert again");
                                System.out.println("Email: ");
                                String email = Validator.emailCheck("Insert again");
                                System.out.println("Experience in year: ");
                                int expInYear = Integer.parseInt(scanner.nextLine());
                                System.out.println("Pro Skill: ");
                                String skill = scanner.nextLine();
                                System.out.println("Certificate: ");
                                String op;
                                List<Certificate> certificates = new ArrayList<>();
                                do {
                                    System.out.println("ID");
                                    String certId = scanner.nextLine();
                                    System.out.println("name:");
                                    String certName = scanner.nextLine();
                                    System.out.println("rank:");
                                    String certRank = scanner.nextLine();
                                    System.out.println("date:");
                                    String certDate = scanner.nextLine();
                                    certificates.add(new Certificate(certId, certName, certRank, certDate));
                                    System.out.println("Do you have more cert? (y/n)");
                                    op = scanner.nextLine();
                                } while (op.equalsIgnoreCase("y"));
                                Employee employee = new Experience(id, name, bd, phone, email, 0, certificates,
                                        expInYear,
                                        skill);
                                management.addNewEmployee(employee);
                                System.out.println(employee);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("ID:");
                            String id = scanner.nextLine();
                            Employee existed = management.getEmployee(id);
                            if (existed != null) {
                                System.out.println(
                                        "Already had employee, you can edit this employee (can be blank if no update)");
                                System.out.println(existed.toString());
                                if (existed instanceof Experience) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Experience in year (must insert 0): ");
                                    int expInYear = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Pro Skill: ");
                                    String skill = scanner.nextLine();
                                    management.editExp(id, name, bd, phone, email, expInYear, skill);
                                } else if (existed instanceof Fresher) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Graduation date: ");
                                    String graDate = scanner.nextLine();
                                    System.out.println("Graduation rank: ");
                                    String rank = scanner.nextLine();
                                    System.out.println("Education: ");
                                    String edu = scanner.nextLine();
                                    management.editFresher(id, name, bd, phone, email, graDate, rank, edu);
                                } else if (existed instanceof Intern) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Majors: ");
                                    String majors = scanner.nextLine();
                                    System.out.println("Semester: ");
                                    String semester = scanner.nextLine();
                                    System.out.println("University: ");
                                    String university = scanner.nextLine();
                                    management.editIntern(id, name, bd, phone, email, majors, semester, university);
                                }
                            } else {
                                System.out.println("Full name: ");
                                String name = scanner.nextLine();
                                System.out.println("Birth day: ");
                                String bd = scanner.nextLine();
                                System.out.println("Phone: ");
                                String phone = scanner.nextLine();
                                System.out.println("Email: ");
                                String email = scanner.nextLine();
                                System.out.println("Graduation date: ");
                                String graDate = scanner.nextLine();
                                System.out.println("Graduation rank: ");
                                String rank = scanner.nextLine();
                                System.out.println("Education: ");
                                String edu = scanner.nextLine();
                                String op;
                                List<Certificate> certificates = new ArrayList<>();
                                do {
                                    System.out.println("ID");
                                    String certId = scanner.nextLine();
                                    System.out.println("name:");
                                    String certName = scanner.nextLine();
                                    System.out.println("rank:");
                                    String certRank = scanner.nextLine();
                                    System.out.println("date:");
                                    String certDate = scanner.nextLine();
                                    certificates.add(new Certificate(certId, certName, certRank, certDate));
                                    System.out.println("Do you have more cert? (y/n)");
                                    op = scanner.nextLine();
                                } while (op.equalsIgnoreCase("y"));
                                Employee employee = new Fresher(id, name, bd, phone, email, 1, certificates, graDate,
                                        rank, edu);
                                management.addNewEmployee(employee);
                                System.out.println(employee);
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("ID:");
                            String id = scanner.nextLine();
                            Employee existed = management.getEmployee(id);
                            if (existed != null) {
                                System.out.println(
                                        "Already had employee, you can edit this employee (can be blank if no update)");
                                System.out.println(existed.toString());
                                if (existed instanceof Experience) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Experience in year (must insert 0): ");
                                    int expInYear = Integer.parseInt(scanner.nextLine());
                                    System.out.println("Pro Skill: ");
                                    String skill = scanner.nextLine();
                                    management.editExp(id, name, bd, phone, email, expInYear, skill);
                                } else if (existed instanceof Fresher) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Graduation date: ");
                                    String graDate = scanner.nextLine();
                                    System.out.println("Graduation rank: ");
                                    String rank = scanner.nextLine();
                                    System.out.println("Education: ");
                                    String edu = scanner.nextLine();
                                    management.editFresher(id, name, bd, phone, email, graDate, rank, edu);
                                } else if (existed instanceof Intern) {
                                    System.out.println("Full name: ");
                                    String name = scanner.nextLine();
                                    System.out.println("Birth day: ");
                                    String bd = scanner.nextLine();
                                    System.out.println("Phone: ");
                                    String phone = scanner.nextLine();
                                    System.out.println("Email: ");
                                    String email = scanner.nextLine();
                                    System.out.println("Majors: ");
                                    String majors = scanner.nextLine();
                                    System.out.println("Semester: ");
                                    String semester = scanner.nextLine();
                                    System.out.println("University: ");
                                    String university = scanner.nextLine();
                                    management.editIntern(id, name, bd, phone, email, majors, semester, university);
                                }
                            } else {
                                System.out.println("Full name: ");
                                String name = scanner.nextLine();
                                System.out.println("Birth day: ");
                                String bd = scanner.nextLine();
                                System.out.println("Phone: ");
                                String phone = scanner.nextLine();
                                System.out.println("Email: ");
                                String email = scanner.nextLine();
                                System.out.println("Majors: ");
                                String majors = scanner.nextLine();
                                System.out.println("Semester: ");
                                String semester = scanner.nextLine();
                                System.out.println("University: ");
                                String university = scanner.nextLine();
                                String op;
                                List<Certificate> certificates = new ArrayList<>();
                                do {
                                    System.out.println("ID");
                                    String certId = scanner.nextLine();
                                    System.out.println("name:");
                                    String certName = scanner.nextLine();
                                    System.out.println("rank:");
                                    String certRank = scanner.nextLine();
                                    System.out.println("date:");
                                    String certDate = scanner.nextLine();
                                    certificates.add(new Certificate(certId, certName, certRank, certDate));
                                    System.out.println("Do you have more cert? (y/n)");
                                    op = scanner.nextLine();
                                } while (op.equalsIgnoreCase("y"));
                                Employee employee = new Intern(id, name, bd, phone, email, 2, certificates, majors,
                                        semester, university);
                                management.addNewEmployee(employee);
                                System.out.println(employee);
                            }
                            break;
                        }
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                }
                case 2:
                    System.out.println("ID:");
                    String deleteId = scanner.nextLine();
                    management.delete(deleteId);
                    break;
                case 3: {
                    System.out.println("Type: ");
                    int type = Integer.parseInt(scanner.nextLine());
                    management.findByType(type).forEach(o -> System.out.println(o.toString()));
                    break;
                }
                case 4:
                    return;
                default:
                    System.out.println("Error");
                    continue;
            }
        }
    }
}
