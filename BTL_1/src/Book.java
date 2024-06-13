import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Book implements IEntity {
    final static Scanner sc = new Scanner(System.in);

    private String id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String description;
    private int categoryId;

    public Book() {

    }

    public Book(String id, String title, String author, String publisher, int year, String description, int categoryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.description = description;
        this.categoryId = categoryId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return id + "," + title + "," + author +
                "," + publisher + "," + year +
                "," + description +
                "," + categoryId;
    }

    @Override
    public void input() {
        this.id = inputId();
        this.title = inputTitle();
        this.author = inputAuthor();
        this.publisher = inputPuslisher();
        this.year = inputYear();
        this.description = inputDescription();
        this.categoryId = inputCategoryId();
    }
    public void inputUpdate() {
        this.title = inputTitle();
        this.author = inputAuthor();
        this.publisher = inputPuslisher();
        this.year = inputYear();
        this.description = inputDescription();
        this.categoryId = inputCategoryId();
    }

    private int inputCategoryId() {
        int cateId;
        boolean flag = false;
        while (true) {
            System.out.println("Nhập vào category ID: ");
            cateId = Integer.parseInt(sc.nextLine());
            for (Category c : Library.listC) {
                if (c.getId() == cateId) {
                    return cateId;
                }
            }
            if (!flag) {
                System.err.println("Không có category ID tồn tại");
            }
        }

    }

    private String inputDescription() {
        String description;
        while (true) {
            System.out.println("Nhập vào mô tả: ");
            description = sc.nextLine();
            if (description.isEmpty() || description == null) {
                System.err.println("Không được bỏ trống");
            } else {
                return description;
            }
        }
    }

    private int inputYear() {
        int year = 0;
        while (true) {
            try {
                System.out.println("Nhập vào năm xuất bản: ");
                year = Integer.parseInt(sc.nextLine());
                int yearNow = LocalDate.now().getYear();
                if (year < 1970 || year > yearNow) {
                    System.err.println("Tổi thiểu từ năm 1970 và không lớn hơn năm hiện tại");
                    Thread.sleep(3);
                } else {
                    return year;
                }
            } catch (NumberFormatException | InterruptedException e){
                System.err.println("Năm phải là số");
            }
        }
    }

    private String inputPuslisher() {
        String publisher;
        while (true) {
            System.out.println("Nhập vào nhà xuất bản: ");
            publisher = sc.nextLine();
            if (publisher.isEmpty() || publisher == null) {
                System.err.println("Không được bỏ trống");
            } else {
                return publisher;
            }
        }
    }

    private String inputAuthor() {
        String author;
        while (true) {
            System.out.println("Nhập vào tên tác giả: ");
            author = sc.nextLine();
            if (author.isEmpty() || author == null) {
                System.err.println("Không được bỏ trống");
            } else {
                return author;
            }
        }
    }

    private String inputTitle() {
        String title;
        String pattern = "[\\w]{6,50}";
        while (true) {
            boolean flag = false;
            System.out.println("Nhập vào tiêu đề sách: ");
            title = sc.nextLine();
            if (Pattern.matches(pattern, title)) {
                for (Book b : Library.listB) {
                    if (b.getTitle().equals(title)) {
                        flag = true;
                    }
                }
                if (flag) {
                    System.err.println("Không được trùng");
                } else {
                    return title;
                }
            } else {
                System.err.println("Từ 6-50 ký tự");
            }
        }
    }

    public String inputId() {
        String id;
        String idPattern = "[B\\w]{4}";
        while (true) {
            boolean flag = false;
            System.out.println("Nhập vào mã sách: ");
            id = sc.nextLine();
            if (Pattern.matches(idPattern, id)) {
                for (Book b : Library.listB) {
                    if (b.getId().equals(id)) {
                        flag = true;
                    }
                }
                if (flag) {
                    System.err.println("Không được trùng");
                } else {
                    return id;
                }
            } else {
                System.err.println("Bắt đầu bằng B, 4 ký tự");
            }
        }
    }

    @Override
    public void output() {
        System.out.printf("%-20s|%-20s|%-20s|%-20s|%-20d|%-20s|%-20d%n", this.id
                , this.title, this.author, this.publisher, this.year, this.description, this.categoryId);
    }
}
