package ra.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        //Khởi tạo đối tượng từ lớp Dictionary<K,V>
        //K: String, V: String
        Dictionary<String, String> dictionary1 = new Dictionary<>("Study", "Học");
        System.out.printf("Nghĩa của từ %s là %s\n", dictionary1.getKey(), dictionary1.getValue());
        //Làm việc với Generic thì phải sử dụng wrapper Class
        //K: Integer, V: String
        Dictionary<Integer, String> dictionary2 = new Dictionary<>(1, "Một");
        System.out.printf("Phiên âm số %d là %s\n", dictionary2.getKey(), dictionary2.getValue());
        //Khai báo và in dữ liệu mảng
        GenericMethod gm = new GenericMethod();
        Integer[] arrInt = {3,5,7,9};
        String[] arrStr = {"Nguyễn Văn A","Nguyễn Văn B"};
        Float[] arrFloat = {5.8F, 9.2F};
        System.out.println("Các phần tử mảng số nguyên:");
        gm.printArray(arrInt);
        System.out.println("Các phần tử mảng chuỗi:");
        gm.printArray(arrStr);
        System.out.println("Các phần tử mảng số thực:");
        gm.printArray(arrFloat);
        //Khởi tạo các List
        List<Person> listPerson = new ArrayList<>();
        List<Teacher> listTeacher = new ArrayList<>();
        List<Student> listStudent = new ArrayList<>();
        gm.test(listPerson);
    }
}
