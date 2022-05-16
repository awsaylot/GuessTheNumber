import java.io.InputStream;
import java.util.Scanner;

public class Player {
    static String playerName = null;
    private int guess = 0;

    public String getInput(InputStream inputStream) {
        String input;
        try {
            Scanner scan = new Scanner(inputStream);
            input = scan.nextLine();
            return input;
        } catch (Exception e) {
            System.out.println("You put in invalid input, quitting now.");
            return null;
        }
    }

    public void setPlayerName(String name) {
        playerName = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setGuess(String num) {
        System.out.println("Take a guess");
        guess = Integer.parseInt(num);
    }
    public int getGuess() {
        return guess;
    }
}
