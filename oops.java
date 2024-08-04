/*
abstract class Animal{
    Animal(){
        System.out.println("Animal is created");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse is created");
    }
    public void walk(){
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken is walking");
    }
}

public class oops {
    public static void main(String[] args) {
        Horse horse = new Horse(); 
        // First Animal constructor is called and then Horse constructor is called
        horse.walk();
        horse.eat();
        // Animal animal = new Animal(); // This cannot be done as Animal is an abstract class
        // animal.walk(); 

        // Output :
        // Animal is created
        // Horse is created
        // Horse is walking
        // Animal is eating
    }
}
*/

//! What is Interface?
// An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
// In interfaces all the fields are public, static and final by default, and all the methods are public and abstract by default.
interface Animal{
    int eyes = 2;
    void walk(); // as this is interface this is public by default
}
interface Herbivore{

}
class Horse implements Animal, Herbivore{ // This is how Multiple Inheritance is achieved in Java using Interfaces
    public void walk(){
        System.out.println("Horse is walking");
    }
}

public class oops{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk(); // Output : Horse is walking
    }
}