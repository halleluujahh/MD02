package main;

public class Student{
    private int id;
    private String name;
    private byte age;
    private String address;
    private float gpa;

    {
        System.out.println("Đây là block");
    }

    public interface InnerInterface{
        public void run();
    }

    public class InnerClass implements InnerInterface{
        public void run(){
            System.out.println("Đây là phương thức trong lớp inner");
        }
    }

    public Student(int id, String name, byte age, String address, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-10s %-10d %-10s %-10.1f\n", id, name, age, address, gpa);
    }


}
    
    
    
    






























