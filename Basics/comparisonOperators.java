import java.util.Scanner;

public class comparisonOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        // Conditional Statements
        boolean isSunUp = true;
        if(isSunUp == true)
            System.out.println("Good Morning!");
        else
            System.out.println("Good Night!");
        
        // Logical Operators
        int x = 10;
        int y = 20;
        int z = 30;
        System.out.println(x < y && y < z); // true (Logical AND)
        System.out.println(x < y || y > z); // true (Logical OR)
        System.out.println(!(x < y)); // false  (Logical NOT)

        Scanner in = new Scanner(System.in);
        int cash = in.nextInt();
        if(cash<10){
            System.out.println("You are poor");
        } else if(cash>=10 && cash<100){
            System.out.println("You are middle class");
        } else {
            System.out.println("You are rich");
        }


    }
}
