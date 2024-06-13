package main;

import java.util.Scanner;

public class Array_One_Dimension {
    public static void main(String[] args) {
        /*
         *   1. Khai báo mảng số nguyên 1 chiều gồm 5 phần tử
         *   Syntax: Datatype[] arrayName = new Datatype[size]
         */
        int[] numbers = new int[5];
        /*
         *   2. Khai báo mảng tên sinh viên gồm 3 sinh viên là: Nguyễn Văn A
         * Nguyễn Văn B, Nguyễn Văn C
         *   Syntaxx: Datatype[] arrayName = {value1, ... , valueN}
         */
        String[] studentNames = {"Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"};
        /*
         *   3. Khởi tạo giá trị các phần tử mảng numbers
         *   Truy cập phần tử: arrayName[index]
         */
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        /*
         *   4. In giá trị các phần tử trong mảng studentNames
         *   length: lấy số phần tử của mảng (độ dài mảng)
         * */
        System.out.println("Giá trị các phần tử mảng:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("%s\t", studentNames[i]);
        }
        /*
         *   5. Nhập số phần tử của mảng số nguyên (n) và khai báo mảng số nguyên n phần tử
         * Nhập giá trị từ bàn phím các phần tử và in ra các phần tử chẵn
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrInt = new int[n];
        // Nhập giá trị cho các phần tử từ bàn phím
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("arrInt[%d] = ", i);
            arrInt[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Các phần tử chẵn trong mảng: ");
        for (int element : arrInt) {
            if (element % 2 == 0) {
                System.out.printf("%d\t", element);
            }
        }
    }
}
