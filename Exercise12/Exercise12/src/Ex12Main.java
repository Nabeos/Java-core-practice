import java.util.Scanner;

import ex12.Bike;
import ex12.Car;
import ex12.Management;
import ex12.Transportation;
import ex12.Truck;

public class Ex12Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        while (true) {
            System.out.println("Enter 1: Add new transportation");
            System.out.println("Enter 2: Delete transportation");
            System.out.println("Enter 3: Search by brand");
            System.out.println("Enter 4: Search by color");
            System.out.println("Enter 5: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Enter 1: Car");
                    System.out.println("Enter 2: Bike");
                    System.out.println("Enter 3: Truck");
                    int option2 = Integer.parseInt(scanner.nextLine());
                    switch (option2) {
                        case 1: {
                            System.out.println("ID:");
                            String id = scanner.nextLine();
                            System.out.println("Manufacture Brand: ");
                            String brand = scanner.nextLine();
                            System.out.println("Manufacture year: ");
                            int year = Integer.parseInt(scanner.nextLine());
                            System.out.println("Price: ");
                            double price = Double.parseDouble(scanner.nextLine());
                            System.out.println("Color: ");
                            String color = scanner.nextLine();
                            System.out.println("No of seats: ");
                            int seats = Integer.parseInt(scanner.nextLine());
                            System.out.println("Engine model: ");
                            String engine = scanner.nextLine();
                            Transportation trans = new Car(id, brand, year, price, color, seats, engine);
                            management.addNewTrans(trans);
                            System.out.println(trans);
                            break;
                        }
                        case 2: {
                            System.out.println("ID:");
                            String id = scanner.nextLine();
                            System.out.println("Manufacture Brand: ");
                            String brand = scanner.nextLine();
                            System.out.println("Manufacture year: ");
                            int year = Integer.parseInt(scanner.nextLine());
                            System.out.println("Price: ");
                            double price = Double.parseDouble(scanner.nextLine());
                            System.out.println("Color: ");
                            String color = scanner.nextLine();
                            System.out.println("Capacity: ");
                            int capacity = Integer.parseInt(scanner.nextLine());
                            Transportation trans = new Bike(id, brand, year, price, color, capacity);
                            management.addNewTrans(trans);
                            System.out.println(trans);
                            break;
                        }
                        case 3: {
                            System.out.println("ID:");
                            String id = scanner.nextLine();
                            System.out.println("Manufacture Brand: ");
                            String brand = scanner.nextLine();
                            System.out.println("Manufacture year: ");
                            int year = Integer.parseInt(scanner.nextLine());
                            System.out.println("Price: ");
                            double price = Double.parseDouble(scanner.nextLine());
                            System.out.println("Color: ");
                            String color = scanner.nextLine();
                            System.out.println("Load: ");
                            int seats = Integer.parseInt(scanner.nextLine());
                            Transportation trans = new Truck(id, brand, year, price, color, seats);
                            management.addNewTrans(trans);
                            System.out.println(trans);
                            break;
                        }
                        default:
                            System.out.println("Error");
                            break;
                    }
                }
                case 2:
                    System.out.println("ID:");
                    String deleteId = scanner.nextLine();
                    management.delete(deleteId);
                    break;
                case 3: {
                    System.out.println("Brand: ");
                    String searchBrand = scanner.nextLine();
                    management.searchByBrand(searchBrand).forEach(o -> System.out.println(o.toString()));
                    break;
                }
                case 4: {
                    System.out.println("Color: ");
                    String searchColor = scanner.nextLine();
                    management.searchByColor(searchColor).forEach(o -> System.out.println(o.toString()));
                    break;
                }
                case 5:
                    return;
                default:
                    System.out.println("Error");
                    continue;
            }
        }
    }
}
