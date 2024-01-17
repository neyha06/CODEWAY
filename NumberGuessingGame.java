import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int guess = 0;
        int number = 1 + r.nextInt(100);
        int tries = 1;
        System.out.println("I have chosen a number between 1-100. Try to guess it.");
        System.out.print("Your Guess: ");
        guess = input.nextInt();

        do {
            System.out.println("That's incorrect. Try Again");
            System.out.print("Your Guess: ");
            guess = input.nextInt();
            tries += 1;
        } while (guess != number);

        if (guess == number) {
            System.out.println("Good Job! You got my number!");
            System.out.println("It only took you " + tries + " tries.");
        }

    }
}