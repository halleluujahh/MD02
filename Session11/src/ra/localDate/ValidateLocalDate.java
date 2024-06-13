package ra.localDate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ValidateLocalDate {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        LocalDate birthDate = inputBirthDate(scanner);
//        System.out.println("Ngày sinh của bạn: " + birthDate);
//        LocalDateTime logDate = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        String formattedDate = logDate.format(formatter);
//        LocalDateTime parsedDate = LocalDateTime.parse(formattedDate, formatter);
//        System.out.println(formattedDate);
//        LocalDateTime firstDate = LocalDateTime.now();
//        LocalDateTime secondDate = LocalDateTime.of(2024, 6, 20, 5, 38, 0);
//        Duration duration = Duration.between(secondDate, firstDate);
//        long daysBetween = duration.toDays();
//        // Kiểm tra xem khoảng thời gian có nằm trong 30 ngày không và cùng năm không
//        if (daysBetween <= 30 && duration.toHours()==732 && duration.toMinutes()<=43920 && firstDate.getYear() == secondDate.getYear()) {
//            System.out.println("Second date: " + secondDate);
//            System.out.println("Days between: " + daysBetween);
//        } else {
//            System.out.println("The second date is not within 30 days of the first date in the same year.");
//        }
        LocalDate currentDate = LocalDate.now();
        int totalDaysOfWeek = DayOfWeek.values().length;
        YearMonth yearMonth = YearMonth.from(currentDate);
        int totalDaysOfMonth = yearMonth.lengthOfMonth();
        Year year = Year.from(currentDate);
        int totalDaysOfYear = year.length();


        LocalDate beforeCurrentDate4Month = currentDate.minusMonths(4);
        long totalDaysIn4Month = ChronoUnit.DAYS.between(beforeCurrentDate4Month, currentDate);

        System.out.println(totalDaysIn4Month);
    }

//    public static LocalDate inputBirthDate(Scanner scanner) {
//        System.out.println("Nhập vào ngày sinh của bạn:");
//        do {
//            try {
//                return LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//            } catch (Exception ex) {
//                System.err.println("Sai định dạng ngày tháng, vui lòng nhập lại");
//            }
//        } while (true);
//    }
}
