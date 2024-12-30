import models.Person;
import models.School;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File studentsFile = new File("src/students.txt");
        File teachersFile = new File("src/teachers.txt");

        Scanner studentsScanner = new Scanner(studentsFile);
        Scanner teachersScanner = new Scanner(teachersFile);
        School school = new School();

        while (studentsScanner.hasNext()) {
            String name = studentsScanner.next();
            String surname = studentsScanner.next();
            int age = studentsScanner.nextInt();
            String genderStr = studentsScanner.next();
            boolean gender = genderStr.equals("Male");
            Student student = new Student(name, surname, age, gender);
            school.addMember(student);
            while (studentsScanner.hasNextInt()){
                student.addGrade(studentsScanner.nextInt());
            }
        }

        while (teachersScanner.hasNext()) {
            String name = teachersScanner.next();
            String surname = teachersScanner.next();
            int age = teachersScanner.nextInt();
            String genderStr = teachersScanner.next();
            boolean gender = genderStr.equals("Male");
            String subject = teachersScanner.next();
            int yearsOfExperience = teachersScanner.nextInt();
            int salary = teachersScanner.nextInt();
            Teacher teacher = new Teacher(name,surname,age,gender,subject,yearsOfExperience,salary);
            school.addMember(teacher);

        }

        System.out.println(school);
    }
}