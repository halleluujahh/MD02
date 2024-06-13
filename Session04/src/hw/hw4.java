package hw;

import java.util.regex.Pattern;

public class hw4 {
    public static void main(String[] args) {
        String passwordRegex1 = "^([A-Z]+[a-z]+\\d+)\\S${6,}";
        System.out.println(Pattern.matches(passwordRegex1, "Aaazzbc0123"));
        String emailRegex1 = "^[A-Za-z\\d\\-\\%\\+\\-]+@[A-Za-z0-9\\d]+(\\.[A-Za-z0-9]{2,})+(\\.[A-Za-z0-9]{2,})*$";
        System.out.println(Pattern.matches(emailRegex1, "hanguyen@gmail.com"));
    }
}
