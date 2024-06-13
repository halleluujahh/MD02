package main.loops;

import java.util.Scanner;

public class While_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;
        int totalNumber = 0;
        while(number!=0){
            System.out.println("Nhập vào một số nguyên: ");
            number = Integer.parseInt(sc.nextLine());
            totalNumber += number;
        }
        System.out.println("Tổng các số vừa nhập là " + totalNumber);
    }
}
