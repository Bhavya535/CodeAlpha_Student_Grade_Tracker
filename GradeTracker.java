package CodeAlpha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("Enter the number of students:");
        int numStudents = sc.nextInt();
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            double grade = sc.nextDouble();
            grades.add(grade);
        }
        
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / numStudents;

        double highest = Collections.max(grades);
        double lowest = Collections.min(grades);
        
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}

