package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static List<Categories> listC = new ArrayList<Categories>();
    public static List<Products> listP = new ArrayList<Products>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            try {
                System.out.println("********************SHOP MENU*********************");
                System.out.println("1. Quản lý danh mục sản phẩm");
                System.out.println("2. Quản lý sản phẩm");
                System.out.println("3. Thoát ");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        CategoriesManagement.MenuCategories();
                        break;
                    case 2:
                        ProductManagement.MenuProduct();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("choice in 1-3");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid choice !");
            }

        }
    }


}
