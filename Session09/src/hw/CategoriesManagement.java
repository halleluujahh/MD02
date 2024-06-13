package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoriesManagement {
    public static void MenuCategories() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            try {
                System.out.println("********************CATEGORIES MENU********************");
                System.out.println("1. Danh sách danh mục ");
                System.out.println("2. Thêm mới danh mục");
                System.out.println("3. Cập nhật thông tin danh mục (Cập nhật theo mã)");
                System.out.println("4. Xóa danh mục (Chỉ cho phép xóa danh mục chưa có sản phẩm)");
                System.out.println("5. Thoát");
                System.out.println("Lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        printCate();
                        break;
                    case 2:
                        addCate(sc);
                        break;
                    case 3:
                        updateCate(sc);
                        break;
                    case 4:
                        deleteCate(sc);
                        break;
                    case 5:
                        return;
                    default:
                        System.err.println("Lựa chọn từ 1-5 !");
                }
            } catch (NumberFormatException e) {
                System.err.println("Lựa chọn không hợp lệ !");
            }

        }
    }

    private static void deleteCate(Scanner sc) {
        if (Menu.listC.isEmpty()) {
            System.err.println("Danh sách danh mục trống !");
            return;
        }
        System.out.println("Nhập mã danh mục: ");
        int id;
        boolean flag = false;
        try {
            id = Integer.parseInt(sc.nextLine());
            for (Categories c : Menu.listC) {
                if (c.getId() == id) {
                    flag = true;
                    for (Products p : Menu.listP) {
                        if (p.getCatalogId() == id) {
                            System.out.println("Danh mục với ID " + id + " đã có sản phẩm tồn tại !");
                            return;
                        }
                    }
                    Menu.listC.remove(c);
                    System.out.println("Xóa danh mục thành công !");
                    return;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Mã danh mục không hợp lệ !");
        }
        if (!flag) {
            System.err.println("Id danh mục không tồn tại !");
        }
    }

    private static void updateCate(Scanner sc) {
        if (Menu.listC.isEmpty()) {
            System.err.println("Danh sách danh mục trống !");
            return;
        }
        System.out.println("Nhập mã danh mục: ");
        int id;
        boolean flag = false;
        try {
            id = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < Menu.listC.size(); i++) {
                if (Menu.listC.get(i).getId() == id) {
                    Menu.listC.get(i).updateData(sc, Menu.listC);
                    System.out.println("Cập nhật danh mục thành công !");
                    flag = true;
                    return;
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Mã danh mục không hợp lệ !");
        }

        if (!flag) {
            System.err.println("Id danh mục không tồn tại !");
        }

    }

    private static void addCate(Scanner sc) {
        Categories c = new Categories();
        c.inputData(sc, Menu.listC);
        Menu.listC.add(c);
        System.out.println("Thêm danh mục thành công !");
    }

    private static void printCate() {
        if (Menu.listC.isEmpty()) {
            System.err.println("Danh sách danh mục trống !");
            return;
        }
        System.out.printf("%-20s%s%20s%n", "", "Danh sách danh mục", "");
        System.out.printf("%-20s|%-20s|%-20s|%-20s%n", "Mã", "Tên", "Mô tả", "Trạng thái");
        for (Categories c : Menu.listC) {
            c.displayData();
        }
    }
}
