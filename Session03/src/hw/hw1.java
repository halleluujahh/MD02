package hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = Integer.parseInt(sc.nextLine());
        int[] oldArr = new int[n];
        for (int i = 0; i < oldArr.length; i++) {
            System.out.println("Giá trị của phần tử tại oldArr[" + i + "]: ");
            oldArr[i] = Integer.parseInt(sc.nextLine());
        }
        int[] newArr = new int[oldArr.length - 1];
        int indexDelete;
        do {
            System.out.println("Nhập chỉ số cần xóa: ");
            indexDelete = Integer.parseInt(sc.nextLine());
            if (indexDelete < 0 || indexDelete >= oldArr.length) {
                System.out.println("Không tồn tại chỉ số");
            } else {
                break;
            }
        }
        while (true);
        for (int i = 0; i < newArr.length; i++) {
            if (i >= indexDelete) {
                newArr[i] = oldArr[i + 1];
            } else if (i < indexDelete) {
                newArr[i] = oldArr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("%d\t", newArr[i]);
        }
    }
}
