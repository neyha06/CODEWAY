import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int guess = 0;
        int number = 1 + rand.nextInt(100); // generate random number between 1 to 100
        int tries = 1;
        System.out.println("I have chosen a number between 1-100. Try to guess it. BEST OF LUCK!");
        System.out.print("Enter your Guess: ");
        guess = input.nextInt();

        do {
            System.out.println(" Ophs! that's incorrect! Try Again");
            System.out.print("Enter your Guess: ");
            guess = input.nextInt();
            tries += 1;
        } while (guess != number);

        if (guess == number) {
            System.out.println("Good Job! You got my number!");
            System.out.println("It only took you " + tries + " tries.");
        }

    }
}
