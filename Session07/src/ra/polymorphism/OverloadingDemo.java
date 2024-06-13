package ra.polymorphism;

public class OverloadingDemo {
    /*
     * Điều kiện nạp chuồng phương thức:
     *   1. Các phương thức nạp chồng phải cùng 1 lớp
     *   2. Tên phuơng thức phải giống nhau
     *   3. Các điều kiện khác:
     *       + Số lượng tham số khác nhau
     *       + Thứ tự tham số khác nhau
     *       + Kiểu dữ liệu các tham số khác nhau
     * */
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public float add(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public int add(int firstNumber, int secondNumber, int thirtNumber) {
        return firstNumber + secondNumber + thirtNumber;
    }

    public void test(String str, int number){

    }
    public void test(int number, String str){

    }
}
