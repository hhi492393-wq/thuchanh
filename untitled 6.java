package part4_Advanced;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    private Q6_Triangle x;

    @Test
    public void test1_FirstNumberIsMax() {
        x = new Q6_Triangle(9, 4, 1);
        int result = x.maxLength();
        assertEquals(9, result);
        assertTrue(x.getNumber1() >= x.getNumber2() && x.getNumber1() > x.getNumber3());
    }

    @Test
    public void test2_SecondNumberIsMax() {
        x = new Q6_Triangle(3, 8, 5);
        int result = x.maxLength();
        assertEquals(8, result);
        assertTrue(x.getNumber2() > x.getNumber1() && x.getNumber2() > x.getNumber3());
    }

    @Test
    public void test3_ThirdNumberIsMax() {
        x = new Q6_Triangle(2, 4, 7);
        int result = x.maxLength();
        assertEquals(7, result);
        assertTrue(x.getNumber3() > x.getNumber1() && x.getNumber3() > x.getNumber2());
    }
}