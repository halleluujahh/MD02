package hw;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột: ");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập giá trị phần tử tại arr[%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mảng hai chiều: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        int min = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng: " + min);
        System.out.println("Giá trị lớn nhất của mảng: " + max);
    }
}
