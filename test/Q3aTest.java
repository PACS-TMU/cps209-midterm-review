import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q3aTest {
    @Test
    public void testCalculateSum1() {
        assertEquals(14, Q3a.calculateSum(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testCalculateSum2() {
        assertEquals(0, Q3a.calculateSum(new int[]{1, -1, 0}));
    }

    @Test
    public void testCalculateSum3() {
        assertEquals(10, Q3a.calculateSum(new int[]{10}));
    }

    @Test
    public void testCalculateSum4() {
        assertEquals(-1, Q3a.calculateSum(new int[]{}));
    }

    @Test
    public void testCalculateSum5() {
        assertEquals(5, Q3a.calculateSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testCalculateSum6() {
        assertEquals(15, Q3a.calculateSum(new int[]{5, 5, 5, 5, 5}));
    }
}