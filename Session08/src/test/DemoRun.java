package test;

import java.util.Scanner;

public class DemoRun {
    public static void main(String[] args) {
        //Khởi tạo gián tiếp đối tượng Person
        Person person = new Person() {
            @Override
            public void inputData(Scanner scanner) {
                System.out.println("Đối tượng Person triển khai phương thức inputData");
            }

            @Override
            public void displayData() {
                System.out.println("Đối tượng Person triển khai phương thức displayData");

            }
        };
    }
}
