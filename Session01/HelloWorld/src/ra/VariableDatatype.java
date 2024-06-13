package ra;

public class VariableDatatype {
    public static void main(String[] args) {
        /*
            khai báo biến: Datatype variableName
            1. khai báo biến lưu trữ thông tin mã sinh viên, tên sinh viên, tuổi, giới tính,
         */
        String studentId;
        String studentName;
        int age;
        boolean sex;
        /*
            Khởi tạo giá trị cho biến: variableName = value;
            2. Khởi tạo giá tr biến mã sinh viên là SV001, tên sv là: Nguyễn Văn A, tuổi: 18
         */
        studentId = "SV001";
        studentName = "Nguyễn Văn A";
        age = 18;
        /*
            Cú pháp khai báo và khởi tạo biến: Datatype variableName = value;
            3.. Khai báo và khởi tạo gi trị biến mark = 8.5, address = "Hà Nội"
        */
        float mark = 8.5F;
        String address = "Hà Nội";
        /*
            Khai báo và khởi tạo giá trị nhiều biến cùng kiểu dữ liệu
            Khai báo biến a = 10, b = 8, c = 6;
            format code: ctrl + alt + L
        */
        int a = 10, b = 8, c = 6;
        /*
            Khai báo hằng số: final Datatype Constant_Name = value;
            5. Khai báo hằng số điểm qua môn với giá trị là 5
        */
        final float MARK_PASS = 5;

    }
}
