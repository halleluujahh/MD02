package ra.inheritance;

public class Teacher extends Person{
    private String courseName;
    private String schoolName;

    public Teacher() {
    }

    public Teacher(String name, String age, boolean sex, String address, String courseName) {
        super(name, age, sex, address);
        this.courseName = courseName;
    }

    public Teacher(String courseName, String schoolName) {
        this.courseName = courseName;
        this.schoolName = schoolName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
