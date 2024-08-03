class Shape{
    public void area(){
        System.out.println("Area of shape");
    }

}

// Single inheritance -> 1 parent class and 1 child class
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

// Multilevel inheritance -> 1 parent class and 1 child class and 1 grandchild class
class EquilateralTriangle extends Triangle {
    public void area(int l){
        System.out.println(1/2 * l * l);
    }
}

// Hierarchical inheritance -> 1 parent class and multiple child classes
class Circle extends Shape {
    public void area(int r){
        System.out.println(3.14 * r * r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //! What is inheritance?
        //Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).
        //! Child class, base class, super class
        //The class that inherits the properties from another class is known as the child class, subclass, or derived class. And the class whose properties are inherited by the child class is known as a parent class, superclass
        //! Types of inheritance
        //* Single inheritance
        //* Multiple inheritance
        //* Multilevel inheritance
        //* Hierarchical inheritance
        //* Hybrid inheritance

        //* Single inheritance is the most common type of inheritance
        //* Multiple inheritance is not supported in Java
        //* Multilevel inheritance is when a class is derived from a class which is also derived from another class
        //* Hierarchical inheritance is when one class serves as a superclass for more than one subclass
        //* Hybrid inheritance is a combination of two or more types of inheritance (not supported in Java) . Interface is used to implement multiple inheritance in Java

        //! Why use inheritance?
        //* For Method Overriding (so runtime polymorphism can be achieved)
        //* For Code Reusability
        //* For Parent class reference
        //* For Object Polymorphism
        //* For Method Overriding
        //* For Extending the functionality of a class
        //* For Modifying the behavior of a class

        

    }
}
