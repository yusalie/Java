package practice;
//importing scanner
import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        //making a scanner variable require a variable type of Scanner
        //variable name
        //which is set to a new scanner value
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name");
        //scanner nextline waits for users to enter a string
        String name = scan.nextLine();
        System.out.println("Welcome "+name);
        //nextDouble waits for user(s) to enter a double/decimal
        System.out.println("How much do you spend on coffee?");
        Double coffeePrice = scan.nextDouble();
        System.out.println("How much do you spend of fast food");
        Double ffPrice = scan.nextDouble();

        //nextInt waits for a user to enter an integer
        System.out.println("How much times a week do you buy coffee a week");
        int coffeeAmount = scan.nextInt();
        System.out.println("How much times a week do you eat fast food?");
        int foodAmount = scan.nextInt();
        System.out.println("You spend R"+coffeePrice+" on coffee");
        System.out.println("You spend R"+ffPrice+" on fast food");
        System.out.println("You drink coffee "+coffeeAmount+" a week");
        System.out.println("You eat fast food "+foodAmount+" time(s) a week");
        //closing scanner to avoid memory leak
        scan.close();
    }
}
