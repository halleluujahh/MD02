package hw;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String s1 = sc.nextLine();
        System.out.println("Chuỗi đã xóa khoảng trắng ở 2 đầu: " + s1.trim());
    }
}
