package ra.polymorphism;

public class Demo {
    public static void main(String[] args) {
        OverloadingDemo ol = new OverloadingDemo();
        OverridingDemo od = new OverridingDemo();
        System.out.println("Tổng 2 số 10 và 5 là: "+od.add(10,5));
        System.out.println(od);
    }
}
