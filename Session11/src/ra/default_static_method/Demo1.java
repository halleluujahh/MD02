package ra.default_static_method;

public class Demo1 implements Default_Method{

    @Override
    public void test1() {

    }
    //Option 1: kế thừa phương thức default
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.test2();
    }
}
