package ra.default_static_method;

public interface Default_Method {
    void test1();

    default void test2() {
        System.out.println("Phương thức thực thi được triển khai trong Interface");
    }
}
