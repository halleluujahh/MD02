package ra;

public class OperatorDemo {
    public static void main(String[] args) {
        /*
            # 2 kiểu type-casting (ép kiểu):
            - implicit: ngầm định - ép kiểu từ dữ liệu thấp lên cao;
            - VD:
            + 10 là integer
            + number1 kiểu float
        */
        float number1 = 10;
        /*
            explicit: tường minh (lập trình viên ép) - từ cao xuống thấp
            - VD:
            + 8.5 kiểu double
            + number2 kiểu float
        */
        float number2 = 8.5F;
        int number3 = (int) 8.5;
    }
}
