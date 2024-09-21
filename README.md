The Student class represents a student with attributes such as name, student ID, major, and GPA. It provides methods to display student information and update the GPA.

Attributes:
name: Stores the student's name.
studentID: Unique identifier for the student.
major: The field of study the student is pursuing.
GPA: Grade Point Average of the student.

Constructors:
A default constructor initializes attributes with default values (empty strings for String attributes and 0.0 for GPA).
A parameterized constructor allows for the initialization of all attributes when creating a Student object.

Methods:
displayInfo(): Prints the student's details in a formatted manner.
updateGPA(double newGPA): Updates the student's GPA with a new value.

Usage:
In the main method, three student objects are created:
student1 is initialized using the default constructor and its attributes are set manually.
student2 and student3 are also initialized using the default constructor with their attributes set.
The updateGPA method is demonstrated for student3 to show how GPA can be modified.

Requirements Met:
Defined a Student class with four attributes.
Implemented both a default and a parameterized constructor.
Included methods for displaying information and updating the GPA.
Demonstrated the usage of the class by creating multiple objects and calling the methods.
