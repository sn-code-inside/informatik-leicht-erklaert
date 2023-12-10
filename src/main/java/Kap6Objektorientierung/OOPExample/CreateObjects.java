package Kap6Objektorientierung.OOPExample;

/*
This class is used to create objects of the 2
classes Teacher and Student
 */

public class CreateObjects {
    public static void main(String[] args) {
        //create objects
        Teacher teacherJim = new Teacher("Jim", 35, "Math", "Physics");

        Student studentTobi = new Student("Tobi", 13, "Albert Einstein School", 8);


        //use methods of objects
        studentTobi.study();


        System.out.println("Tobi is " + studentTobi.age);
        studentTobi.getOlder(studentTobi.age);
        System.out.println("Tobi is " + studentTobi.age + " after his birthday");

        teacherJim.goToSchool();


        teacherJim.teach();


    }
}
