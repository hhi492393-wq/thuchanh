package part4_Advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumber1Test {

    private MaxNumberFinder finder;

    // Khởi tạo đối tượng mới trước mỗi testcase để tránh trùng lặp dữ liệu
    @BeforeEach
    void setUp() {
        finder = new MaxNumberFinder();
    }

    // ==========================================
    // 3 TESTCASE CƠ BẢN THEO YÊU CẦU
    // ==========================================

    @Test
    void testFirstNumberIsMax() {
        finder.setNumber1(10);
        finder.setNumber2(5);
        finder.setNumber3(3);
        assertEquals(10, finder.max3(), "Trường hợp số thứ nhất lớn nhất");
    }

    @Test
    void testSecondNumberIsMax() {
        finder.setNumber1(5);
        finder.setNumber2(10);
        finder.setNumber3(3);
        assertEquals(10, finder.max3(), "Trường hợp số thứ hai lớn nhất");
    }

    @Test
    void testThirdNumberIsMax() {
        finder.setNumber1(5);
        finder.setNumber2(3);
        finder.setNumber3(10);
        assertEquals(10, finder.max3(), "Trường hợp số thứ ba lớn nhất");
    }

    // ==========================================
    // CÁC TESTCASE BỔ SUNG (TRƯỜNG HỢP CÁC SỐ BẰNG NHAU)
    // ==========================================

    @Test
    void testNum1EqualsNum2AndGreaterThanNum3() {
        finder.setNumber1(10);
        finder.setNumber2(10);
        finder.setNumber3(5);
        assertEquals(10, finder.max3(), "Trường hợp số 1 bằng số 2 và lớn hơn số 3");
    }

    @Test
    void testNum2EqualsNum3AndGreaterThanNum1() {
        finder.setNumber1(5);
        finder.setNumber2(10);
        finder.setNumber3(10);
        assertEquals(10, finder.max3(), "Trường hợp số 2 bằng số 3 và lớn hơn số 1");
    }

    @Test
    void testNum1EqualsNum3AndGreaterThanNum2() {
        finder.setNumber1(10);
        finder.setNumber2(5);
        finder.setNumber3(10);
        assertEquals(10, finder.max3(), "Trường hợp số 1 bằng số 3 và lớn hơn số 2");
    }

    @Test
    void testAllNumbersAreEqual() {
        finder.setNumber1(7);
        finder.setNumber2(7);
        finder.setNumber3(7);
        assertEquals(7, finder.max3(), "Trường hợp cả 3 số bằng nhau");
    }
}