package test;

import java.util.Scanner;

//Lớp thực thi
public class Student extends Person{
    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Lớp Student triển khai phương thức inputData");
    }

    @Override
    public void displayData() {
        System.out.println("Lớp Student triển khai phương thức displayData");
    }
}
