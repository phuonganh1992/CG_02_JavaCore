import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing add 1+1")
    public void testAdd1And1(){
        int x=1;
        int y=1;

        int expectedResult=2;
        int result=SimpleCalculator.add(x,y);
        assertEquals(expectedResult, result);
    }
    @Test
    @DisplayName("Test add 3+1")
    public void testAdd3And1(){
        int x=3;
        int y=1;
        int expectedResult=4;
        int result=SimpleCalculator.add(x,y);
        assertEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Testing sub 3-1")
    public void testSub(){
        int x=3;
        int y=1;
        int expectedResult=2;
        int result=SimpleCalculator.sub(x,y);
        assertEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Testing mul 3*2")
    public void testMul() {
        int x=3;
        int y=2;
        int expectedResult=6;
        int result=SimpleCalculator.mul(x,y);
        assertEquals(expectedResult,result);
    }

    @Test
    @DisplayName("Testing div 12/2")
    public void testDiv() {
        int x=12;
        int y=2;
        int expectedResult=6;
        int result=SimpleCalculator.div(x,y);
        assertEquals(expectedResult,result);
    }

}
