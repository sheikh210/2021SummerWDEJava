package basics.constructorPractice;

public class Driver {

    public static void main(String[] args) {
        Student reza = new Student("Reza", "Aboudi", 'M', 25, "2042NY");

        System.out.println("FIRST NAME: " + reza.firstName);
        System.out.println("LAST NAME: " + reza.lastName);
        System.out.println("AGE: " + reza.age);
        System.out.println("GENDER: " + reza.gender);
        System.out.println("STUDENT ID: " + reza.studentId);
    }

}
