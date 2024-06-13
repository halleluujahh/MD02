package ra.default_static_method;

public class Demo2 implements Default_Method{
    @Override
    public void test1() {

    }

    //Option2: Có thể ghi đè phương thức default tại lớp kế thừa
    @Override
    public void test2() {
        System.out.println("Phương thức default của Interface đã bị ghi đè ở lớp kế thừa");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        demo2.test2();
    }
}
