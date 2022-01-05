import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTests {

    @Test
    @DisplayName("Add numbers 1+2")
    void testAddNumbers1() {
        Calculator canculator = new Calculator();
        assertEquals(canculator.plus(1, 2), 3);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    @DisplayName("Add numbers from csv")
    void testAddNumbers2(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.plus(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    @DisplayName("Add numbers from csv file")
    void testAddNumbers3(int first, int second, int expectedResult) {
        Calculator calculator = new Calculator();
        assertEquals(expectedResult, calculator.plus(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    void test1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test1 " + Thread.currentThread().getName());
    }

    @Test
    void test2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Test 2! " + Thread.currentThread().getName());
    }

}
