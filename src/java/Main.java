public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Game game = new Game(player);
        System.out.println("Hello! What is your name?");
        player.setPlayerName(player.getInput(System.in));
        System.out.println("Well, " + player.getPlayerName() + " I am thinking of a number between 1 and 20.");
        while (game.play) {
            try {
                player.setGuess(player.getInput(System.in));
            } catch (Exception e) {
                System.out.println("Please input a numnber");
                player.setGuess(player.getInput(System.in));
            }
            game.testGuess();
        }
    }
}