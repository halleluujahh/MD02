package ra.optional;

import ra.stream.Student;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Student student = getStudent1();
        if (student != null) {
            System.out.println("Tên sinh viên là: " + student.getStudentName());
        }
        //Sử dụng Optional<T>
        Student student1 = getStudent1();
        Optional<Student> optStudent1 = Optional.ofNullable(student1);
        if (optStudent1.isPresent()) {
            System.out.println("Mã sinh viên là: " + optStudent1.get().getStudentId());
        }
        optStudent1.ifPresent(st -> System.out.println("Tuổi sinh viên là: " + st.getAge()));
        Student student2 = getStudent2().orElse(new Student());
        System.out.println("Thông tin sinh viên 2: "+student2);
    }

    public static Student getStudent1() {
        return new Student("SV001", "Nguyễn Văn A", 22);
    }

    public static Optional<Student> getStudent2() {
        return Optional.ofNullable(null);
    }
}
