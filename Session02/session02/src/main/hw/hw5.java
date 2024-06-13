package main.hw;

public class hw5 {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố từ 1-100: ");
        for (int i = 1; i <= 100; i++) {
            if (i == 2 || i == 3) {
                System.out.printf("%d\t", i);
            } else if (i < 1 || i % 2 == 0 || i % 3 == 0) {
                continue;
            } else{
                System.out.printf("%d\t", i);
            }
        }
    }
}
