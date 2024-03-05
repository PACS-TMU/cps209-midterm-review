import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Q1aTest {
    @Test
    public void testConvertToCamelCase1() {
        assertEquals("HelloWorld", Q1a.convertToCamelCase("hello_world"));
    }

    @Test
    public void testConvertToCamelCase2() {
        assertEquals("JavaProgramming", Q1a.convertToCamelCase("java_programming"));
    }

    @Test
    public void testConvertToCamelCase3() {
        assertEquals("GitHubCopilot", Q1a.convertToCamelCase("gitHub_copilot"));
    }

    @Test
    public void testConvertToCamelCase4() {
        assertEquals("TestString", Q1a.convertToCamelCase("test_string"));
    }

    @Test
    public void testConvertToCamelCase5() {
        assertEquals("CamelCase", Q1a.convertToCamelCase("camel_case"));
    }

    @Test
    public void testConvertToCamelCase6() {
        assertEquals("JUnitTest", Q1a.convertToCamelCase("jUnit_test"));
    }
}