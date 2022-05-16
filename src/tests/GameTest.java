import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;
    Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
        game = new Game(player);
        player.setGuess("5");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGuess() {
        game.testGuess();
        assertEquals(1, game.tries);
    }

    @Test
    void playAgain() {
        String initialString = "y";
        game.playAgain(initialString);
        assertEquals(true, game.play);
    }
}