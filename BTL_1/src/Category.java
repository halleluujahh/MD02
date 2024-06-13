import java.util.Scanner;
import java.util.regex.Pattern;

public class Category implements IEntity {
    final static Scanner sc = new Scanner(System.in);

    private int id;
    private String name;
    private boolean status;


    public Category() {

    }

    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + status;
    }

    @Override
    public void input() {
        this.id = inputId();
        this.name = inputName();
        this.status = inputStatus();
    }
    public void inputUpdate() {
        this.name = inputName();
        this.status = inputStatus();
    }

    private boolean inputStatus() {
        String status;
        while (true) {
            System.out.println("Nhập vào trạng thái thể loại: ");
            status = sc.nextLine();
            if (!status.equals("true") && !status.equals("false")) {
                System.err.println("Chỉ nhận true/false khi nhập status");
            } else {
                return Boolean.parseBoolean(status);
            }
        }
    }

    private String inputName() {
        String name;
        String patternName = "[\\w]{6,30}";
        while (true) {
            System.out.println("Nhập vào tên thể loại: ");
            boolean flag = false;
            name = sc.nextLine();
            if (Pattern.matches(patternName, name)) {
                for (Category c : Library.listC) {
                    if (c.getName().equals(name)) {
                        flag = true;
                    }
                }
                if (flag) {
                    System.err.println("Tên category không được trùng !");
                } else {
                    return name;
                }
            } else {
                System.err.println("Tên của category không hợp lệ !");
            }
        }
    }

    private int inputId() {
        int id = 0;
        boolean flag = false;
        while (true) {
            try {
                System.out.println("Nhập vào mã thể loại: ");
                id = Integer.parseInt(sc.nextLine());
                if (id > 0) {
                    for (Category c : Library.listC) {
                        if (c.getId() == id) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        System.err.println("Số nguyên lớn hơn 0 và duy nhất");
                    } else {
                        return id;
                    }
                } else {
                    System.err.println("Số nguyên lớn hơn 0 và duy nhất");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng ID của Category !");
            }
        }
    }

    @Override
    public void output() {
        System.out.printf("%-15d|%-15s|%-15s%n", this.id, this.name, this.status ? "Hoạt động" : "Không hoạt động");
    }
}
