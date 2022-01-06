import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcMinusTests {

    @Test
    @DisplayName("Minus numbers 5-3")
    void testAddNumbers1() {
        Calculator canculator = new Calculator();
        assertEquals(canculator.minus(5, 3), 2);
        System.out.println("testAddNumbers3 " + Thread.currentThread().getName());
    }
}
