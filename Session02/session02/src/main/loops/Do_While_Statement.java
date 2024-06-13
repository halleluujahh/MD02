package main.loops;

import java.util.Scanner;

public class Do_While_Statement {
    public static void main(String[] args) {
        /*
        *    While và Do While dùng khi không biết trước số lần lặp, thực hiện ít nhất 1 lần
        *    In menu sau và thực hiện các chức năng menu
        *    1. Phở Kobe
        *    2. Phở Việt Nam
        *    3. Xôi trứng thịt
        *    4. Bánh mì pate
        *    5. Mỳ tôm không người lái
        *    6. Thoát
        *    Lựa chọn của bạn:
        */
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("*************BreakFast-Menu*************");
            System.out.println("1. Phở bò kobe");
            System.out.println("2. Phở gà Việt Nam");
            System.out.println("3. Xôi trứng thịt");
            System.out.println("4. Bánh mỳ pate");
            System.out.println("5. Mỳ tôm không người lái");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn phở bò kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn phở gà Việt Nam");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn xôi trứng thịt");
                    break;
                case 4:
                    System.out.println("Bạn vừa chọn bánh mỳ pate");
                    break;
                case 5:
                    System.out.println("Bạn vừa chọn mỳ tôm không người lái");
                    break;
                case 6:
                    return; // hoặc System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-6 ");
            }
        }while (true);
    }
}
