import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Advance4Test {

    private Advance4 advance4;

    @BeforeEach
    void setUp() {
        advance4 = new Advance4();
    }

    @Test
    @DisplayName("1. Test Function isPrimeNumber with valid prime numbers")
    void testIsPrimeNumberWithValidPrimes() {
        // Test basic valid prime numbers
        assertTrue(advance4.isPrimeNumber(2), "2 should be a prime number");
        assertTrue(advance4.isPrimeNumber(3), "3 should be a prime number");
        assertTrue(advance4.isPrimeNumber(5), "5 should be a prime number");
        assertTrue(advance4.isPrimeNumber(11), "11 should be a prime number");
    }

    @Test
    @DisplayName("2. Test Function isPrimeNumber with expected = false, input = 6")
    void testIsPrimeNumberWithSix() {
        // Case 2: Input is 6, expected output is false
        assertFalse(advance4.isPrimeNumber(6), "6 is not a prime number");
    }

    @Test
    @DisplayName("3. Test Function isPrimeNumber with expected = false, input = -3")
    void testIsPrimeNumberWithNegativeThree() {
        // Case 3: Input is -3, expected output is false (n < 2 constraint)
        assertFalse(advance4.isPrimeNumber(-3), "-3 is not a prime number");
    }
}