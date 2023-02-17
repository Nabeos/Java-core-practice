import java.util.Scanner;

import ex1.CanBo;
import ex1.CongNhan;
import ex1.KySu;
import ex1.NhanVien;
import ex1.QLCB;
import utils.Validation;

public class Ex1Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            QLCB qlcb = new QLCB();
            CanBo canBo = null;
            int level;
            String task, specialized;
            while (true) {
                System.out.println("Application Manager Officer");
                System.out.println("Enter 1: To insert officer");
                System.out.println("Enter 2: To search officer by name: ");
                System.out.println("Enter 3: To show information officers");
                System.out.println("Enter 4: To exit:");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        System.out.println("Them moi can bo:");
                        System.out.println("Ho ten: ");
                        String name = scanner.nextLine();
                        System.out.println("Tuoi:");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.println("Gioi tinh (nam, nu, khac):");
                        String gender = scanner.nextLine();
                        System.out.println("Dia chi: ");
                        String address = scanner.nextLine();
                        System.out.println("1: Cong nhan");
                        System.out.println("2: Nhan vien");
                        System.out.println("3: Ky su");
                        int option2 = Integer.parseInt(scanner.nextLine());
                        switch (option2) {
                            case 1:
                                System.out.println("Cap bac: ");
                                level = scanner.nextInt();
                                canBo = new CongNhan(name, age, gender, address, level);
                                break;
                            case 2:
                                System.out.println("Cong viec: ");
                                task = scanner.nextLine();
                                canBo = new NhanVien(name, age, gender, address, task);
                                break;
                            case 3:
                                System.out.println("Nganh lam viec:");
                                specialized = scanner.nextLine();
                                canBo = new KySu(name, age, gender, address, specialized);
                                break;
                            case 4:
                                System.out.println("invalid");
                                break;
                        }
                        qlcb.themMoiCanBo(canBo);
                        System.out.println(canBo.toString());
                        break;
                    case 2:
                        System.out.println("Insert name: ");
                        String searchName = scanner.nextLine();
                        qlcb.timKiemTheoHoTen(searchName).forEach(o -> System.out.println(o.toString()));
                        break;
                    case 3:
                        qlcb.hienThiThongTinDanhSachCanBo();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Error");
                        continue;
                }
            }
        }
    }
}
