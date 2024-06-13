package test;

import java.util.Scanner;

public class Teacher extends Person {
    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Lớp Teacher triển khai phương thức inputData");
    }

    @Override
    public void displayData() {
        System.out.println("Lớp Teacher triển khai phương thức displayData");
    }
}
