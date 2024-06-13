package hw;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        final float pi = 3.14f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn: ");
        float radius = Float.parseFloat(scanner.nextLine());
        float perimeter = 2 * pi * radius;
        System.out.println("Chu vi hình tròn: " + perimeter);
        float area = pi * radius * radius;
        System.out.println("Diện tích hình tròn: " + area);
    }
}
