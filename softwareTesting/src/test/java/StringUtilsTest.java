import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void convertToDoubleTest(){
        //given
        String dateOfBirth ="1990";
        Double date= 1990d;
        //when
        Double actualResult = StringUtils.convertToDouble(dateOfBirth);
        //then
        assertEquals(date,actualResult);
        assertNotNull(actualResult);
    }
    @Test
    public void convertToDoubleWithNullTest(){
        //given
        String number = null;
        Double expectedValueNull = null;
        //when
        Double actualResult = StringUtils.convertToDouble(number);
        //then
        assertNull(actualResult);
        assertEquals(expectedValueNull,actualResult);
    }
    @Test
    public void getStringInCapitalLettersTest(){
        //given
        String myString ="test";
        String expectedResult="TEST";
        //when
        String actualResult = StringUtils.getStringInCapitalLetters(myString);
        //then
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getStringInCapitalLettersWithNullTest(){
        //given
        //when
        //then
        assertNotNull(StringUtils.getStringInCapitalLetters("test"));
    }
@Test
    public void isNullOrBlankTest(){
     //given
    String emptyString = "";
    boolean expexted = true;
    //when
    boolean actualResult = StringUtils.isNullOrBlank(emptyString);
    //then
    assertTrue(actualResult);
    }
    @Test
    public void isNullOrBlankWithBlankValueTest(){
        //given
        String emptyString = " ";
        boolean expexted = true;
        //when
        boolean actualResult = StringUtils.isNullOrBlank(emptyString);
        //then
        assertTrue(actualResult);
    }
    @Test
    public void isNullOrBlankWithNullTest(){
        //given
        //when
        //then
        assertTrue(StringUtils.isNullOrBlank(null));
    }
    @Test
    public void isNullOrBlankWithTextValueTes(){
        //given
        String textString = "abc";
        boolean expected = false;
        //when
        boolean actual = StringUtils.isNullOrBlank(textString);
        //then
        assertFalse(actual);
        assertEquals(expected,actual);
        assertNotEquals(true,actual);
    }
    @Test
    public void getDefaultIfNullTest(){
        //given
        String myString = null;
        String defaultString = "abc";
        String expected = defaultString;
        //when
        String actualResult = StringUtils.getDefaultIfNull(myString,defaultString);
        //then
        assertEquals(expected,actualResult);
        assertNotNull(actualResult);
    }
    @Test
    public void getDefaultIfNullWithValueTest(){
        //given
        String myString = "test";
        String defaultString = "abc";
        String expected = myString;
        //when
        String actualResult = StringUtils.getDefaultIfNull(myString,defaultString);
        //then
        assertNotNull(actualResult);
        assertEquals(expected,actualResult);
    }
    @Test
    public void concatWithNullArrayTest(){
        //given
        String[] array = null;

        //when
        String actual = StringUtils.concat(array);

        //then
        assertNull(actual);
    }
    @Test
    public void cancatArrayWithThreeElements(){
        //given
        String[] array = {"test","test1","test2"};
        String expected = "testtest1test2";
        //when
        String actual = StringUtils.concat(array);

        //then
        assertEquals(expected,actual);
    }
    @Test
    public void concatArrayWithOneNullElement(){
        //given
        String[] array ={"test",null,"test2"};
        String expected = "testtest2";
        //when
        String actual = StringUtils.concat(array);

        //then
        assertEquals(expected,actual);
    }
}
