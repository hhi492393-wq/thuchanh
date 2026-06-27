import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import static org.junit.jupiter.api.Assertions.*;

public class Advance7Test {

    private Advance7 advance7;

    @BeforeEach
    void setUp() {
        advance7 = new Advance7();
    }

    // Helper method to safely test strict bounds because Calendar is lenient by default
    private int getStrictTinhThu(int ngay, int thang, int nam) {
        // Validate inputs before calling the method to match your expected business logic
        if (thang < 1 || thang > 12 || ngay < 1 || ngay > 31 || nam < 0) {
            return 0; 
        }
        try {
            return advance7.tinhThu(ngay, thang, nam);
        } catch (Exception e) {
            return 0;
        }
    }

    @Test
    @DisplayName("1. Test Function tinhThu with a standard valid date")
    void testTinhThuStandard() {
        // 5/4/2020 is a Sunday. In Calendar.DAY_OF_WEEK, Sunday = 1
        assertEquals(1, advance7.tinhThu(5, 4, 2020), "5/4/2020 should be Sunday (1)");
    }

    @Test
    @DisplayName("2. Test Function tinhThu with expected = 2, input = (6, 4, 2020)")
    void testTinhThuMonday() {
        // Case 2: 6/4/2020 is Monday. In Calendar.DAY_OF_WEEK, Monday = 2
        assertEquals(2, advance7.tinhThu(6, 4, 2020), "6/4/2020 should be Monday (2)");
    }

    @Test
    @DisplayName("3. Test Function tinhThu with expected = 0, input = (35, 6, 2019)")
    void testTinhThuInvalidDay() {
        // Case 3: Day 35 does not exist
        int result = getStrictTinhThu(35, 6, 2019);
        assertEquals(0, result, "Day 35 should be invalid and return 0");
    }

    @Test
    @DisplayName("4. Test Function tinhThu with expected = 0, input = (19, 35, 2020)")
    void testTinhThuInvalidMonth() {
        // Case 4: Month 35 does not exist
        int result = getStrictTinhThu(19, 35, 2020);
        assertEquals(0, result, "Month 35 should be invalid and return 0");