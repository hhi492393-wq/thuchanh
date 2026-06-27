import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class Advance2Test {

    static class Advance2 {
        public int sum(long number) {
            int sum = 0;
            long index;
            // Xử lý số âm: lấy giá trị tuyệt đối
            if (number < 0) number = -number;
            while (number != 0) {
                index = number % 10;
                sum += index;
                number /= 10;
            }
            return sum;
        }
    }

    private Advance2 advance2;

    @BeforeEach
    void setUp() {
        advance2 = new Advance2();
    }

    @Test
    @DisplayName("TC01 - sum(5765) = 5+7+6+5 = 23 (ví dụ đề bài)")
    void testSum_example_5765() {
        assertEquals(23, advance2.sum(5765));
    }

    @Test
    @DisplayName("TC02 - sum(1) = 1 (số có 1 chữ số)")
    void testSum_singleDigit() {
        assertEquals(1, advance2.sum(1));
    }

    @Test
    @DisplayName("TC03 - sum(99) = 9+9 = 18")
    void testSum_twoDigits() {
        assertEquals(18, advance2.sum(99));
    }

    @Test
    @DisplayName("TC04 - sum(12345) = 1+2+3+4+5 = 15")
    void testSum_multipleDigits() {
        assertEquals(15, advance2.sum(12345));
    }

    @Test
    @DisplayName("TC05 - sum(1000) = 1+0+0+0 = 1 (có chữ số 0 ở giữa)")
    void testSum_withZeroDigitsInside() {
        assertEquals(1, advance2.sum(1000));
    }

    @Test
    @DisplayName("TC06 - sum(999999999L) = 9×9 = 81 (số lớn dùng long)")
    void testSum_largeNumber() {
        assertEquals(81, advance2.sum(999999999L));
    }

   
    @Test
    @DisplayName("TC07 - sum(-5765) = 5+7+6+5 = 23 (dấu âm không tính)")
    void testSum_negative_5765() {
        assertEquals(23, advance2.sum(-5765));
    }

    @Test
    @DisplayName("TC08 - sum(-1) = 1")
    void testSum_negative_one() {
        assertEquals(1, advance2.sum(-1));
    }

    @Test
    @DisplayName("TC09 - sum(-12345) = 1+2+3+4+5 = 15")
    void testSum_negative_multipleDigits() {
        assertEquals(15, advance2.sum(-12345));
    }

    @Test
    @DisplayName("TC10 - sum(-999) = 9+9+9 = 27")
    void testSum_negative_999() {
        assertEquals(27, advance2.sum(-999));
    }

    @Test
    @DisplayName("TC11 - sum(-100) = 1+0+0 = 1")
    void testSum_negative_withZeros() {
        assertEquals(1, advance2.sum(-100));
    }

   

    @Test
    @DisplayName("TC12 - sum(0) = 0 (vòng while không chạy → sum = 0)")
    void testSum_zero() {
        assertEquals(0, advance2.sum(0));
    }

    @Test
    @DisplayName("TC13 - Kiểu trả về của sum(0) phải là int")
    void testSum_zero_returnsInt() {
        Object result = advance2.sum(0);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    @DisplayName("TC14 - sum(0) không được âm")
    void testSum_zero_notNegative() {
        assertTrue(advance2.sum(0) >= 0);
    }
}