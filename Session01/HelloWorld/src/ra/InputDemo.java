package ra;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        /*
            # Các bước để nhập giá trị:
            1. Khai báo và khởi tạo đối tượng Scanner (java.util.Scanner).
            2. Thông báo nhập dữ liệu (sử dụng các câu lệnh output).
            3. Lấy dữ liệu nhập từ bàn phím (các phương thức của Scanner:
            nextLine(), nextInt(),... và lưu vào biến
            - Lưu ý: khi dùng scanner để nhập vào một số thì sẽ lưu phím enter
        */
        // Khởi tạo scanner
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sv
        System.out.println("Nhập vào mã sinh viên: ");
        String studentId = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String studentName = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        int age = Integer.parseInt(scanner.nextLine());
        /*
            - Xóa phím enter:
            + C1: scanner.nextLine();
            VD: scanner.nextLine();
            + C2: coi như lấy dữ liệu là chuỗi và chuyển sang dữ liệu kiểu mong muốn
            VD:
            String --> int: Integer.parseInt(scanner.nextLine());
            String --> float: Float.parseFloat(scanner.nextLine());
        */
        System.out.println("Nhập địa chỉ sinh viên: ");
        String address = scanner.nextLine();

        // In thông tin sinh viên
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi sinh viên: " + age);
        System.out.println("Địa chỉ sinh viên: " + address);
    }
}
