package main.hw;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng 1 - " + n + " :" + sum);
    }
}
