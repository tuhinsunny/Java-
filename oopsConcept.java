//! What are Objects?
//* */ Objects are instances of classes. When a class is defined, no memory is allocated but when it is instantiated (i.e. an object is created) memory is allocated.

//! Class
//* A class is a blueprint for objects. It defines a data type that includes data members and member functions.

class Pen{
    String color;
    String type; 
    // These are properties of the class Pen 👆

    // These are methods of the class Pen 👇
    public void write(){
        System.out.println("Writing...");
    }
    public void printColor(){
        System.out.println("Color: " + this.color); // this keyword is used to refer to the current object
    }
    // static methods can be called without creating an object of the class
    // we are not using static here because object is created in main method
}

class Student{
    String name;
    int age;
    // Non-Paremeterized Constructor
    // Student(){
    //     System.out.println("Constructor Called");
    // }

    //Parameterized Constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    //Copy Constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){}

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class oopsConcept {
    public static void main(String[] args) {
        /*
        // Creating an object of class Pen
        Pen pen1 = new Pen(); // pen1 is an object of class Pen
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "Ball";

        pen1.printColor(); // Output: Color: Blue
        pen2.printColor();  // Output: Color: Black
        */

        // Student s1 = new Student(); // Student() is a constructor -> constructor is a special method that is called when an object is created . This is default constructor
        // s1.name = "John";
        // s1.age = 20;
        // s1.printInfo();

        // 3 types of constructors
        // 1. Default constructor
        // 2. Parameterized constructor
        // 3. Copy constructor
        //* Name of the constructor is same as the name of the class
        //* Constructor does not have a return type
        //* Constructor is called only once when an object is created

        // Calling parameterized constructor
        // Student s1 = new Student("tuhinSunny", 20);
        // s1.printInfo();

        // Copy Constructor
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        Student s2 = new Student(s1);
        s1.printInfo();

        //! Destructors are not needed in java because java has garbage collector
        
    }
}
