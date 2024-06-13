package ra.default_static_method;

public interface Static_Method {
    void test1();

    static void test2() {
        System.out.println("Phương thức static được triển khai tại interface");
    }
}
