import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void test01_01_2018() {
        String dateString="01/01/2018";
        String expectedResult="02/01/2018";
        String result=NextDayCalculator.displayNextDay(dateString);
        assertEquals(expectedResult,result);
    }
    @Test
    void test31_01_2018() {
        String dateString="31/01/2018";
        String expectedResult="01/02/2018";
        String result=NextDayCalculator.displayNextDay(dateString);
        assertEquals(expectedResult,result);
    }
    @Test
    void test30_04_2018() {
        String dateString="30/04/2018";
        String expectedResult="01/05/2018";
        String result=NextDayCalculator.displayNextDay(dateString);
        assertEquals(expectedResult,result);
    }
    @Test
    void test28_02_2018() {
        String dateString="28/02/2018";
        String expectedResult="01/03/2018";
        String result=NextDayCalculator.displayNextDay(dateString);
        assertEquals(expectedResult,result);
    }
    @Test
    void test29_02_2020() {
        String dateString="29/02/2020";
        String expectedResult="01/03/2020";
        String result=NextDayCalculator.displayNextDay(dateString);
        assertEquals(expectedResult,result);
    }
    @Test
    void test31_12_2018() {
        String dateString="31/12/2018";
        String expectedResult="01/01/2019";
        String result=NextDayCalculator.displayNextDay(dateString);
        assertEquals(expectedResult,result);
    }
}