public class Course {
    private String name;
    private int grade;

    // TODO: Implement constructor, getters and setters
    public Course(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}