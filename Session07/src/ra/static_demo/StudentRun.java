package ra.static_demo;

public class StudentRun {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("SV1: tổng 2 số 5 và 10 là: " + student1.sumTwoNumbers(5, 10));
        student1.sing("Sài gòn");
        Student student2 = new Student();
        System.out.println("SV2: tổng 2 số 5 và 10 là: " + student2.sumTwoNumbers(5, 10));
        student2.sing("Hà Nội");
        System.out.println("Các sinh viên tính tổng 5 và 10: " + Student.sumTwoNumbers(5, 10));
    }
}
