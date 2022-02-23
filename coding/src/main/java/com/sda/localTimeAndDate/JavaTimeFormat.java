import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaTimeFormat {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDateTime.format(format);
        System.out.println(formattedDate);

        String localTimeToBeParsed = "19//38.18";
        DateTimeFormatter patternOfTheTime = DateTimeFormatter.ofPattern("HH//mm.ss");
        LocalTime theTime = LocalTime.parse(localTimeToBeParsed,patternOfTheTime);
        System.out.println(theTime);
    }
}
