public class methods {
    public static void printJava(){
        System.out.println("Java");
    }
    public static void printName(String name){
        System.out.println("My name is "+name);
    }
    public static void printSum(int a, int b){
        System.out.println(a+b);
    }
    
    public static void main(String[] args) {
        // Whenever we see that a block of code is being used multiple times, we can create a method or function
        printJava();
        printJava();
        printName("Tuhin");
        printName("Sohini");
        printSum(22,26);
    }
}
