import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex4.Group;
import ex4.HouseHold;
import ex4.Person;

public class Ex4Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Group group = new Group();
        while(true){
            System.out.println("Enter 1: Add more family");
            System.out.println("Enter 2: Show Information");
            System.out.println("Enter 3: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch(option){
                case 1:
                    System.out.println("Enter the number of families:");
                    int numberOfFamilies = Integer.parseInt(scanner.nextLine());
                    while(numberOfFamilies > 0){
                        System.out.println("Address: ");
                        String address = scanner.nextLine();
                        List<Person> persons = new ArrayList<>();
                        System.out.println("Number of family members: ");
                        int number = Integer.parseInt(scanner.nextLine());
                        while(number > 0){
                            System.out.println("Enter family member: ");
                            System.out.println("Name");
                            String name = scanner.nextLine();
                            System.out.println("Age: ");
                            int age = Integer.parseInt(scanner.nextLine());
                            System.out.println("Job:");
                            String job = scanner.nextLine();
                            System.out.println("ID: ");
                            String id = scanner.nextLine();
                            persons.add(new Person(name, age, job, id));
                            number--;
                        }
                        group.addNewHouseHold(new HouseHold(address, persons.size(), persons));
                        numberOfFamilies--;
                    }
                    break;
                case 2:
                    group.showInfoHouseHold();
                    break;
                case 3:
                    return;
                default: continue;
            }
        }
    }
}
