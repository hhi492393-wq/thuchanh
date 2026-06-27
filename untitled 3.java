import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxNumber2Test {

    // 1. Test trường hợp số thứ nhất lớn hơn số thứ hai
    @Test
    public void testFirstNumberIsGreater() {
        // Bước 3: Tạo instance sao cho number1 > number2
        MaxNumber2 finder = new MaxNumber2(10, 5);
        
        // Bước 4: Gọi phương thức max2()
        int result = finder.max2();
        
        // Bước 5: Sử dụng assertion để kiểm tra kết quả trả về có bằng 10 không
        assertEquals(10, result, "Phương thức phải trả về number1 khi number1 lớn hơn");
    }

    // 2. Test trường hợp số thứ hai lớn hơn số thứ nhất
    @Test
    public void testSecondNumberIsGreater() {
        // Tạo instance sao cho number2 > number1
        MaxNumber2 finder = new MaxNumber2(5, 10);
        
        // Gọi phương thức max2()
        int result = finder.max2();
        
        // Kiểm tra kết quả trả về có bằng 10 không
        assertEquals(10, result, "Phương thức phải trả về number2 khi number2 lớn hơn");
    }

    // 3. Test trường hợp hai số bằng nhau
    @Test
    public void testNumbersAreEqual() {
        // Tạo instance sao cho number1 == number2
        MaxNumber2 finder = new MaxNumber2(7, 7);
        
        // Gọi phương thức max2()
        int result = finder.max2();
        
        // Kiểm tra kết quả trả về có bằng 7 không
        assertEquals(7, result, "Phương thức phải trả về giá trị chính xác khi hai số bằng nhau");
    }
}