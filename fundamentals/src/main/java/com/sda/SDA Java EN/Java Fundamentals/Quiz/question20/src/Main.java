import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2020, 3, 31);
        LocalDate day=d.plusDays(1);
        System.out.println(d);
        System.out.println(day);
    }
}