package models;

public class Teacher extends Person {
    String subject;
    int yearsOfExperience;
    int salary;
    public Teacher(String name, String surname, int age, boolean gender , String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public double giveRaise(double percentage) {
        if (percentage > 0 && yearsOfExperience > 10) {
            salary += salary * percentage / 100;
        }
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " I teach" + " " + subject;
    }
}