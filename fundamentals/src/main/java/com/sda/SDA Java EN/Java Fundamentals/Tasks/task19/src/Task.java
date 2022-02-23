import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        String localDate = "18.01.2022";
        String pattern = "dd.MM.yyyy";
        System.out.println(toLocalDate(pattern,localDate));
    }

    public static LocalDate toLocalDate(String pattern, String input) {
       DateTimeFormatter patternOfTheDate = DateTimeFormatter.ofPattern(pattern);
        LocalDate localDate = LocalDate.parse(input,patternOfTheDate);
        return localDate;

    }
}