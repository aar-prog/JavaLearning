import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //create object that reads input from user
        Scanner num = new Scanner(System.in);

        //declare variables to store input in
        int number = 0;
        int number2 = 0;

        //ask for user input second number
        System.out.println("Enter the first integer:");

        //read the input
        String a = num.nextLine();

        //check if input is a valid integer
        try {
            number = Integer.parseInt(a);
            System.out.println("Valid integer: " + number);
        } catch (NumberFormatException e) {

            //print error message
            System.out.println("Invalid input. Please enter a valid integer, try again.");
            return;
        }

        //ask for user input second number
        System.out.println("Enter the second integer: ");

        //read the input
        String b = num.nextLine();

        //check if second input is valid integer
        try {
            number2 = Integer.parseInt(b);
            System.out.println("Valid integer: " + number2);
        } catch (NumberFormatException e) {

            //print error message
            System.out.println("Invalid input. Please enter a valid integer, try again.");
            return;
        }

        //calculate sum of two inputted integers
        int sum = (number + number2);
        System.out.println("The sum of these two integers are: " + sum);
    }
}
