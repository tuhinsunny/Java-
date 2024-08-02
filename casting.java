public class casting {
    public static void main(String[] args) {
        //casting
        //implicit casting 
        double price = 100.00;
        double finalPrice = price + 10; // double + int is allowed as int is implicitly casted to double and then added to double
        System.out.println(finalPrice); //110.0

        //Explicit casting
        int p = 100;
        // int fP = p + 18.8;  not allowed as int + double cannot be assigned to int
        int fP = p + (int)18.89; //explicit casting
        System.out.println(fP); //118

        //constants
        int age = 30;
        age = 20; //allowed

        final float pi = 3.14f;
        // pi = 3.15f; //not allowed as pi is a constant because final keyword is used
        
    }
}
