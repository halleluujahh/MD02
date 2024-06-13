package hw;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của cạnh: ");
        Float edge = Float.parseFloat(scanner.nextLine());
        Float perimeter = edge * 4;
        System.out.println("Chu vi của hình vuông: " + perimeter);
        Double area = Math.pow(edge,2);
        System.out.println("Diện tích của hình vuông: " + area);
    }
}
