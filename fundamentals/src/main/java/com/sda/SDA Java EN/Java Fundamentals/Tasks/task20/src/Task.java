import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        String date1 = "2014::01::23";
        String date2 ="03-2020-30";
        int[] array = calculateDifference(date1,date2);
        for(int x:array){
            System.out.println(x);
        }
    }

    public static int[] calculateDifference(String dateA, String dateB) {
        DateTimeFormatter patternOfDateA = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter patternOfDateB = DateTimeFormatter.ofPattern("MM--yyyy-dd");
        LocalDate localDateA = LocalDate.parse(dateA, patternOfDateA);
        LocalDate localDateB = LocalDate.parse(dateB, patternOfDateB);
        int[] differencesBetweenTheDates = new int[3];
        differencesBetweenTheDates[0] =Period.between(localDateA, localDateB).getYears();
        differencesBetweenTheDates[1]= Period.between(localDateA,localDateB).getMonths();
        differencesBetweenTheDates[2]=Period.between(localDateA,localDateB).getDays();

        return differencesBetweenTheDates;
    }
}