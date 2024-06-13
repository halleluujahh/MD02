package hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi 1: ");
        String s1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi 2: ");
        String s2 = sc.nextLine();
        System.out.println("Chuỗi 1 có chứa chuỗi 2: " + s1.contains(s2));
    }
}
