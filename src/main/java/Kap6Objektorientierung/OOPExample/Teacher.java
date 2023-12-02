package Kap6Objektorientierung.OOPExample;

public class Teacher extends Person implements GoToSchool, Teaching{
    public String subjectOne;
    public String subjectTwo;

    public Teacher(String name, int age, String subjectOne, String subjectTwo){
        this.name = name;
        this.age = age;
        this.subjectOne = subjectOne;
        this.subjectTwo = subjectTwo;
    }
}
