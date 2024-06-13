package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    private static Scanner sc = new Scanner(System.in);
    private static Validate v = new Validate();
    private static List<Student> listS = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        while(true){
            System.out.println("/****************************************/");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by gpa.");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. Exit.");
            System.out.println("/****************************************/");
            choice = v.checkInputChoice();
            switch(choice){
                case 1:
                    addStudent();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    printStudents();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc !!!");
                    return;
            }
        }
    }

    public static void printStudents(){
        if(listS.size() == 0){
            System.out.println("Không tìm thấy sinh viên nào !");
            return;
        }
        System.out.println("Danh sách sinh viên hiện có: ");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "ID", "Name", "Age", "Address", "GPA");
        for(int i = 0; i<listS.size(); i++){
            System.out.println(listS.get(i));
        }
    }

    public static boolean checkDuplicateStudent(int id){
        for(Student s : listS){
            if(s.getId() == id){
                return true;
            }
        }
        return false;
    }



    public static void addStudent() {
        if(listS.size() > 1){
            if(!v.checkInputYN()){
                return;
            }
        }
        int id;
        while(true){
            id = v.checkInputInt("ID");
            if(checkDuplicateStudent(id)) {
                System.out.println("Học sinh với ID " + id + " đã tồn tại !!");
            }else {
                break;
            }
        }
        String name = v.checkInputString("Name");
        byte age = Byte.parseByte(String.valueOf(v.checkInputInt("age")));
        String address = v.checkInputString("Address");
        float gpa = (float) v.checkInputDouble("GPA");
        Student s = new Student(id, name, age, address, gpa);
        listS.add(s);
        System.out.println("Thêm student thành công !!");
    }
}