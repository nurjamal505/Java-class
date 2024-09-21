public class Student {
    private String name;
    private String studentID;
    private String major;
    private double GPA;

public Student(String name, String studentID, String major, Double GPA) {
    this.name = name;
    this.studentID = studentID;
    this.major = major;
    this.GPA = GPA;
}  

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

public static void main(String[] args) {
    Student student1 = new Student();
    student1.name = "Karen Smith";
    student1.studentID = "2407890";
    student1.major = "Psychology";
    student1.GPA = 4.0;
    student1.displayInfo();

    Student student2 = new Student();
    student2.name = "Leon Kennedy";
    student2.studentID = "2407891";
    student2.major = "Law";
    student2.GPA = 3.5;
    student2.displayInfo();

    Student student3 = new Student();
    student3.name = "Mark Ackerman";
    student3.studentID = "2407892";
    student3.major = "Computer Science";
    student3.GPA = 3.7;
    student3.displayInfo();
    student3.updateGPA(3.8);
    System.out.println("Updated GPA for " + student3.name + ":");
    student3.displayInfo();
}
}

