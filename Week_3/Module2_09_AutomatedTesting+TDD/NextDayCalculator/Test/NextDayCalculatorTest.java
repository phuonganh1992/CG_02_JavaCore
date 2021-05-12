import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void test01_01_2018() {
        String dateString="01/01/2008";
        String expectedResult="02/01/2008";
        String result=NextDayCalculator.displayNextDay(dateString);
        assertEquals(expectedResult,result);
    }
}