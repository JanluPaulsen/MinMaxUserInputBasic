import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner userInput = new Scanner(System.in);
        double number;
        double minNumber = 0;
        double maxNumber = 0;
        do {
            System.out.println("Enter a number");
            System.out.println("Enter a character to quit");
            try {
                number = Double.parseDouble(userInput.nextLine());
                if (number < minNumber) {
                    minNumber = number;
                } else if (number > maxNumber) {
                    maxNumber = number;
                }
            }catch (Exception e) {
                System.out.println("Quitting");
                System.out.println("Max number is " + maxNumber);
                System.out.println("Min number is " + minNumber);
                quit = true;
            }
        }while (!quit);
    }
}