class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println("Name: " + name);
    }
    public void printInfo(int age){
        System.out.println("Age: " + age);
    }

    public void printInfo(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        //! What is Polymorphism?
        //Polymorphism is one of the core concepts of object-oriented programming (OOP) that describes situations in which something occurs in several different forms. In computer science, polymorphism describes the concept that you can access objects of different types through the same interface. Each type can provide its own independent implementation of this interface.
        //* 2 types : Compile time polymorphism and Run time polymorphism
        //* Compile time polymorphism is method overloading
        //* Run time polymorphism is method overriding

        //! Method Overloading
        //Method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. It is similar to constructor overloading in Java, that allows a class to have more than one constructor having different argument lists.

        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;
        
        s1.printInfo(s1.age);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);

        // There should be different number of arguments or different type of arguments in the methods to overload them

        //* Compile time overloading is better than run time overloading because it is faster and efficient
    }
}
