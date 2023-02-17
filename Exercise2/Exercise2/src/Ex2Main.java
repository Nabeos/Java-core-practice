import java.util.Scanner;

import ex2.Book;
import ex2.BookManagement;
import ex2.Document;
import ex2.Magazine;
import ex2.Newspaper;

public class Ex2Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BookManagement bookManagement = new BookManagement();
        while (true) {
            System.out.println("Chọn 1: Thêm mới tài liêu: Sách, tạp chí, báo.");
            System.out.println("Chọn 2: Xoá tài liệu theo mã tài liệu.");
            System.out.println("Chọn 3: Hiện thị thông tin về tài liệu.");
            System.out.println("Chọn 4: Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
            System.out.println("Chọn 5: Thoát khỏi chương trình.");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Chọn 1: Thêm mới: Báo");
                    System.out.println("Chọn 2: Thêm mới: Tạp chí");
                    System.out.println("Chọn 3: Thêm mới: Sách");
                    int option2 = Integer.parseInt(scanner.nextLine());
                    switch (option2) {
                        case 1: {
                            System.out.println("Mã tài liệu (ID):");
                            String id = scanner.nextLine();
                            System.out.println("Tên nhà xuất bản: ");
                            String publisher = scanner.nextLine();
                            System.out.println("Số bản phát hành: ");
                            int number = Integer.parseInt(scanner.nextLine());
                            System.out.println("Ngày phát hành");
                            int releaseDay = Integer.parseInt(scanner.nextLine());
                            Document doc = new Newspaper(id, publisher, number, releaseDay);
                            bookManagement.addNewDocument(doc);
                            System.out.println(doc);
                            break;
                        }
                        case 2: {
                            System.out.println("Mã tài liệu (ID):");
                            String id = scanner.nextLine();
                            System.out.println("Tên nhà xuất bản: ");
                            String publisher = scanner.nextLine();
                            System.out.println("Số bản phát hành: ");
                            int number = Integer.parseInt(scanner.nextLine());
                            System.out.println("Số phát hành:");
                            String releaseNumber = scanner.nextLine();
                            System.out.println("Tháng phát hành:");
                            int releaseMonth = Integer.parseInt(scanner.nextLine());
                            Document doc = new Magazine(id, publisher, number, releaseNumber, releaseMonth);
                            bookManagement.addNewDocument(doc);
                            System.out.println(doc);
                            break;
                        }
                        case 3: {
                            System.out.println("Mã tài liệu (ID):");
                            String id = scanner.nextLine();
                            System.out.println("Tên nhà xuất bản: ");
                            String publisher = scanner.nextLine();
                            System.out.println("Số bản phát hành: ");
                            int number = Integer.parseInt(scanner.nextLine());
                            System.out.println("Tên tác giả:");
                            String authorName = scanner.nextLine();
                            System.out.println("Tổng số trang:");
                            int totalPages = Integer.parseInt(scanner.nextLine());
                            Document doc = new Book(id, publisher, number, authorName, totalPages);
                            bookManagement.addNewDocument(doc);
                            System.out.println(doc);
                            break;
                        }
                        default:
                            System.out.println("Error");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Điền mã tài liệu muốn xóa:");
                    String id = scanner.nextLine();
                    boolean check = bookManagement.deleteDocumentById(id);
                    if (check) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Bị lỗi");
                    }
                    break;
                case 3:
                    bookManagement.showDocumentsInfo();
                    break;
                case 4:
                    System.out.println("Loại tài liệu muốn tìm:");
                    System.out.println("Chọn 1: Báo");
                    System.out.println("Chọn 2: Tạp chí");
                    System.out.println("Chọn 3: Sách");
                    int option3 = Integer.parseInt(scanner.nextLine());
                    if (option3 == 1) {
                        bookManagement.searchDocByNewsType().forEach(o->System.out.println(o.toString()));
                    } else if (option3 == 2) {
                        bookManagement.searchDocByMagazineType().forEach(o->System.out.println(o.toString()));
                    } else if (option3 == 3)
                        bookManagement.searchDocByBookType().forEach(o->System.out.println(o.toString()));
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Error");
                    continue;
            }
        }
    }
}
