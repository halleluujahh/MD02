package hw;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Products implements IShop {
    private String id;
    private String name;
    private int catalogId;
    private float importPrice;
    private float exportPrice;
    private String description;
    private boolean status;

    public Products() {
    }

    public Products(String id, String name, int catalogId, float importPrice, float exportPrice, String description, boolean status) {
        this.id = id;
        this.name = name;
        this.catalogId = catalogId;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.description = description;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
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
    public <Products> void inputData(Scanner sc, List<Products> listP) {
        this.catalogId = inputCatalogId(sc, Menu.listC);
        this.id = inputId(sc, (List<hw.Products>) listP);
        this.name = inputName(sc, (List<hw.Products>) listP);
        this.importPrice = inputPrice(sc);
        this.exportPrice = importPrice * RATE;
        this.status = inputStatus(sc);
    }

    public <Products> void updateData(Scanner sc, List<Products> listP) {
        this.catalogId = inputCatalogId(sc, Menu.listC);
        this.name = inputName(sc, (List<hw.Products>) listP);
        this.importPrice = inputPrice(sc);
        this.exportPrice = importPrice * RATE;
        this.status = inputStatus(sc);
    }

    private boolean inputStatus(Scanner sc) {
        String status;
        while (true) {
            System.out.println("Hãy nhập trạng thái của sản phẩm: ");
            status = sc.nextLine();
            if (status.equals("true") || status.equals("false")) {
                return Boolean.parseBoolean(status);
            } else {
                System.err.println("Trạng thái không hợp lệ (true hoặc false) !");
            }
        }
    }

    private float inputPrice(Scanner sc) {
        float price = 0;
        while (true) {
            try {
                System.out.println("Hãy nhập giá nhập của sản phẩm: ");
                price = Float.parseFloat(sc.nextLine());
                return price;
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập giá hợp lệ !");
            }
        }
    }

    private int inputCatalogId(Scanner sc, List<Categories> listC) {
        if(listC.isEmpty()){
            System.err.println("Danh sách danh mục đang trống !");
            System.err.println("Xin hãy thêm danh mục trước !");
            Categories c = new Categories();
            c.inputData(sc, listC);
            listC.add(c);
        }
        int catalogId;
        while (true) {
            try {
                for (Categories c : listC){
                    System.out.printf("%-20s%s%20s%n", "", "Danh sách danh mục", "");
                    System.out.printf("%-20s|%-20s|%-20s|%-20s%n", "Mã", "Tên", "Mô tả", "Trạng thái");
                    c.displayData();
                }
                System.out.println("Hãy nhập mã danh mục của sản phẩm: ");
                catalogId = Integer.parseInt(sc.nextLine());

                for (Categories c : listC) {
                    if (c.getId() == catalogId) {
                        return catalogId;
                    }
                }
                System.err.println("Mã danh mục không tồn tại !");
            } catch (NumberFormatException e) {
                System.err.println("Mã danh mục không hợp lệ");
            }
        }
    }

    private String inputName(Scanner sc, List<Products> listP) {
        String name;
        boolean flag = false;
        while (true) {
            System.out.println("Hãy nhập tên của sản phẩm: ");
            name = sc.nextLine();
            for (Products p : listP) {
                if (p.getName().equals(name)) {
                    System.err.println("Tên sản phẩm đã tồn tại !");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return name;
            }
        }
    }

    private String inputId(Scanner sc, List<Products> listP) {
        String id;
        String idRegex = "^[P\\w]{4}+$";
        while (true) {
            boolean flag = false;
            System.out.println("Hãy nhập Mã của sản phẩm (4 ký tự, bắt đầu bằng chữ P): ");
            id = sc.nextLine();
            if (Pattern.matches(idRegex, id)) {
                for (Products p : listP) {
                    if (p.getId().equals(id)) {
                        System.err.println("Mã của sản phẩm đã tồn tại !");
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    return id;
                }
            } else {
                System.err.println("Xin hãy nhập mã của sản phẩm đúng định dạng !");
            }
        }
    }

    @Override
    public void displayData() {
        System.out.printf("%-20s|%-20s|%-20d|%-20.2f|%-20.2f|%-20s%n", this.id, this.name, this.catalogId, this.importPrice, this.exportPrice, this.status ? "Hoạt động" : "Không hoạt động");
    }
}
