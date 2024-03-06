//Question 3b: Create a program that calculates the average grade of a student given a list
// of courses and their respective grades.
// If there are no courses, return -1.
// Refer to the Course class in the starter code.
import java.util.ArrayList;

public class Q3b {
    public static double calculateAverage(ArrayList<Course> courses) {
        // TODO: Implement this method
        if (courses.size() == 0) {
            return -1;
        }
        double sum = 0;
        for (Course course : courses) {
            sum += course.getGrade();
        }
        return sum / courses.size();
    }
}