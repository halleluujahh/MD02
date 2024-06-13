package hw;

import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Student
{
    private String studentId; // ---> tính đóng gói
    private String studentName;
    private int age;
    private int year;
    private boolean sex;
    private String address;
    private String phone;
    public Student(){

    }

    public Student(String studentId, String studentName, int age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public  void inputData(Scanner sc, Student[] arrStudents, int currentIndex){
        //1. Mã sinh viên gồm 5 ký tự, bắt đầu là SV
        // không được phép trùng lặp
        this.studentId = inputStudentId(sc, arrStudents, currentIndex);
        //2. Tên sinh viên gồm từ 6-50 ký tự
        this.studentName = inputStudentName(sc);
        //3. Tuổi sinh viên phải lớn hơn hoặc bằng 18
        this.age = inputAge(sc);
        //4. Không nhập năm sinh mà phải tính toán
        calYear();
        //5. Giới tính chỉ nhận 1 trong 2 giá trị true-Nam, false-Nữ
        this.sex = inputSex(sc);
        //6. Địa chỉ bắt buộc phải nhập
        this.address = inputAddress(sc);
        //7. Số điện thoại gồm 10 số (0-9)
        this.phone = inputPhone(sc);
    }

    public void calYear(){
        this.year = 2024 - this.age;
    }

    public void displayData(){
        System.out.printf("Mã sv: %s - tên SV: %s - Tuổi: %d - Năm sinh: %d\n", this.studentId, this.studentName, this.age, this.year);
        System.out.printf("Giới tính: %s - Địa chỉ SV: %s - Số điện thoại: %s\n", this.sex?"Nam":"Nữ", this.address, this.phone);
    }

    public String inputPhone (Scanner sc){
        String phoneRegex = "[\\d]{10}";
        System.out.println("Nhập vào số điện thoại của sinh viên: ");
        do{
            String phone = sc.nextLine();
            if(Pattern.matches(phoneRegex,phone)){
                return phone;
            }else{
                System.err.println("Số điện thoại không đúng định dạng vui lòng nhập lại");
            }
        }while (true);
    }

    public String inputAddress(Scanner sc){
        System.out.println("Nhập vào địa chỉ của bạn: ");
        do{
            String address = sc.nextLine();
            if(address.trim().length()==0){
                System.err.println("Vui lòng nhập địa chỉ sinh viên: ");
            }else{
                return  address;
            }
        }while (true);
    }

    public boolean inputSex(Scanner sc){
        System.out.println("Nhập vào giới tính sinh viên: ");
        do{
            String sex = sc.nextLine();
            if(sex.equals("true")||sex.equals("false")){
                return Boolean.parseBoolean(sex);
            }else{
                System.err.println("Giới tính chỉ nhận giá trị true hoặc false");
            }
        }while(true);
    }

    public String inputStudentId(Scanner sc, Student[] arrStudents, int currentIndex){
        String studentIdRegex = "SV[\\d]{3}";
        System.out.println("Nhập vào mã sinh viên: ");
        do{
            String studentId = sc.nextLine();
            if(Pattern.matches(studentIdRegex,studentId)){
                // Kiểm tra mã đã tồn tại
                boolean isExist = false;
                for (int i = 0; i < currentIndex; i++) {
                    if(arrStudents[i].getStudentId().equals(studentId)){
                        isExist = true;
                        break;
                    }
                }
                if(isExist){
                    System.out.println("Mã sinh viên đã tồn tại");
                }else{
                    return studentId;
                }
            }else{
                System.err.println("Mã sinh viên không đúng định dạng vui lòng nhập lại");
            }
        }while (true);
    }

    public String inputStudentName(Scanner sc){
        System.out.println("Nhập vào tên sinh viên: ");
        do{
            String studentName = sc.nextLine();
            if(studentName.length()>=6 && studentName.length()<=50){
                return studentName;
            }else{
                System.err.println("Tên sinh viên gồm 6-50 ký tự, vui lòng nhập lại");
            }
        }while(true);
    }

    public int inputAge(Scanner sc){
        System.out.println("Nhập vào tuổi sinh viên: ");
        do{
            int age = Integer.parseInt(sc.nextLine());
            if(age>=18){
                return age;
            }else{
                System.err.println("Sinh viên chưa đủ 18.");
            }
        }while (true);
    }

}
