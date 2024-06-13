package test;

import java.util.Scanner;

public abstract class Person {
    //Có các thuộc tính
    private String name;
    private int age;
    private String address;
    //Có constructor

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Các phương thức thực thi (non-abstract method)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void hello() {
        System.out.println("Xin chào các bạn");
    }

    //CÓ CÁC PHƯƠNG THỨC TRỪU TƯỢNG (abstract method) - Không có trình triển khai (Không có thân)
    //Thể hiện các quy định, quy tắc mà các lớp thực thi kế thừa nó phải triển khai ra
    public abstract void inputData(Scanner scanner);

    public abstract void displayData();
}
