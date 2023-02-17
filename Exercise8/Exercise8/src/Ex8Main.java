import java.util.Scanner;

import ex8.Card;
import ex8.CardManagement;
import ex8.Student;

public class Ex8Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CardManagement management = new CardManagement();
        while (true) {
            System.out.println("Enter 1: Add new Card");
            System.out.println("Enter 2: Delete Card");
            System.out.println("Enter 3: Show");
            System.out.println("Enter 4: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Id: ");
                    String id = scanner.nextLine();
                    System.out.println("Borrowed Date:");
                    int date = Integer.parseInt(scanner.nextLine());
                    System.out.println("Deadline to pay: ");
                    int deadline = Integer.parseInt(scanner.nextLine());
                    System.out.println("Book Id: ");
                    int bookId = Integer.parseInt(scanner.nextLine());
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Class: ");
                    String stdClass = scanner.nextLine();
                    Student student = new Student(name, age, stdClass);
                    Card card = new Card(id, date, deadline, bookId, student);
                    management.addNewCard(card);
                    System.out.println(card);
                    break;
                case 2:
                    System.out.println("Delete Card with Id: ");
                    String identification = scanner.nextLine();
                    management.delete(identification);
                    break;
                case 3:
                    System.out.println("Cards list: ");
                    management.show();
                    break;
                case 4:
                    return;
                default:
                    continue;
            }
        }
    }
}
