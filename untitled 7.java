package part4_Advanced;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Advance1Test {

    private Q7_Advance1 x;

    @Before
    public void setUp() {
        x = new Q7_Advance1();
    }

    @Test
    public void test1_USCLN_Normal() {
        assertEquals(4, x.USCLN(12, 8));
    }

    @Test
    public void test2_BSCNN_Normal() {
        assertEquals(12, x.BSCNN(4, 6));
    }

    @Test
    public void test3_USCLN_WithAEqualZero() {
        try {
            x.USCLN(0, 4);
            fail("Expected an exception due to infinite loop with a=0");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void test4_BSCNN_WithBEqualZero() {
        try {
            x.BSCNN(4, 0);
            fail("Expected an exception due to infinite loop with b=0");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void test5_USCLN_WithANegative() {
        try {
            x.USCLN(-4, 6);
            fail("Expected an exception due to infinite loop with negative a");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}