package main;

import java.util.Scanner;

public class Array_One_Dimension_UD {
    public static void main(String[] args) {
        /*
         *   Nhập số phần tử (n) của mảng và khai báo mảng số nguyên gồm n phần tử
         *   In menu và thực hiện các chức năng ở menu
         *   *****************MENU********************
         *   1. Nhập các giá trị của phần tử
         *   2. In giá trị các phần tử
         *   3. Tính tổng các phần tử
         *   4. In ra các phần tử có giá trị lẻ trong mảng
         *   5. In các phần ử có chỉ số chẵn trong mảng
         *   6. Sắp xếp mảng tăng dần
         *   7. Thoát
         *   Lựa chọn của bạn:
         * */
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Nhập độ dài của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        while (true) {
            System.out.println("*****************MENU********************");
            System.out.println("1. Nhập các giá trị của phần tử");
            System.out.println("2. In giá trị các phần tử");
            System.out.println("3. Tính tổng các phần tử");
            System.out.println("4. In ra các phần tử có giá trị lẻ trong mảng");
            System.out.println("5. In các phần tử có chỉ số chẵn trong mảng");
            System.out.println("6. Sắp xếp mảng tăng dần");
            System.out.println("7. Thoát");

            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        System.out.printf("Giá trị arr[%d]: ", i);
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử trong mảng: ");
                    for (int value : arr) {
                        System.out.printf("%d\t", value);
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    for (int k : arr) {
                        sum += k;
                    }
                    System.out.println("Tổng các phần tử trong mảng: " + sum);
                    break;
                case 4:
                    System.out.println("Các phần tử có giá trị lẻ: ");
                    for (int k : arr) {
                        if (k % 2 == 1) {
                            System.out.printf("%d \t", k);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Các phần tử có chỉ số chẵn trong mảng: ");
                    for (int i = 0; i < arr.length; i++) {
                        if (i % 2 == 0) {
                            System.out.printf("%d \t", arr[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = i+1; j < arr.length; j++) {
                            if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    System.out.println("Các phần tử trong mảng tăng dần: ");
                    for (int j : arr) {
                        System.out.printf("%d\t", j);
                    }
                    System.out.println();
                    break;
                case 7:
                    return;
            }
        }
    }
}
