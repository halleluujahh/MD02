package hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = Integer.parseInt(sc.nextLine());
        int[] oldArr = new int[n];
        for (int i = 0; i < oldArr.length; i++) {
            System.out.println("Giá trị của phần tử tại oldArr[" + i + "]: ");
            oldArr[i] = Integer.parseInt(sc.nextLine());
        }
        int[] newArr = new int[oldArr.length + 1];
        int indexAdd;
        int valueIndex;
        while (true) {
            System.out.println("Nhập chỉ số cần thêm: ");
            indexAdd = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giá trị của chỉ số:");
            valueIndex = Integer.parseInt(sc.nextLine());
            if (indexAdd < 0) {
                System.out.println("Chỉ số không hợp lệ");
            } else {
                break;
            }
        }
        if (indexAdd < oldArr.length) {
            for (int i = 0; i < newArr.length; i++) {
                if (i < indexAdd) {
                    newArr[i] = oldArr[i];
                } else if (i == indexAdd) {
                    newArr[i] = valueIndex;
                } else {
                    newArr[i] = oldArr[i - 1];
                }
            }
        }else{
            newArr = new int[indexAdd+1];
            for (int i = 0; i < oldArr.length; i++) {
                if (i < indexAdd) {
                    newArr[i] = oldArr[i];
                }
            }
            newArr[indexAdd] = valueIndex;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("%d\t",newArr[i]);
        }
    }
}
