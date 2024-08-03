public class exceptionHandling {
    public static void main(String[] args) {
        // Try-Catch in Exception Handling
        int[] marks = {97, 98, 95};
        try{
            System.out.println(marks[5]); // ArrayIndexOutOfBoundsException
        } catch(Exception e){
            // do something after catching the exception
            System.out.println("There is an exception: " + e);
        }
        System.out.println("The name is Tuhin");  // This will run even after the exception
    }
}
