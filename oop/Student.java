package pk.org.loom;

public class Student {
    private int id;
    private String name;
    private String fatherName;
    private int age;
    private double grade;
    private double fee;
    private String cnic;
    private boolean isPresent;
    private static int totalStudents;
    private static String studentRules;

    static {
        totalStudents = 6;
        studentRules = "You Should come to University and be punctual";
    }

    Student() {}

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    Student(int id, String name, int age, double grade, double fee,String fatherName,String cnic,boolean isPresent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.fee = fee;
        this.fatherName = fatherName;
        this.cnic = cnic;
        this.isPresent = isPresent;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setPresent(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public boolean getPresent() {
        return isPresent;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getCnic() {
        return cnic;
    }

    public void displayInfo() {
        System.out.println("-----Student's Info------");
        System.out.println("Name of the Student is: " + name);
        System.out.println("ID of the Student is: " + id);
        System.out.println("Father Name of the Student is: " + fatherName);
        System.out.println("Age of the Student is: " + age);
        System.out.println("Grade Of the Student is:" + grade);
        System.out.println("Fee of the Student is: " + fee);
        System.out.println("Attendence of the Student is: " + isPresent);
        System.out.println("CNIC Of the Student is: " + cnic);
    }

    public static void displayTotalStudents() {
        System.out.println("----Total Students----");
        System.out.println("Total Number of Students are: " + totalStudents);
    }


}
