package demounittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {

    @Test
    @DisplayName("1. Test với mảng số dương {1, 2, 3, 4, 5}")
    void testCalculateSum_positiveNumbers() {
        int[] sum1 = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = ArraySum.calculateSum(sum1);
        assertEquals(expectedSum, actualSum, "Tổng của mảng số dương phải là 15");
    }

    @Test
    @DisplayName("2. Test với mảng chứa số âm và số không {-1, 0, 1}")
    void testCalculateSum_mixedNumbers() {
        // Case 2: Mảng chứa cả số dương, số âm và số không
        int[] sum2 = {-1, 0, 1};
        int expectedSum = 0;
        int actualSum = ArraySum.calculateSum(sum2);
        assertEquals(expectedSum, actualSum, "Tổng của mảng {-1, 0, 1} phải là 0");
    }

    @Test
    @DisplayName("3. Test với mảng các số tròn chục {10, 20, 30, 40, 50}")
    void testCalculateSum_tensNumbers() {
        // Case 3: Mảng với các giá trị lớn hơn
        int[] sum3 = {10, 20, 30, 40, 50}; // Đổi tên biến thành sum3 để tránh trùng lặp
        int expectedSum = 150;
        int actualSum = ArraySum.calculateSum(sum3);
        assertEquals(expectedSum, actualSum, "Tổng của mảng {10, 20, 30, 40, 50} phải là 150");
    }
}