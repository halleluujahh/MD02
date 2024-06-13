package main.hw;

import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            int n;
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào 1 số:");
                    n = Integer.parseInt(sc.nextLine());
                    if (n % 2 == 0) {
                        System.out.println("Đây là số lẻ");
                    } else {
                        System.out.println("Đây là số chẵn");
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào 1 số:");
                    n = Integer.parseInt(sc.nextLine());
                    if (n == 2 || n == 3) {
                        System.out.println("Đây là số nguyên tố");
                    } else if (n <= 1 || n % 2 == 0 || n % 3 == 0) {
                        System.out.println("Đây không phải số nguyên tố");
                    } else {
                        System.out.println("Đây là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào 1 số:");
                    n = Integer.parseInt(sc.nextLine());
                    if (n % 3 == 0) {
                        System.out.println("Đây là số chia hết cho 3");
                    }else{
                        System.out.println("Đây không phải số chia hết cho 3");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.err.println("Nhập từ 1-4");
            }
        }
    }
}
