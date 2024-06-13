package ra.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<Student>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 24);
        Student student2 = new Student("SV002", "Nguyễn Văn C", 22);
        Student student3 = new Student("SV003", "Nguyễn Văn B", 21);
        Student student4 = new Student("SV004", "Nguyễn Văn F", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 22);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);

        //1. In ra các sinh viên có tuổi lớn hơn hoặc bằng 22
        //B1: chuyển sang stream
        //B2: Thao tác trung gian
        //B3: Thao tác đầu cuối
        System.out.println("1. Sủ dụng fiter và foreach in ra các sinh viên có tuổi lớn hơn hoặc bằng 22:");
        listStudent.stream().filter(student -> student.getAge() >= 22).forEach(System.out::println);
        System.out.println("2. Sử dụng limit để in ra 3 sinh viên đầu tiên trong danh sách:");
        listStudent.stream().limit(3).forEach(System.out::println);
        System.out.println("3. Sử dụng limit và skip để in ra 3 sinh viên từ sinh viên thứ 3:");
        listStudent.stream().skip(2).limit(3).forEach(System.out::println);
        System.out.println("4. In hoa tên các sinh viên sử dụng map:");
        List<Student> listStudentNew = listStudent.stream().map(student -> {
            student.setStudentName(student.getStudentName().toUpperCase());
            return student;
        }).collect(Collectors.toList());
        //listStudentNew.stream().foreach(student->System.out.println(student));
        listStudentNew.stream().forEach(System.out::println);
        System.out.println("5. Sắp xếp sinh viên theo tuổi tăng dần sử dụng sorted và in ra:");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        System.out.println("6. Sắp xếp sinh viên theo tuổi giảm dần sử dụng sorted và in ra:");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge).reversed()).forEach(System.out::println);
        System.out.println("7. Sắp xếp sinh viên theo tuổi giảm dần, sinh viên bằng tuổi sắp xếp theo tên tăng dần:");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge).reversed()
                .thenComparing(Student::getStudentName)).forEach(System.out::println);
        System.out.println("8. Kiểm tra trong danh sách có sinh viên nao lớn hơn 23 tuổi không:");
        boolean result = listStudent.stream().anyMatch(student -> student.getAge() > 23);
        System.out.println("result: " + result);
        System.out.println("9. Kiểm tra trong danh sách tất cả sinh viên lớn hơn 20 tuổi không:");
        boolean result1 = listStudent.stream().allMatch(student -> student.getAge() > 20);
        System.out.println("result1: " + result1);
        System.out.println("10. In ra số sinh viên có tuổi lớn hơn hoặc bằng 22:");
        int cntStudent = (int) listStudent.stream().filter(student -> student.getAge() >= 22).count();
        System.out.println("Số sinh viên có tuổi lớn hơn hoặc bằng 22: " + cntStudent);
        System.out.println("11. In ra sinh viên có tuổi lớn nhất:");
        System.out.println(listStudent.stream().max(Comparator.comparing(Student::getAge)).get());
        System.out.println("12. Thống kê số sinh viên có tuổi từ 21 đến 23:");
        IntSummaryStatistics iss = listStudent.stream().mapToInt(Student::getAge).summaryStatistics();
        System.out.println("Thống kê: " + iss);
        System.out.println("Tuổi trung bình: " + iss.getAverage());
        System.out.println("13. Tính tổng tuổi các sinh viên:");
        int sumAge = listStudent.stream().reduce(0, (totalAge, student) -> totalAge + student.getAge(),Integer::sum);
        System.out.println("Tổng tuổi sinh viên: "+sumAge);


    }
}
