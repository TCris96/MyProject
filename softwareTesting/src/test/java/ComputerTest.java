import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    Computer myComputer;

    @BeforeEach
    void setUp(){
        myComputer = new Computer();
    }

    @BeforeAll
    static void setUpBeforeAllTests(){
        System.out.println("Started tests at: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    @AfterEach
    void afterEachTests(){
        System.out.println("This prints after each test");
    }

    @AfterAll
    static void logTimeAfterTestsFinished(){
        System.out.println("Tests ended execution at: "+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }


    @Test
    public void addTest() {
        //given
        int sum = 10;
        double firstNumber = 5;
        double secondNumber = 5;
        //when
        //Computer myComputer = new Computer();
        Double result = myComputer.add(firstNumber, secondNumber);
        //then
        assertEquals(sum, result);

    }

    @Test
    public void subtractTest() {
        //given
        double firstNumber = 5;
        double secondNumber = 5;
        double expected = 0;

        //when
        //Computer myComputer = new Computer();
        Double result = myComputer.subtract(firstNumber, secondNumber);

        //then
        assertEquals(expected, firstNumber - secondNumber);
    }

    @Test
    public void subtractWithNegativeValueTest() {
        //given
        double firstNumber = 5;
        double secondNumber = -5;
        //when
        //Computer myComputer = new Computer();
        Double result = myComputer.subtract(firstNumber, secondNumber);
        //then
        assertNull(result);
        assertNotNull(myComputer);
    }

    @Test
    public void multiplyTest() {
        //given
        double a = 5;
        double b = 5;
        Double expected = 25D;
        //when
        //Computer myComputer = new Computer();
        Double result = myComputer.multiply(a, b);

        //then
        assertEquals(expected, result);
        assertNotEquals(8, result);
    }

    @Test
    public void divideTest() {
        //given
        double x = 10;
        double y = 5;
        Double expectedResult = 2D;
        //when
        //Computer myComputer = new Computer();
        Double result = myComputer.divide(x, y);
        //then
        assertEquals(expectedResult, result);
        assertNotEquals(7, result);
    }

    @Test
    public void divideWithZeroTest() {
        //given
        double x = 10;
        double y = 0;
        Double expectedResult = null;
        //when
        //Computer myComputer = new Computer();
        Double result = myComputer.divide(x, y);
        //then
        assertEquals(expectedResult, result);
        assertNull(result);
    }

    @Test
    public void reverseSignTest() {
        //given
        double a = 5;
        Double expectedResult = -5D;
        //when
        //Computer myComputer = new Computer();
        Double result = myComputer.reverseSign(a);

        //then
        assertEquals(expectedResult,result);

    }


}
