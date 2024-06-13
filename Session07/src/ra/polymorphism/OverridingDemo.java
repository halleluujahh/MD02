package ra.polymorphism;

public class OverridingDemo extends SuperClass {
    /*
     * 1. Các lớp do người dùng xây dựng đều mặc định kế thừa từ lớp Object
     * 2. Điều kiện để ghi đè phương thức
     *   2.1. Có quan hệ kế thừa (Con kế thừa cha, ghi đè phương thức của lớp cha)
     *   2.2. Phương thức ghi đè (Lớp con) phải có kiểu dữ liệu trả về, tên phương thức, các tham số
     *   giống phương thức bị ghi đè (Lớp cha)
     *   2.3. Bổ từ truy cập của phương thức ghi đè có phạm vi lớn hơn hoặc băng phương thức bị ghi đè
     * */
    public int add(int number1, int number2) {
        return number1 - number2;
    }

    //Ghi đè phương thức toString của lớp Object
    public String toString() {
        return "Lớp overriding";
    }
}
