package ra.conllection;

import ra.generic.Student;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //Khai báo danh sách sinh viên có số thứ tự
        //Map<Key,Value>: Key duy nhất
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        Student student4 = new Student("SV004", "Nguyễn Văn F", 19);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 25);
        Map<Integer, Student> mapStudents = new HashMap<>();
        //put(Object o): Thêm 1 phần tử vào map
        mapStudents.put(1, student1);
        mapStudents.put(2, student2);
        mapStudents.put(3, student3);
        //get(K key): lấy phần tử theo key
        System.out.println("Thông tin sinh viên 1: "+mapStudents.get(1));
        //contains(K key): kiểm tra key có tồn tại trong map hay không
        System.out.println("Kiểm tra key = 4 có tồn tại trong map không: "+mapStudents.containsKey(4));
        //remove(K key): xóa phần tử trong map
        mapStudents.remove(1);
        //values(): Lấy danh sách các values của map
        System.out.println("Các values: "+mapStudents.values());
        //keySet(): lấy ra các key của map
        System.out.println("Các key: "+mapStudents.keySet());
        System.out.println("THÔNG TIN MAP STUDENT:");
        System.out.println(mapStudents);
    }
}
