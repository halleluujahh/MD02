package hw;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Categories implements IShop {
    private int id;
    private String name;
    private String description;
    private boolean status;

    public Categories() {
    }

    public Categories(int id, String name, String description, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public <Categories> void inputData(Scanner sc, List<Categories> listC) {
        int id = listC.size();
        this.id = ++id;
        this.name = inputName(sc, (List<hw.Categories>) listC);
        this.description = inputDescription(sc);
        this.status = inputStatus(sc);
    }

    public void updateData(Scanner sc, List<Categories> listC) {
        this.name = inputName(sc, (List<hw.Categories>) listC);
        this.description = inputDescription(sc);
        this.status = inputStatus(sc);
    }

    private String inputDescription(Scanner sc) {
        String description = "";
        while (true) {
            System.out.println("Hãy nhập mô tả danh mục: ");
            description = sc.nextLine();
            if (description.isEmpty()) {
                System.err.println("Không được để trống mô tả !");
            } else {
                return description;
            }
        }
    }

    private boolean inputStatus(Scanner sc) {
        String status;
        while (true) {
            System.out.println("Hãy nhập trạng thái danh mục: ");
            status = sc.nextLine();
            if (status.equals("true") || status.equals("false")) {
                return Boolean.parseBoolean(status);
            } else {
                System.err.println("Trạng thái không hợp lệ (true hoặc false) !");
            }
        }
    }


    private String inputName(Scanner sc, List<Categories> listC) {
        String name;
        boolean flag = false;
        while (true) {
            System.out.println("Hãy nhập tên của danh mục: ");
            name = sc.nextLine();
            for (Categories c : listC) {
                if (c.getName().equals(name)) {
                    System.err.println("Tên danh mục đã tồn tại !");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return name;
            }
        }
    }

    @Override
    public void displayData() {
        System.out.printf("%-20d|%-20s|%-20s|%-20s%n", this.id, this.name, this.description, this.status ? "Hoạt động" : "Không hoạt động");
    }
}
