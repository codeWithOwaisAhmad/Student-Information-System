package pk.org.loom;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jos Buttler",18,75.7);
        student1.setFatherName("Ali");
        student1.setPresent(true);
        student1.setFee(2233.0);
        Student student2 = new Student("Alex Hales",20,77.9);
        student2.setFatherName("Ahmad");
        student2.setPresent(true);
        student2.setFee(2290.0);
        Student student3 = new Student("Harry Brook",55,99.9);
        student1.setFatherName("Arsal");
        student1.setPresent(true);
        student1.setFee(9876.0);
        Student student4 = new Student("Chris Jordan",28,68.2);
        student1.setFatherName("Aashir");
        student1.setPresent(false);
        student1.setFee(5649.0);
        Student student5 = new Student("Sam Curran",35,54.3);
        student1.setFatherName("Hamid");
        student1.setPresent(true);
        student1.setFee(8833.0);
        Student student6 = new Student("Mark Wood",33,82.0);
        student1.setFatherName("Anas");
        student1.setPresent(false);
        student1.setFee(5480.7);
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();
        student6.displayInfo();
        Student.displayTotalStudents();
    }
}
