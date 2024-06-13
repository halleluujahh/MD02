package main;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        // Syntax: ClassName objectName = new Constructor()
        // 1. Khởi tạo đối tượng sinh viên mà không khởi tạo bất cứ thông tin nào
        Student s1 = new Student();
        // 2. Khởi tạo đối tượng sinh viên với mã sinh viên và tên sinh viên
        Student s2 = new Student("SV002", "Nguyễn Văn A");
        // 3. Khởi tạo đối tượng với đầy đủ thông tin sinh viên
        Student s3 = new Student("SV003", "Nguyễn Văn B", 22, true, "Hà Nội", true);
        // 4. Khởi tạo đối tượng sinh viên với mã sinh viên, tên, tuổi
        Student s4 = new Student("SV004", "Nguyễn Văn C", 30);
        System.out.println("Thông tin sinh viên 1: ");
        s1.displayData();
        System.out.println("Thông tin sinh viên 2: ");
        s2.displayData();
        System.out.println("Thông tin sinh viên 3: ");
        s3.displayData();
        // 5. Nhập toàn bộ thông tin cho sinh viên 1
        System.out.println("Nhập thông tin sinh viên 1: ");
        Scanner scanner = new Scanner(System.in);
        s1.inputData(scanner);
        // 6. Sử dụng phương thức set nhập thông tin sinh viên 2: tuổi, giới tính, địa chỉ, trạng thái
        System.out.println("Nhập thông tin sinh viên 2: ");
        System.out.println("Nhập tuổi sinh viên: ");
        s2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập giới tính sinh viên: ");
        s2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập địa chỉ sinh viên: ");
        s2.setAddress(scanner.nextLine());
        System.out.println("Nhập trạng thái sinh viên: ");
        s2.setStatus(Boolean.parseBoolean(scanner.nextLine()));
        // 7. In ra tổng tuổi của sinh viên 1, 2, 3
        int sumAge = s1.getAge() + s2.getAge() + s3.getAge();
        System.out.println("Tổng tuổi của 3 sinh viên: " + sumAge);
        // 8. Cho sinh viên 3 chào
        s3.hello();
    }

}
