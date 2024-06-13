package ra.conllection;

import ra.generic.Student;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //Khai báo 1 danh sách sinh viên từ interface List và lớp triển khai ArrayList
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 20);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 18);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 22);
        Student student4 = new Student("SV004", "Nguyễn Văn F", 19);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 25);
        //add(Object o): Thêm 1 phần tử vào cuối danh sách
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        //size(): Trả ra số phần tử của mảng
        System.out.println("Số sinh viên có trong danh sách là: " + listStudent.size());
        //isEmpty(): Kiểm tra danh sách có chứa phần tử chưa
        System.out.println("Danh sách sinh viên có phần tử chưa: " + listStudent.isEmpty());
        //contains(Object o): kiểm tra đối tượng o có trong danh sách không
        System.out.println("Kiểm tra sinh viên 2 có trong danh sách không: " + listStudent.contains(student2));
        //remove(Object o): xóa đối tượng o trong danh sách
        listStudent.remove(student2);
        //addAll(Collection <? extends E>): thêm 1 danh sách vào danh sách
        List<Student> list2 = new ArrayList<>();
        list2.add(student4);
        list2.add(student2);
        listStudent.addAll(list2);
        //clear(): xóa hết các phần tử của mảng
//        listStudent.clear();
        //CÁC PHƯƠNG THỨC CỦA ARRAYLIST
        //indexOf(Object o): trả ra chỉ số đối tượng o đầu tiên trong danh sách
        System.out.println("Chỉ số của sinh viên 4 trong danh sách là: " + listStudent.indexOf(student4));
        //lastIndexOf(Object o): Trả ra chỉ số đối tượn o cuối cùng trong danh sách
        listStudent.add(student4);
        System.out.println("Chỉ số của sinh viên 4 cuối cùng trong danh sách là: " + listStudent.lastIndexOf(student4));
        //remove(int index): xóa phần tử theo chỉ số trong danh sách
        listStudent.remove(4);
        //add(int index, Object o): chèn đối tượng o vào chỉ số index
        listStudent.add(1, student5);
        //get(int index): lấy ra phần tử có chỉ số index trong danh sách
        System.out.println("Thông tin sinh viên có chỉ số 1 trong danh sách: " + listStudent.get(1));
        //set(int index, Object o): Đè đối tượng o vào chỉ số index
        listStudent.set(1, student2);
        //In thông tin các sinh viên
        System.out.println("Thông tin các sinh viên:");
        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
}
