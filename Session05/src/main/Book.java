package main;

import java.util.Scanner;

public class Book {
    /*
    * Xây dựng lớp Book gồm:
    * - Các thuộc tính:
    *   + Mã sách: int
    *   + Tên sách: String
    *   + Tác giả: String
    *   + giá sách: float
    *   + tiêu đề: String
    *   + Số trang: int
    *   + Nhà xuất bản: String
    *   + Trạng thái sách: boolean (true - còn sách, false - hết sách)
    * - Có 2 constructor: default và khởi tạo tất cả thông tin sách
    * - Có các phương thức getter/setter
    * - Có phương thức inputData (Scanner scanner): nhập thông tin sách
    * - Có phương thức displayData(): hiển thị thông tin sách
    * Xây dựng lớp BookManagement thực hiện:
    * - Khởi tạo đối tượng Book mà không khởi tạo bất cứ thông tin gì
    * - Hiển thị menu và hiển thị các chức năng theo menu:
    * **********************MENU*************************
    * 1. Nhập thông tin đối tượng sách
    * 2. Hiển thị thông tin sách
    * 3. Hiển thị giá sách
    * 4. Hiển thị tên tác giả
    * 5. Cập nhật số trang của sách
    * 6. Cập nhật nhà xuất bản
    * 7. Thoát
    * */
    private int bookId;
    private String bookName;
    private String author;
    private float price;
    private String title;
    private int pageQuantity;
    private String publisher;
    private boolean status;

    public Book(){

    }

    public void inputData (Scanner sc){
        System.out.println("Nhập vào mã sách: ");
        this.bookId = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào tên sách: ");
        this.bookName = sc.nextLine();
        System.out.println("Nhập vào tác giả: ");
        this.author = sc.nextLine();
        System.out.println("Nhập vào giá sách: ");
        this.price = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập vào tiêu đề: ");
        this.title = sc.nextLine();
        System.out.println("Nhập vào số trang: ");
        this.pageQuantity = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào nhà xuất bản: ");
        this.publisher = sc.nextLine();
        System.out.println("Nhập vào trạng thái: ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    public void displayData(){
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-15s %-10s %-10s\t\n", "Mã", "Tên",
                "Tác giả", "Giá", "Tiêu đề", "Tổng số trang", "Nhà xuất bản", "Trạng thái");
        System.out.printf("%-10d %-10s %-10s %-10.1f %-10s %-15d %-10s %-10b\t\n", this.bookId, this.bookName
        , this.author, this.price, this.title, this.pageQuantity, this.publisher, this.status);
    }

    public Book(int bookId, String bookName, String author, float price, String title, int pageQuantity, String publisher, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.title = title;
        this.pageQuantity = pageQuantity;
        this.publisher = publisher;
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
