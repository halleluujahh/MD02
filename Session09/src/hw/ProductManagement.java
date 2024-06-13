package hw;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManagement {
    public static void MenuProduct() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            try {
                System.out.println("********************PRODUCT MENU********************");
                System.out.println("1. Danh sách sản phẩm");
                System.out.println("2. Thêm mới sản phẩm (Khi thêm mới cho phép chọn danh mục) ");
                System.out.println("3. Cập nhật thông tin sản phẩm (Cập nhật theo mã) ");
                System.out.println("4. Xóa sản phẩm");
                System.out.println("5. Sắp xếp sản phẩm theo giá bán tăng dần");
                System.out.println("6. Sắp xếp sản phẩm theo giá nhập giảm dần ");
                System.out.println("7. Tìm kiếm sản phẩm theo tên sản phẩm");
                System.out.println("8. Thoát ");
                System.out.println("Lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        printProducts();
                        break;
                    case 2:
                        addProduct(sc);
                        break;
                    case 3:
                        updateProduct(sc);
                        break;
                    case 4:
                        deleteProduct(sc);
                        break;
                    case 5:
                        sortProductExPriceAsc();
                        break;
                    case 6:
                        sortProductImPriceDesc();
                        break;
                    case 7:
                        findProductByName(sc);
                        break;
                    case 8:
                        return;
                    default:
                        System.err.println("Lựa chọn trong khoảng 1-8");
                }
            } catch (NumberFormatException e) {
                System.err.println("Lựa chọn không hợp lệ !");
            }

        }
    }

    private static void findProductByName(Scanner sc) {
        if (Menu.listP.isEmpty()) {
            System.err.println("Không có sản phẩm nào tồn tại !");
            return;
        }
        System.out.println("Nhập vào tên sản phẩm muốn tìm kiếm: ");
        boolean flag = false;
        int count = 0;
        String name = sc.nextLine();
        for (Products p : Menu.listP) {
            if (p.getName().contains(name)) {
                p.displayData();
                count++;
                flag = true;
            }
        }
        System.out.println("Đã tìm thấy " + count + " sản phẩm");
        if (!flag) {
            System.err.println("Không tìm thấy sản phẩm !");
        }
    }

    private static void sortProductImPriceDesc() {
        if (Menu.listP.isEmpty()) {
            System.err.println("Không có sản phẩm nào tồn tại !");
            return;
        }
        Collections.sort(Menu.listP, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                return o1.getImportPrice() > o2.getImportPrice() ? -1 : 1;
            }
        });
        System.out.println("Đã sắp xếp sản phẩm theo giá nhập giảm dần !");
    }

    private static void sortProductExPriceAsc() {
        if (Menu.listP.isEmpty()) {
            System.err.println("Không có sản phẩm nào tồn tại !");
            return;
        }
        Collections.sort(Menu.listP, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                return o1.getExportPrice() > o2.getExportPrice() ? 1 : -1;
            }
        });
        System.out.println("Đã sắp xếp sản phẩm theo giá bán tăng dần !");
    }

    private static void updateProduct(Scanner sc) {
        if (Menu.listP.isEmpty()) {
            System.err.println("Không có sản phẩm nào tồn tại !");
            return;
        }
        System.out.println("Nhập mã sản phẩm để cập nhật: ");
        String id = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < Menu.listP.size(); i++) {
            if (Menu.listP.get(i).getId().equals(id)) {
                Menu.listP.get(i).updateData(sc, Menu.listP);
                System.out.println("Cập nhật thành công !");
                flag = true;
                return;
            }
        }
        if (!flag) {
            System.err.println("Không tìm thấy mã sản phẩm để cập nhật !");
        }
    }

    private static void deleteProduct(Scanner sc) {
        if (Menu.listP.isEmpty()) {
            System.err.println("Không có sản phẩm nào tồn tại !");
            return;
        }
        System.out.println("Nhập mã sản phẩm để xóa: ");
        String id = sc.nextLine();
        boolean flag = false;
        for (Products p : Menu.listP) {
            if (p.getId().equals(id)) {
                Menu.listP.remove(p);
                System.out.println("Xóa thành công !");
                flag = true;
                return;
            }
        }
        if (!flag) {
            System.err.println("Không tìm thấy mã sản phẩm để xóa !");
        }
    }

    private static void addProduct(Scanner sc) {
        Products p = new Products();
        p.inputData(sc, Menu.listP);
        Menu.listP.add(p);
        System.out.println("Thêm sản phẩm thành công !");
    }

    private static void printProducts() {
        if (Menu.listP.isEmpty()) {
            System.err.println("Không có sản phẩm nào tồn tại !");
            return;
        }
        System.out.printf("%-40s%s%40s%n", "", "Danh sách sản phẩm", "");
        System.out.printf("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s%n",
                "Mã", "Tên", "Danh mục", "Giá nhập", "Giá bán", "Trạng thái");
        for (Products p : Menu.listP) {
            p.displayData();
        }
    }
}
