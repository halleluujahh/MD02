package ra;

public class OutputDemo {
    public static void main(String[] args) {
        /*
            1. In chuỗi và xuống dòng
        */
        System.out.println("Hello World");
        /*
            2. In chuỗi và không xuống dòng
        */
        System.out.print("Hello World 1");
        /*
            3. In ra và định dạng dữ liệu
            - \n: xuống dòng.
            - \t: lùi vào 1 tab.
        */
        String studentName = "Phương Thu";
        int age = 26;
        float md1Mark = 4.9F;
        System.out.printf("\nSinh viên %s với tuổi %d\tcó điểm md1 là %.1f\n", studentName, age, md1Mark);
        /*
            4. In nội dung lỗi
        */
        System.err.println("Đã có lỗi xảy ra trong chương trình");
    }
}
