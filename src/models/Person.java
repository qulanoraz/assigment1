package models;

public class Person {
    public String name;
    public String surname;
    public int age;
    public boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String getGender = gender ? "male" : "female";
        return "Hi, i am " + name + " " + surname + ", a " + age +" " + "year old" + " " + getGender;
    }
}