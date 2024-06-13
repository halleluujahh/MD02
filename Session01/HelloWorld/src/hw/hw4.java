package hw;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào điểm toán: ");
        int math = scanner.nextInt();
        System.out.println("Nhập vào điểm văn: ");
        int literal = scanner.nextInt();
        System.out.println("Nhập vào điểm anh: ");
        int english = scanner.nextInt();
        int result = (math + literal + english)/3;
        System.out.println("Tổng trung bình cộng: " + result);
    }
}
