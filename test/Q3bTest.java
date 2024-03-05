import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class Q3bTest {
    @Test
    public void testCalculateAverage1() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 90));
        courses.add(new Course("English", 80));
        assertEquals(85, Q3b.calculateAverage(courses));
    }

    @Test
    public void testCalculateAverage2() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 70));
        courses.add(new Course("English", 80));
        assertEquals(75, Q3b.calculateAverage(courses));
    }

    @Test
    public void testCalculateAverage3() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 100));
        courses.add(new Course("English", 100));
        assertEquals(100, Q3b.calculateAverage(courses));
    }

    @Test
    public void testCalculateAverage4() {
        ArrayList<Course> courses = new ArrayList<>();
        assertEquals(-1, Q3b.calculateAverage(courses));
    }

    @Test
    public void testCalculateAverage5() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 50));
        courses.add(new Course("English", 60));
        assertEquals(55, Q3b.calculateAverage(courses));
    }

    @Test
    public void testCalculateAverage6() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Math", 0));
        courses.add(new Course("English", 0));
        assertEquals(0, Q3b.calculateAverage(courses));
    }
}