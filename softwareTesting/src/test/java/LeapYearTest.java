import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    @Test
    public void isLeapYearIfItsDivisibleBy4Test(){
       boolean leapYear =  LeapYear.isLeapYear(2020);
        assertTrue(leapYear);
    }
    @Test
    public void isNotLeapYearIfItsDivisibleBy100Test(){
        boolean leapYear = LeapYear.isLeapYear(2000);
        assertFalse(leapYear);
    }
}
