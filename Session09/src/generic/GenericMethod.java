package ra.generic;

import java.util.List;

public class GenericMethod {
    public <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }
    public void test(List<? super Teacher> listObject){

    }
}
