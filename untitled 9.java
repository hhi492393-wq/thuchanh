import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Advance3Test {

    private final Advance3 advance3 = new Advance3();

    @Test
    public void testFibonacciWithPositiveNumbers() {
        assertEquals(1, advance3.fibonacci(2));
        assertEquals(2, advance3.fibonacci(3));
        assertEquals(3, advance3.fibonacci(4));
        assertEquals(5, advance3.fibonacci(5));
        assertEquals(8, advance3.fibonacci(6));
    }

    @Test
    public void testFibonacciWithNegativeNumber() {
        assertEquals(-1, advance3.fibonacci(-1));
        assertEquals(-1, advance3.fibonacci(-10));
    }

    @Test
    public void testFibonacciWithZeroAndOne() {
        assertEquals(0, advance3.fibonacci(0));
        assertEquals(1, advance3.fibonacci(1));
    }
}