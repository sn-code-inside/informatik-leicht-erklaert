package Kap6Objektorientierung.OOPExample;

/*
This class extends the class Person and implements 2 interfaces
 */

public class Teacher extends Person implements GoToSchool, Teaching{
    //attributes
    public String subjectOne;
    public String subjectTwo;

    //constructor
    public Teacher(String name, int age, String subjectOne, String subjectTwo){
        this.name = name;
        this.age = age;
        this.subjectOne = subjectOne;
        this.subjectTwo = subjectTwo;

    }

    //methods
    @Override
    public void goToSchool() {
        System.out.println(this.name + " goes to school to teach.");
    }

    @Override
    public void teach() {
        System.out.println(this.name + " teaches " + this.subjectOne + " and " + this.subjectTwo);
    }
}
