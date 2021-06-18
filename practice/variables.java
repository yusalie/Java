package practice;
//name variables using lowerCamelCase
// eg numberOfVariables = 1;
public class variables {
    public static void main(String[] args) {
        int number = 20;
        System.out.println(number);
        //string variable
        String text = "this is a number: ";
        System.out.println(text+number);
        //Char type stores a single character
        //Char takes up less memory and runs faster
        char gender = 'F';
        System.out.println(gender);
        //Int have limits on the amount they can store
        //Int can only store values up to 2 billion
        //Long variables can store values greater than int can
        //Long variables can only store variables up to 9 quintillion
        Long globalPopulation = 7800000000L;
        System.out.println(globalPopulation);

        //Double variable type stores decimals
        Double dec = 3.141596;
        System.out.println(dec);
    }
}