import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
    @Test
    void testFizz30() {
        int number = 30;
        String expected = "Fizz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
    @Test
    void testFizz53() {
        int number = 53;
        String expected = "FizzBuzz";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
    @Test
    void testFizzBuzz19() {
        int number = 19;
        String expected = "mot chin";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
    @Test
    void testNegative() {
        int number = -10;
        String expected = "Pls re-input: ";

        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
}