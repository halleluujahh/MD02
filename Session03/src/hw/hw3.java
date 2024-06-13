package hw;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng 1:");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Giá trị của phần tử tại arr1[" + i + "]: ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập số phần tử của mảng 2:");
        int m = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Giá trị của phần tử tại arr2[" + i + "]: ");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        int count = 0;
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
            count++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[count]=arr2[i];
            count++;
        }
        System.out.println("Mảng sau khi đã gộp: ");
        for (int e : arr3){
            System.out.printf("%d\t",e);
        }
    }
}
