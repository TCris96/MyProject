import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date);
       while(localDate.getDayOfWeek() != DayOfWeek.FRIDAY) {
           localDate = localDate.plusDays(1);
       }
        System.out.println(localDate);


    }
}