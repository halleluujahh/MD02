package ra.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidateLocalDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthDate = inputBirthDate(scanner);
        System.out.println("Ngày sinh của bạn: " + birthDate);
    }

    public static LocalDate inputBirthDate(Scanner scanner) {
        System.out.println("Nhập vào ngày sinh của bạn:");
        do {
            try {
                return LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (Exception ex) {
                System.err.println("Sai định dạng ngày tháng, vui lòng nhập lại");
            }
        } while (true);
    }
}
