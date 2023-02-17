import java.util.Scanner;

import ex9.HouseHold;
import ex9.Management;
import ex9.Receipt;
import ex9.ReceiptManagement;

public class Ex9Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management();
        ReceiptManagement receiptManagement = new ReceiptManagement();
        while (true) {
            System.out.println("Enter 1: Add more family");
            System.out.println("Enter 2: Add receipt");
            System.out.println("Enter 3: Show Information");
            System.out.println("Enter 4: Delete family");
            System.out.println("Enter 5: Edit family");
            System.out.println("Enter 6: Calculate Price");
            System.out.println("Enter 7: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Host Name");
                    String name = scanner.nextLine();
                    System.out.println("Address: ");
                    String address = scanner.nextLine();
                    System.out.println("ID: ");
                    String id = scanner.nextLine();
                    management.addNewHouseHold(new HouseHold(name, address, id));
                    break;
                }
                case 2:
                    System.out.println("Old electricity:");
                    int old = Integer.parseInt(scanner.nextLine());
                    System.out.println("New electricity:");
                    int newElec = Integer.parseInt(scanner.nextLine());
                    HouseHold houseHold = null;
                    while (true) {
                        System.out.println("Enter code of elec from family: ");
                        String code = scanner.nextLine();
                        houseHold = management.getById(code);
                        if (houseHold == null) {
                            System.out.println("error, check again");
                            continue;
                        } else
                            break;
                    }
                    Receipt receipt = new Receipt(houseHold, old, newElec);
                    receiptManagement.addNewReceipt(receipt);
                    System.out.println(receipt);
                    break;
                case 3:
                    management.showInfoHouseHold();
                    break;
                case 4:
                    System.out.println("enter id meter: ");
                    String meter = scanner.nextLine();
                    management.delete(meter);
                    break;
                case 5: {
                    System.out.println("Enter ID to edit: ");
                    String id = scanner.nextLine();
                    System.out.println("Host Name");
                    String name = scanner.nextLine();
                    System.out.println("Address: ");
                    String address = scanner.nextLine();
                    management.edit(id, name, address);
                    break;
                }
                case 6:
                    System.out.println("Enter ID to find price: ");
                    String id = scanner.nextLine();
                    Receipt receipt2 = receiptManagement.findReceiptByHouseHold(management.getById(id));
                    System.out.println("The money must pay: "+receiptManagement.calculateMoney(receipt2));
                    break;
                case 7:
                    return;
                default:
                    continue;
            }
        }
    }
}
