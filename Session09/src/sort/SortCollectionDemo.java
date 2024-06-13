package ra.sort;

import ra.generic.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollectionDemo {
    public static void main(String[] args) {
        /*
         * SẮP XẾP TRONG COLLECTIONS:
         * 1. Kế thừa từ Interface Comparable
         *   + Bước 1: Lớp sắp xếp kế thừa từ Comparable
         *   + Bước 2: Triển khai ghi đè phương thức compareTo để cài đặt sắp xếp
         *   + Bước 3: Sử dụng phương thức sort của Collections để sắp xếp
         * 2. Kế thừa từ Interface Comparator
         *   + Bước 1: Khởi tạo đối tượng gián tiếp từ Comparator và triển khai phương thức compare để cài đặt sắp xếp
         *   + Bước 2: Sử dụng sort của Collections để sắp xếp
         * */
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        Student student4 = new Student("SV004", "Nguyễn Văn F", 19);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 25);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        //Sắp xếp các sinh viên theo tuổi tăng dần
        Collections.sort(listStudent);
        System.out.println("THÔNG TIN SINH VIÊN SẮP XẾP THEO TUỔI TĂNG DẦN:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
        //Sắp xếp các sinh viên theo tuổi giảm dần
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return -(student.getAge() - t1.getAge());
            }
        });
        System.out.println("THÔNG TIN SINH VIÊN SẮP XẾP THEO TUỔI GIẢM DẦN:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
        //Sắp xếp sinh viên theo tên tăng dần
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getStudentName().compareTo(t1.getStudentName());
            }
        });
        System.out.println("THÔNG TIN SINH VIÊN SẮP XẾP THEO TÊN TĂNG DẦN:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
