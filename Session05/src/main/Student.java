package main;

import java.util.Scanner;

public class Student {
    /*
    * 1. Có các đặc điểm
    * 2. Có hàm khởi tạo constructor
    * 3. Có các phương thức
    * */
    // 1. Fields/Properties/Attribute: thuộc tính lớp mô tả các đặc điểm của đối tượng trong thế giới thực
    // Syntax: Access Modifier (private) + datatype + attributeName;
    private String studentId; // ---> tính đóng gói
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private boolean status;
    // 2. Constructor: Hàm khởi tạo dùng để khởi tạo đối tượng
    // Syntax: Access Modifier (public) + ClassName(parameters)
    // Parameter Syntax: Datatype paramName
    // Default: không có tham số - không khởi tạo bất cứ thông gì của sinh viên

    public Student() {

    }

    // Constructor khởi tạo sinh viên với mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName, int age, boolean sex, String address, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.status = status;
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }


    // 3. Method: mô tả hành vi của đối tượng trong thế giới thực
    // Syntax: Access Modifier + Return Data + methodName(parameters)

    public String getStudentId() {
        // Cài đặt điều kiện để lấy mã sinh viên
        // ---> tính đóng gói
        return studentId;
    }

    public void setStudentId(String studentId) {
        // cài đặt điều kiện để gán giá trị cho thuộc tính mã sinh viên
        // ---> tính đóng gói
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // 3.2 Methods: mô tả hành vi
    public int addTwoNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public void hello(){
        System.out.println("Xin chào");
    }

    public void inputData(Scanner scanner){
        System.out.println("Nhập mã sinh viên: ");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên: ");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên: ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        this.address = scanner.nextLine();
        System.out.println("Nhập vào trạng thái sinh viên: ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    public  void displayData(){
        System.out.printf("Mã sinh viên %s - Tên SV: %s - Tuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính %b - Địa chỉ: %s - Trạng thái: %b\n", this.sex, this.address, this.status);
    }
}
