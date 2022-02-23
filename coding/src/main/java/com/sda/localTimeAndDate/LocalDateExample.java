import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, Month.JANUARY,18);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        String formattedLocalTime = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(localTime);
        System.out.println(formattedLocalTime);
    }
}
