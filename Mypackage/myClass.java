package Mypackage;

//! What is Encapsulation?
//! Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.
//! Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.

//! What is Data Hiding?
//! Data hiding is a concept that applies to object-oriented programming (OOP) to secure the data that is stored in an object.

//! Data Abstraction
//! Data abstraction is the process of hiding certain details and showing only essential information to the user.

public class myClass {
    int a;
    public void setValue(int n){
        a=n;
    }
    public void displayValue(){
        System.out.println("Value of a is: "+a);
    }
}
