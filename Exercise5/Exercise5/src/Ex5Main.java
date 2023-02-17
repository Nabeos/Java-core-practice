import java.util.Scanner;

import ex5.Hotel;
import ex5.Person;
import ex5.Room;
import ex5.RoomA;
import ex5.RoomB;
import ex5.RoomC;

public class Ex5Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Room room = null;
        while (true) {
            System.out.println("Enter 1: Add new customer");
            System.out.println("Enter 2: Delete customer");
            System.out.println("Enter 3: Calculate fee");
            System.out.println("Enter 4: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Number of rent day: ");
                    int numberOfRentDay = Integer.parseInt(scanner.nextLine());
                    System.out.println("Which room (A, B, C):");
                    System.out.println("Enter 1: Room A (price: 500$)");
                    System.out.println("Enter 2: Room B (price: 300$)");
                    System.out.println("Enter 3: Room C (price: 100$)");
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number == 1)
                        room = new RoomA();
                    else if (number == 2)
                        room = new RoomB();
                    else
                        room = new RoomC();
                    System.out.println("Please Fill Your information Below");
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("ID: ");
                    String id = scanner.nextLine();
                    Person person = new Person(name, age, id, room, numberOfRentDay);
                    hotel.addNewCustomer(person);
                    System.out.println(person);
                    break;
                case 2:
                    System.out.println("Delete customer: ");
                    String identification = scanner.nextLine();
                    if (hotel.deletedCustomerById(identification))
                        System.out.println("Success");
                    else
                        System.out.println("Fail");
                    break;
                case 3:
                    System.out.println("Calculate Fee for customer: ");
                    String idCard = scanner.nextLine();
                    System.out.println(hotel.calculateMoney(idCard));
                    break;
                case 4:
                    return;
                default:
                    continue;
            }
        }
    }
}
