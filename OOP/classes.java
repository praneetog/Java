package OOP;

class Student{
    int rollNo;
    String name;
    float marks;

    //default non-parameterized constructor
    Student(){
        this (10, "random", 100.0f);
        //here this can also be said as Student(10, "random", 100.0f)
        //this is used to give reference to our main parameterized constructor
    }

    //constructor which can have reference to other constructor
    Student(Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    //parameterized constructor
    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    //method for changing name
    void changeName(String name){
        this.name = name;
    }

    void greeting(){
        System.out.println("Hello from "+this.name);
    }
}

public class classes {
    public static void main(String[] args) {
        Student praneet = new Student(21, "Praneet Kashyap", 84.2f);
        Student def = new Student();

        Student other = new Student(praneet); //this will the constructor which has ref to other constructor

        //if we dont pass parameters
        Student random = new Student();
        //it will be directed to Student() constructor with no parameter
    }
}
