package ra.generic;

public class Student extends Teacher implements Comparable<Student> {
    private String studentId;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
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

    public String toString() {
        return "Mã SV: " + this.studentId + " - Tên SV: " + this.studentName + " - Tuổi: " + this.age;
    }

    @Override
    public int compareTo(Student student) {
        //Cài đặt sắp xếp các sinh viên theo tuổi tăng dần
//        if (this.age > student.getAge()) {
//            return 1;
//        } else if (this.age == student.getAge()) {
//            return 0;
//        } else {
//            return -1;
//        }
        return this.age - student.getAge();
    }
}
