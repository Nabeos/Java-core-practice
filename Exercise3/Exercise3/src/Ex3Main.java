import java.util.Scanner;

import ex3.Candidate;
import ex3.CandidateA;
import ex3.CandidateB;
import ex3.CandidateC;
import ex3.CandidateManagement;

public class Ex3Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CandidateManagement management = new CandidateManagement();
        Candidate candidate = null;
        while (true) {
            System.out.println("Enter 1: Add new Candidate");
            System.out.println("Enter 2: Show info of candidates");
            System.out.println("Enter 3: Search by candidate id");
            System.out.println("Enter 4: Out");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Id: ");
                    String id = scanner.nextLine();
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Address: ");
                    String address = scanner.nextLine();
                    System.out.println("Priority level: ");
                    int level = Integer.parseInt(scanner.nextLine());
                    while (true) {
                    System.out.println("Choose your block: ");
                    System.out.println("Enter 1: A (Toan, Ly, Hoa)");
                    System.out.println("Enter 2: B (Toan, Hoa, Sinh)");
                    System.out.println("Enter 3: C (Van, Su, Dia)");
                    int opt = Integer.parseInt(scanner.nextLine());
                        switch (opt) {
                            case 1:
                                candidate = new CandidateA(id, name, address, level);
                                break;
                            case 2:
                                candidate = new CandidateB(id, name, address, level);
                                break;
                            case 3:
                                candidate = new CandidateC(id, name, address, level);
                                break;
                            default:
                                System.out.println("error");
                                continue;
                        }
                        break;
                    }
                    management.addNewCandidate(candidate);
                    System.out.println(candidate);
                    break;
                case 2:
                    System.out.println("Candidate Information: ");
                    management.show();
                    break;
                case 3:
                    System.out.println("Candidate Id: ");
                    String candId = scanner.nextLine();
                    management.searchByCandidateNumber(candId);
                    break;
                case 4:
                    return;
                default:
                    continue;
            }
        }
    }
}
