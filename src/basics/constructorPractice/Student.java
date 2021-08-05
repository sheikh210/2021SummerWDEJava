package basics.constructorPractice;

public class Student {

    String firstName;
    String lastName;
    char gender;
    int age;
    String studentId;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(String firstName, String lastName, int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    public Student(String firstName, String lastName, char gender, int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
    }

}
