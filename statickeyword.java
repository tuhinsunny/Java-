class Student{
    String name;
    static String school;
    public static void changeSchool(){
        school = "XYZ School";
    }
}

public class statickeyword {
    public static void main(String[] args) {
        // static does not require an object to be created to access the variable
        Student.school = "ABC School";
        Student student1 = new Student();
        student1.name = "John";
        System.out.println(student1.name + " studies in " + Student.school);
        System.out.println(student1.name + " studies in " + student1.school);
        //Whenever we need to save memory, we can use static keyword
    }
}
