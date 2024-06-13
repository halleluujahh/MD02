package main;

public class StringBuilder_Demo {
    static int n= 4;
    public static void main(String[] args) {
        // 1. Khởi tạo chuỗi StringBuilder
        StringBuilder strBuilder = new StringBuilder("string");
        // 2. append(String str): nối 2 chuỗi
        System.out.println("Nối chuỗi: " + strBuilder.append(" - builder"));
        // 3. insert(int offset, String str): chèn chuỗi str vào từ vị trí offset
        System.out.println("Chèn chuỗi: " + strBuilder.insert(0,"Day la "));
        // 4. delete(int startIndex, int endIndex): xóa từ startIndex đến endIndex-1
        System.out.println("Xóa ký tự: "+ strBuilder.delete(0,6));
        // 5. reverse: đảo ngược chuỗi
        System.out.println("Đảo ngược chuỗi: " + strBuilder.reverse());

        n = 3;
        System.out.println(n);
    }
}
