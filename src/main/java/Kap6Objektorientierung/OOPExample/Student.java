package Kap6Objektorientierung.OOPExample;

/*
This class extends the class Person and implements 2 interfaces
 */

public class Student extends Person implements GoToSchool, Learning{
    //attributes
    String school;
    int gradeLevel;

    //constructor
    public Student(String name, int age, String school, int gradeLevel){
        this.name = name;
        this.age = age;
        this.school = school;
        this.gradeLevel = gradeLevel;
    }

    //methods
    @Override
    public void study() {
        System.out.println(this.name + " is studying.");
    }

    @Override
    public void goToSchool() {
        System.out.println(this.name + " goes to school to study.");
    }
}
