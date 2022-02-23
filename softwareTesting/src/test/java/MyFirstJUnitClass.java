import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyFirstJUnitClass {

    @Test
    public void myFirstAssertEqualsTest() {
        int sum = 64;
        int firstNumber = 32;
        int secondNumber = 32;
        assertEquals(sum, firstNumber + secondNumber);
        assertNotEquals(sum, 2 + 8);
    }

    @Test
    public void MyFirstAssertTrueFalseTest() {
        int firstNumber = 32;
        int secondNumber = 32;
        assertTrue(firstNumber == secondNumber);
        assertTrue("hello" == "hello");
        assertTrue(firstNumber != 12);

    }

    @Test
    public void myFirstAssertNullTest() {
        String myString = "name";
        String mySecondString = null;
        assertNotNull(myString);
    }

    @Test
    public void myFirstArrayEqualsTest() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};

        assertArrayEquals(firstArray, secondArray);
    }

}
