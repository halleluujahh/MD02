package ra.lambda;

public class Demo {
    public static void main(String[] args) {
        //Khởi tạo đối tượng từ Interface IFunctionalInterfaceDemo
        //Cách 1:
        IFunctionInterfaceDemo ifd1 = new IFunctionInterfaceDemo() {
            @Override
            public int addTwoNumbers(int number1, int number2) {
                int total = number1 + number2;
                return total;
            }
        };
        System.out.println("Tổng 2 số 5 và 10 là: " + ifd1.addTwoNumbers(5, 10));
        //Cách 2:
        IFunctionInterfaceDemo ifd2 = (int a, int b) -> {
            int total = a + b;
            return total;
        };
        System.out.println("Tổng 2 số 15 và 20 là: " + ifd2.addTwoNumbers(15, 20));
        //Cách 3:
        IFunctionInterfaceDemo ifd3 = (a, b) -> a + b;
        System.out.println("Tổng 2 số 25 và 30 là: " + ifd3.addTwoNumbers(25, 30));
    }
}
