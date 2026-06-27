package part4_Advanced;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Sort2Test {

    @Before
    public void setUp() {
        Q5_Sort2.number1 = 0;
        Q5_Sort2.number2 = 0;
    }

    @Test
    public void testSortDesc_WhenNumber1GreaterThanNumber2() {
        Q5_Sort2.number1 = 10;
        Q5_Sort2.number2 = 3;
        Q5_Sort2.sortDesc();
        assertTrue(Q5_Sort2.number1 == 10 && Q5_Sort2.number2 == 3);
    }

    @Test
    public void testSortDesc_WhenNumber1LessThanNumber2() {
        Q5_Sort2.number1 = 4;
        Q5_Sort2.number2 = 9;
        Q5_Sort2.sortDesc();
        assertTrue(Q5_Sort2.number1 == 9 && Q5_Sort2.number2 == 4);
    }
}