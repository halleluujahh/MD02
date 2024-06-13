package main.decisionMaking;

import java.util.Scanner;

public class If_ElseIf_Else_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(sc.nextLine());
        if (number <10) {
            System.out.printf("%d là số nhỏ hơn 10\n", number);
        }else if(number <20){
            System.out.printf("%d là số nhỏ hơn 20\n", number);
        }else{
            System.out.printf("%d là số lớn hơn hoặc bằng 20\n", number);
        }
    }
}
