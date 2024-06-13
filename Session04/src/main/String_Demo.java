package main;

public class String_Demo {
    public static void main(String[] args) {
        // 1. Khởi tạo chuỗi literal --> immutable: không thể thay đổi
        String str1 = "ha";
        String str2 = "nam";
        String str3 = "ha";
        // str1 và str3 cùng trỏ đến 1 vùng nhớ lưu trữ ha trong string pool

        // 2. Khởi tạo chuỗi từ contructor của lớp String
        String str4 = new String("ha");
        String str5 = new String("ha");
        // str4 và str5 trỏ đến 2 vùng nhớ khác nhau trong heap segment

        // 3. str1.equals(str2): so sánh giá trị 2 chuỗi str1 và str2
        System.out.println("So sánh 2 chuỗi str1 và str3 với equals: " + str1.equals(str2));
        System.out.println("So sánh 2 chuỗi str1 và str4 với equals: " + str1.equals(str4));
        System.out.println("So sánh 2 chuỗi str4 và str5 với equals: " + str4.equals(str5));
        // Khi so sánh == là so sánh địa chỉ ô nhớ của 2 chuỗi
        System.out.println("So sánh 2 chuỗi str1 và str2 với ==: " + (str1 == str2));
        System.out.println("So sánh 2 chuỗi str1 và str4 với ==: " + (str1 == str4));

        // int length(): trả ra độ dài chuỗi
        System.out.println("Độ dài chuỗi str1 là: " + str1.length());
        // char str.charAt(int index): trả ra ký tự tại chỉ số index
        System.out.println("Ký tự có chỉ số 2 trong str1 là: " + str1.charAt(1));
        // String str1.concat(str2): nối 2 chuỗi str1 và str2
        System.out.println("Nỗi 2 chuỗi str1 và str2: " + str1.concat(" - ".concat(str2)));
        // String str.toUpperCase(): Viết hoa các ký tự trong chuỗi
        System.out.println("Viết hoa chuỗi str1: " + str1.toUpperCase());
        // String str.toLowerCase(): Viết thường các ký tự trong chuỗi
        System.out.println("Viết thường chuỗi str1: " + str1.toLowerCase());
        // String str.trim(): Xóa khoảng trắng (space) 2 đầu chuỗi
        String str6 = "      ha          ";
        System.out.println("Cắt khoảng trắng 2 đầu str6: " + str6.trim());
        // boolean str.equalsIgnoreCase(): So sánh giá trị str1 và str2 không phân biệt hoa thường
        String str7 = "HA";
        System.out.println("So sánh str1 và str7 không phân biệt hoa thường:" + str1.equalsIgnoreCase(str7));

        // int str1.compareTo(str2): Trả về độ chênh theo bảng mã ASCII
        String str8 = "ABCD";
        String str9 = "ABDC";
        System.out.println("So sánh str8 với str9 với compareTo: " + str8.compareTo(str9));

        // boolean str1.contains(str2): Kiểm tra chuỗi str10 có chữa chuỗi str2 không
        String str10 = "nam ha";
        System.out.println("Kiểm tra chuỗi str10 có chữa chuỗi str2: " + str10.contains(str2));

        // int str1.indexOf(str2): trả ra chỉ số của chuỗi str2 trong chuỗi str1
        System.out.println("Chỉ số chuỗi str1 trong chuỗi str10 là: " + str10.indexOf(str1));

        // String str1.replace(oldStr, newStr): thay thế chuỗi oldStr thành newStr trong str1
        System.out.println("Thay thế chuỗi ha thành ha nam trong chuỗi str1: " + str1.replace("ha", "ha nam"));

        // boolean str1.startWith(str2): Kiểm tra chuỗi str1 bắt đầu là chuỗi str2 không
        System.out.println("Kiểm tra chuỗi str1 bắt đầu là ha không: " + str1.startsWith("ha"));

        // String[] str.split("delimeter"): cắt chuỗi str thành các chuỗi con theo chuỗi delimeter
        String [] arrString = str2.split("");
        System.out.println("Các chuỗi con sau khi cắt: ");
        for(String e : arrString){
            System.out.printf("%s\t\n", e);
        }

        // String str.subString(int index): cắt chuỗi từ vị trí index đến cuối
        System.out.println("Cắt chuỗi str2 từ vị trí thứ 1: " + str2.substring(1));

        // String str.subString(int beginIndex, int endIndex): cắt chuỗi từ vị trí beginIndex đến endIndex
        System.out.println("Cắt chuỗi str2 từ vị trí thứ 0 đến 1: " + str2.substring(0,1));
    }
}
