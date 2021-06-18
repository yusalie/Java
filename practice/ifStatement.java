package practice;
import java.util.Scanner;
public class ifStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //if statements are used for decision making
        // "and" = &&
        // "or" = ||
        System.out.println("Choose a number:");
        Double choice = input.nextDouble();
        if(choice%2 == 0){
            System.out.println("Your number is even");
        }
        else{
            System.out.println("Your number is uneven");
        }
        input.close();
    }   
}
