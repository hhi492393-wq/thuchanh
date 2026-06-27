package part4_Advanced;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Sort1Test {

    private Q4_Sort1 x;

    @Before
    public void setUp() {
        x = new Q4_Sort1();
    }

    @Test
    public void testSortAsc_WhenNumber1GreaterThanNumber2() {
        x.setNumber1(10);
        x.setNumber2(3);
        x.sortAsc();
        assertTrue(x.getNumber1() == 3 && x.getNumber2() == 10);
    }

    @Test
    public void testSortAsc_WhenNumber1LessThanNumber2() {
        x.setNumber1(2);
        x.setNumber2(5);
        x.sortAsc();
        assertTrue(x.getNumber1() == 2 && x.getNumber2() == 5);
    }
}