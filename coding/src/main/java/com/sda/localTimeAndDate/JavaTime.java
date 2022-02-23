import java.time.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaTime {
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);
        Set<String> zoneIdList = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIdList);
        List<String> test = zoneIdList.stream().filter(f-> f.contains("Bucharest"))
                .collect(Collectors.toList());
        System.out.println(test);
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime dateAfterTenDays = currentDateTime.plusDays(10);
       long duration= Duration.between(dateAfterTenDays,currentDateTime).toDays();
        System.out.println(duration);
        Period period = Period.between(LocalDate.now().minusDays(5),LocalDate.now());
        System.out.println(period);



    }
}
