package main.hw;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Số này chia hết cho 3 và 5");
        } else{
            System.out.println("Số này không chia hết cho 3 và 5");
        }
    }
}
