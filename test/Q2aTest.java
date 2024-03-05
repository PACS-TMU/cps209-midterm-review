import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q2aTest {
    @Test
    public void testIsPalindrome1() {
        assertTrue(Q2a.isPalindrome("radar"));
    }

    @Test
    public void testIsPalindrome2() {
        assertTrue(Q2a.isPalindrome("level"));
    }

    @Test
    public void testIsPalindrome3() {
        assertTrue(Q2a.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testIsPalindrome4() {
        assertFalse(Q2a.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome5() {
        assertFalse(Q2a.isPalindrome("world"));
    }

    @Test
    public void testIsPalindrome6() {
        assertFalse(Q2a.isPalindrome("GitHub Copilot"));
    }
}