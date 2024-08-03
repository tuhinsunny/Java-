import java.util.*;
public class miniProject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100 +1); // 1-100
        int userNumber;
        do{
            System.out.println("Guess my number(1-100): ");
            System.out.print("Enter your guess: ");
            userNumber = in.nextInt();
            if(userNumber == myNumber){
                System.out.println("Woah! You guessed it right!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is too large!");
            }
            else{
                System.out.println("Your number is too small!");
            }
    } while(userNumber>=0);
    System.out.println("My number was : "+myNumber);
}
}
