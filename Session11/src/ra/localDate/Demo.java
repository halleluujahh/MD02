package ra.localDate;

import java.time.*;

public class Demo {
    public static void main(String[] args) {
        //Kiểu dữ liệu LocalDate: yyyy-MM-dd
        LocalDate now = LocalDate.now();
        System.out.println("Ngày hiện tại: " + now);
        LocalDate birthOfTeacher = LocalDate.of(1984, 04, 23);
        System.out.println("Ngày sinh nhật của thầy: " + birthOfTeacher);
        LocalDate dayOfYears = LocalDate.ofYearDay(2024, 100);
        System.out.println("Ngày 100 của năm 2024: " + dayOfYears);
        //Kiểu dữ liệu LocalTime: hh-mm-ss
        LocalTime timeNow = LocalTime.now();
        System.out.println("Giờ hiện tại: " + timeNow);
        LocalTime timeRecent = LocalTime.of(8, 23, 35);
        System.out.println("Thời gian: " + timeRecent);
        //Kiểu dữ liệu LocalDateTime: yyyy-MM-dd hh-mm-ss
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("Thời gian hiện tại: " + localDateTimeNow);
        //Kiểu dữ liệu ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        //Period: khoảng thời gian giữa 2 mốc thời gian
        LocalDate firstDate = LocalDate.now();
        LocalDate secondDate = LocalDate.of(2023, 05, 22);
        Period period = Period.between(firstDate, secondDate);
        System.out.println("Period: " + period);
        System.out.println("Số ngày giữa 22/05/2023 đến hiện tại: " + period.getDays());
        Period period1 = Period.of(2, 3, 4);
        Period period2 = period1.plusYears(2);
        Period period3 = period1.plus(period2);
        System.out.println("Period2: " + period2);
        System.out.println("period3: " + period3);
    }
}
