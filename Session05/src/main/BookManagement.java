package main;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        int choice;
        while(true){
            System.out.println("**********************MENU*************************");
            System.out.println("1. Nhập thông tin đối tượng sách");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. Hiển thị giá sách");
            System.out.println("4. Hiển thị tên tác giả");
            System.out.println("5. Cập nhật số trang của sách");
            System.out.println("6. Cập nhật nhà xuất bản");
            System.out.println("7. Thoát");
            System.out.println("Lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    b.inputData(sc);
                    break;
                case 2:
                    System.out.println("Thông tin sách: ");
                    b.displayData();
                    break;
                case 3:
                    System.out.println("Giá sách: " +  b.getPrice());
                    break;
                case 4:
                    System.out.println("Tên tác giả: " +  b.getAuthor());
                    break;
                case 5:
                    System.out.println("Cập nhật số trang: ");
                    b.setPageQuantity(Integer.parseInt(sc.nextLine()));
                    break;
                case 6:
                    System.out.println("Cập nhật số trang: ");
                    b.setPublisher(sc.nextLine());
                    break;
                case 7:
                    return;
                default:
                    System.err.println("Nhập từ 1-7");
            }
        }
    }
}
