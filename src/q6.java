/*
 * Question 6:
 * Create a program that calculates the average grade of a student given a list of courses.
 * 
 * Implement a method `calculateAverage(ArrayList<Course> courses)` that:
 * - Returns the average of all course grades.
 * - Returns `-1.0` if the list is empty.
 * 
 * Example Input:
 * ArrayList<Course> courses = new ArrayList<>();
 * courses.add(new Course("Math", 85));
 * courses.add(new Course("English", 90));
 * courses.add(new Course("Science", 78));
 * double average = Q6.calculateAverage(courses);
 * System.out.println("Average Grade: " + average);
 * 
 * Example Output:
 * Average Grade: 84.33333333333333
 * Average Grade: -1.0
 * 
 * Task:
 * Implement all the sections marked as "TO DO" in the code below.
 * DO NOT EDIT ANY OTHER PART OF THE CODE.
 */

 import java.util.ArrayList;

 class Course {
     private String name;
     private int grade;
 
     public Course(String name, int grade) {
         // TO DO: Initialize the course name and grade
     }
 
     public int getGrade() {
        // TO DO: Return the grade
        return 0; // Placeholder return statement
     }
 }
 
 public class q6 {
     public static void main(String[] args) {
         // Test cases
         ArrayList<Course> courses1 = new ArrayList<>();
         courses1.add(new Course("Math", 85));
         courses1.add(new Course("English", 90));
         courses1.add(new Course("Science", 78));
 
         ArrayList<Course> courses2 = new ArrayList<>(); // Empty list
 
         System.out.println("Testing `calculateAverage` function:");
         System.out.println("--------------------------------------\n");
 
         System.out.println("Test 1:");
         System.out.println("Expected: 84.33333333333333");
         System.out.println("Result: " + calculateAverage(courses1));
         System.out.println();
 
         System.out.println("Test 2:");
         System.out.println("Expected: -1.0");
         System.out.println("Result: " + calculateAverage(courses2));
         System.out.println();
     }
 
     public static double calculateAverage(ArrayList<Course> courses) {
         // TO DO: Implement method to calculate the average grade of courses
         return 0.0; // Placeholder return statement
     }
 }
 