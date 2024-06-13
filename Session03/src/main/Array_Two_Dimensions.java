package main;

import java.util.Scanner;

public class Array_Two_Dimensions {
    public static void main(String[] args) {
        // Nhập số dòng row và số cột column của mảng 2 chiều
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều: ");
        int col = Integer.parseInt(scanner.nextLine());
        // Khai báo mảng 2 chiều số nguyên gồm row và column
        int[][] numbers = new int [row][col];
        float[][] arrFloat = {{5.4F,8.7F,-3.1F},{-4.2F,-3.1F,7}};
        // Nhập giá trị các phần tử mảng numbers
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("number[%d][%d]=", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        // In giá trị các phần tử trong mảng numbers
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%-5d", numbers[i][j]);
            }
            System.out.println();
        }
    }
}
