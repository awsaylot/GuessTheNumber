import java.util.Scanner;
import java.util.Random;

public class Main {
    static String playerName = null;
    static Scanner getInput = new Scanner(System.in);
    static Random rand = new Random();
    static int guess = 0;
    static int tries = 0;
    static int number = rand.nextInt(20) + 1;
    static boolean play = true;
    static int max = 20;

    public static void greetPlayer() {
        System.out.println("Hello! What is your name?");
        try {
            playerName = getInput.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input. Try again.");
        }
        System.out.println("Well, " + playerName + " I am thinking of a number between 1 and 20.");
    }

    public static void getGuess() {
        System.out.println("Take a guess");
        try {
            guess = getInput.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Try again.");
        }
        getInput.nextLine();
        tries ++;
    }

    public static void testGuess() {
        if (guess == number) {
            System.out.println("Good job, " + playerName + " You guessed my number in " + tries + " guesses!");
            playAgain();
        } else if (tries == 6) {
            System.out.println("Sorry, " + playerName + " but you lose.");
            playAgain();
        } else {
            if (guess > 20 ) {
                System.out.println("Your guess is WAY too high.");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else if (guess < number) {
                System.out.println("Your guess is too low");
            }
        }
    }

    public static void playAgain() {
        System.out.println("Would you like to play again?");
        String response = getInput.nextLine();
        if (response.equals("y")) {
            number = rand.nextInt(max) + 1;
            System.out.println("Well, " + playerName + " I am thinking of a number between 1 and 20.");
            tries = 0;
            play = true;
        } else {
            play = false;
        }
    }


    public static void main(String[] args) {
        greetPlayer();
        while (play) {
            getGuess();
            testGuess();
        }
    }
}