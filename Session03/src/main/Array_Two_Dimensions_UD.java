package main;

import java.util.Scanner;

public class Array_Two_Dimensions_UD {
    public static void main(String[] args) {
        /*
         *   1. Nhập số dòng và số cột mảng 2 chiều số nguyên và khởi tạo mảng 2 chiều
         *   2. In menu và thực hiện các chức năng theo menu
         *   *********************MENU**********************
         *   1. Nhập giá trị các phần tử
         *   2. In giá trị các phần tử theo ma trận
         *   3. In giá trị các phần tử nằm trên đường biên của ma trận
         *   4. Tính tổng các phần tử chia hết cho 3 trong mảng
         *   5. In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng
         *   6. Sắp xếp các dòng giảm dần
         *   7. Thoát
         *   Lựa chọn của bạn
         * */
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Nhập vào số dòng:");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        while (true) {
            System.out.println("*********************MENU**********************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. In giá trị các phần tử theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên đường biên của ma trận");
            System.out.println("4. Tính tổng các phần tử chia hết cho 3 trong mảng");
            System.out.println("5. In ra các phần tử trên đường chéo chính và chéo phụ của mảng và tính tổng");
            System.out.println("6. Sắp xếp các dòng giảm dần");
            System.out.println("7. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("Giá trị của mảng[%d][%d]: ", i, j);
                            arr[i][j] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mảng 2 chiều: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%-5d", arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                                System.out.printf("%-5d", arr[i][j]);
                            } else {
                                System.out.printf("%-5s", " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (arr[i][j] % 3 == 0) {
                                sum += arr[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử chia hết cho 3 trong mảng: " + sum);
                    break;
                case 5:
                    int sum1 = 0;
                    if (col == row) {
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i == j) {
                                    sum1 += arr[i][j];
                                    System.out.printf("%-5d", arr[i][j]);
                                } else if (j == col - 1 - i) {
                                    System.out.printf("%-5d", arr[i][col - 1 - i]);
                                } else {
                                    System.out.printf("%-5s", " ");
                                }
                            }
                            System.out.println();
                        }
                        System.out.printf("Tổng các phần tử trên đường chéo chính và chéo phụ của mảng %d\t\n", sum1);
                    } else {
                        System.out.println("Đây không phải ma trận vuông");
                    }
                    break;
                case 6:
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            for (int l = j + 1; l < col; l++) {
                                if (arr[i][j] > arr[i][l]) {
                                    int temp = arr[i][j];
                                    arr[i][j] = arr[i][l];
                                    arr[i][l] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Mảng 2 chiều sau khi sắp xếp: ");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%-5d", arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Nhập từ 1-7");
            }
        }
    }
}
