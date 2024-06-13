package hw;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = Integer.parseInt(sc.nextLine());
        int[] oldArr = new int[n];
        for (int i = 0; i < oldArr.length; i++) {
            System.out.println("Giá trị của phần tử tại arr[" + i + "]: ");
            oldArr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < oldArr.length; i++) {
            for (int j = i + 1; j < oldArr.length; j++) {
                if (oldArr[i] < oldArr[j]) {
                    int temp = oldArr[i];
                    oldArr[i] = oldArr[j];
                    oldArr[j] = temp;
                }
            }
        }
        System.out.println("Giá trị max thứ hai trong mảng: ");
        int max = oldArr[0];
        for (int i = 0; i < oldArr.length; i++) {
            if(oldArr[i] != max){
                max = oldArr[i];
                break;
            }
        }
        System.out.println("Giá trị lớn thứ hai trong mảng: " + max);
    }
}
