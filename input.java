import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // creating object of Scanner class
        System.out.println("Enter your name: ");
        String name = in.nextLine(); // taking input from user
        System.out.print("Input your age: ");
        int age = in.nextInt(); // taking input from user
        System.out.println((float)age);
        // all types of inputs
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Enter a float number: ");
        float fnum = in.nextFloat();
        System.out.println("Enter a double number: ");
        double dnum = in.nextDouble();
        System.out.println("Enter a boolean: ");
        boolean bool = in.nextBoolean();
        System.out.println("Enter a character: ");
        char ch = in.next().charAt(0);
        System.out.println("Enter a long number: ");
        long lnum = in.nextLong();
        System.out.println("Enter a short number: ");
        short snum = in.nextShort();
        System.out.println("Enter a byte number: ");
        byte bynum = in.nextByte();
        System.out.println("Enter a string: ");
        String str1 = in.nextLine(); // Whole line input
        System.out.println("Enter a string: ");
        String str = in.next(); // Single word input
    }
}
