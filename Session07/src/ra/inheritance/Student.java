package ra.inheritance;

public class Student extends Person{
    //Kế thừa 4 thuộc tính, các phương thức get/set và 2 constructor của Person
    //Thuộc tính riêng
    private float avgMark;
    private String studentId;
    //Các hàm tạo riêng

    public Student() {
    }

    public Student(String name, String age, boolean sex, String address, float avgMark, String studentId) {
        super(name, age, sex, address);
        this.avgMark = avgMark;
        this.studentId = studentId;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void hello(String name) {
        super.wellcome();
        System.out.printf("Chúc bạn %s luôn hạnh phúc và thành công\n", name);
    }
}
