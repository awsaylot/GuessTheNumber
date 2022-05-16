import java.util.Random;


public class Game {
    public int tries = 0;
    public boolean play = true;
    private int max = 20;
    private Random rand = new Random();
    private int number = rand.nextInt(max) + 1;
    Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void testGuess() {
        int guess = player.getGuess();
        if (guess == number) {
            System.out.println("Good job, " + player.getPlayerName() + " You guessed my number in " + tries + " guesses!");
            playAgain(this.player.getInput(System.in));
        } else if (tries == 6) {
            System.out.println("Sorry, " + player.getPlayerName() + " but you lose.");
            playAgain(this.player.getInput(System.in));
        } else {
            if (guess > 20 ) {
                System.out.println("Your guess is WAY too high.");
            } else if (guess > number) {
                System.out.println("Your guess is too high.");
            } else if (guess < number) {
                System.out.println("Your guess is too low");
            }
        }
        tries ++;
    }

    public void playAgain(String response) {
        System.out.println("Would you like to play again?");
        if (response.equals("y")) {
            number = rand.nextInt(max) + 1;
            System.out.println("Well, " + player.getPlayerName() + " I am thinking of a number between 1 and 20.");
            tries = 0;
            play = true;
        } else {
            play = false;
        }
    }
}
