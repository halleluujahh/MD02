package main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex_Demo {
    public static void main(String[] args) {
        // Validate mật khẩu phải gồm 6 ký tự gồm ký tự thường hoặc hoa hoặc số
        String passwordRegex = "[a-zA-Z0-9]{6}";
        String password = "admin1";
        System.out.println("Kết quả so khớp: " + Pattern.matches(passwordRegex,password));
        // "." đại diện cho 1 ký tự đơn
        System.out.println("So khớp 1: " +Pattern.matches("J.va", "Jvva"));
        // [kí tự 1| Ký tự 2]: matches ký tự 1 hoặc ký tự 2
        System.out.println("So khớp 2: " +Pattern.matches("J[a|m]va", "Jmva"));
        // [ký tự 1 ký tự 2 ký tự 3]: matches 1 trong 3 ký tự
        System.out.println("So khớp 3: " +Pattern.matches("J[abc]va", "Jbva"));

       /*
           \d: là 1 số tương đương 0-9
           \D: không phải 1 số
           \w: là 1 ký tự (A-Z0-9a-z)
           \W: Không phải là 1 ký tự
           \s: là 1 khoảng trắng
           \S: không phải 1 khoảng trắng
           p*: không, 1 hoặc nhiều ký tự p
           p+: một hoặc nhiều ký tự p
           p?: không hoặc 1 ký tự p
           ^: Không chứa
        */
        System.out.println("So khớp 4: " +Pattern.matches("Jav[^b-d]", "Javb"));
        /*
        * Nhập vào mã sinh viên gồm 5 ký tự bắt đầu là SV, 3 ký tự sau là số
        * */
        Scanner sc = new Scanner(System.in);
        String studentIdRegex = "SV[0-9]{3}";
        System.out.println("Nhập vào mã sinh viên");
        String studentId;
        while(true){
            studentId = sc.nextLine();
            if(Pattern.matches(studentIdRegex,studentId)){
                break;
            }else {
                System.err.println("Mã sinh viên không đúng định dạng");
            }
        }
        System.out.println("Mã sinh viên vừa nhập: "+ studentId);
//        String passwordRegex1 = "^[A-Z]+[a-z]+\\d+${8,16}";
//        System.out.println(Pattern.matches(passwordRegex1, "Aaazzbc0123"));
//        String emailRegex1 = "^[A-Za-z\\d\\-\\%\\+\\-]+@[A-Za-z0-9\\d]+(\\.[A-Za-z0-9]{2,})+(\\.[A-Za-z0-9]{2,})*$";
//        System.out.println(Pattern.matches(emailRegex1, "hanvhe171012@fpt.com.vn"));
    }

}
