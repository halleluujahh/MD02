package hw;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị tiền USD: ");
        Double priceUSD = Double.parseDouble(scanner.nextLine());
        Double priceVND = priceUSD * 25442.06;
        System.out.printf("Giá trị tiền VNĐ: %.2f", priceVND);

    }
}
