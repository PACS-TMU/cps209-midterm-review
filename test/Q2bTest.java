import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q2bTest {
    @Test
    public void testIsPrime1() {
        assertTrue(Q2b.isPrime(2));
    }

    @Test
    public void testIsPrime2() {
        assertTrue(Q2b.isPrime(3));
    }

    @Test
    public void testIsPrime3() {
        assertTrue(Q2b.isPrime(5));
    }

    @Test
    public void testIsPrime4() {
        assertFalse(Q2b.isPrime(4));
    }

    @Test
    public void testIsPrime5() {
        assertFalse(Q2b.isPrime(9));
    }

    @Test
    public void testIsPrime6() {
        assertFalse(Q2b.isPrime(1));
    }
}