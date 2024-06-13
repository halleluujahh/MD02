package ra.default_static_method;

public class Demo3 implements Static_Method{
    //Chỉ có thể kế thừa và sử dụng phương thức static của interface
    @Override
    public void test1() {

    }

    public static void main(String[] args) {
       Static_Method.test2();
    }
}
