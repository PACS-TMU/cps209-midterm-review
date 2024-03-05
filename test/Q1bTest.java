import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q1bTest {
    @Test
    public void testIsValidHexadecimal1() {
        assertTrue(Q1b.isValidHexadecimal("A1B2C3"));
    }

    @Test
    public void testIsValidHexadecimal2() {
        assertTrue(Q1b.isValidHexadecimal("a1b2c3"));
    }

    @Test
    public void testIsValidHexadecimal3() {
        assertTrue(Q1b.isValidHexadecimal("1234567890ABCDEF"));
    }

    @Test
    public void testIsValidHexadecimal4() {
        assertFalse(Q1b.isValidHexadecimal("GHIJKLMNOP"));
    }

    @Test
    public void testIsValidHexadecimal5() {
        assertFalse(Q1b.isValidHexadecimal("1234567890abcdefg"));
    }

    @Test
    public void testIsValidHexadecimal6() {
        assertFalse(Q1b.isValidHexadecimal("NotAHexNumber"));
    }
}