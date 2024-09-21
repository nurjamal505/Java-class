public class Student {
    private String name;
    private String studentID;
    private String major;
    private double GPA;

public Student(String name, string studentID, string major, double GPA) {
    this.name = name;
    this.studentID = studentID;
    this.major = major;
    this.GPA = GPA;
    

public Student() {
    this.name = "";
    this.studentID = "";
    this.major = "";
    this.GPA = 0.0;
}

public void displayInfo() {
    System.out.println("Student Name: " + name);
    System.out.println("Student ID: " + studentID);
    System.out.println("Student Major: " + major);
    System.out.println("Student GPA: " + GPA);
    System.out.println();
}

public void updateGPA(double newGPA) {
    this.GPA = newGPA;
}
