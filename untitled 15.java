package demounittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReversalTest {

    @Test
    @DisplayName("1. Test đảo chuỗi thông thường ('hello' -> 'olleh')")
    void testReverseString_normalString() {
        String input1 = "hello";
        String expectedOutput1 = "olleh";
        String actualOutput1 = StringReversal.reverseString(input1);
        assertEquals(expectedOutput1, actualOutput1, "Test với chuỗi thông thường");
    }

    @Test
    @DisplayName("2. Test đảo chuỗi thông thường khác ('world' -> 'dlrow')")
    void testReverseString_anotherNormalString() {
        String input2 = "world";
        String expectedOutput2 = "dlrow";
        String actualOutput2 = StringReversal.reverseString(input2);
        assertEquals(expectedOutput2, actualOutput2, "Test với chuỗi 'world'");
    }

    @Test
    @DisplayName("3. Test với chuỗi rỗng ('' -> '')")
    void testReverseString_emptyString() {
        String input3 = "";
        String expectedOutput3 = "";
        String actualOutput3 = StringReversal.reverseString(input3);
        assertEquals(expectedOutput3, actualOutput3, "Chuỗi rỗng đảo ngược phải là chuỗi rỗng");
    }

    @Test
    @DisplayName("4. Test với chuỗi có một ký tự ('a' -> 'a')")
    void testReverseString_singleCharacter() {
        String input4 = "a";
        String expectedOutput4 = "a";
        String actualOutput4 = StringReversal.reverseString(input4);
        assertEquals(expectedOutput4, actualOutput4, "Chuỗi 1 ký tự đảo ngược phải giữ nguyên");
    }

    @Test
    @DisplayName("5. Test với chuỗi có khoảng trắng ('hello world' -> 'dlrow olleh')")
    void testReverseString_withSpaces() {
        String input5 = "hello world";
        String expectedOutput5 = "dlrow olleh";
        String actualOutput5 = StringReversal.reverseString(input5);
        assertEquals(expectedOutput5, actualOutput5, "Chuỗi có khoảng trắng phải đảo ngược chính xác");
    }
}