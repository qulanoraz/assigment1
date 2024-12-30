package models;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = generateStudentID();
        this.grades = new ArrayList<>();
    }

    private int generateStudentID() {
        return (int) (Math.random() * 100 + 1);
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }

    }

    public double calculateGPA() {
        double sum = 0.0;
        int i;
        for (i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am student with ID" + " " + studentID;
    }
}