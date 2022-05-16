import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class PlayerTest {

    Player player;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        player = new Player();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getInput() {
        String initialString = "test";
        InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
        assertEquals("test", player.getInput(targetStream));
    }

    @org.junit.jupiter.api.Test
    void setPlayerName() {
        player.setPlayerName("michael");
        assertEquals("michael", player.getPlayerName());
    }

    @org.junit.jupiter.api.Test
    void getPlayerName() {
        player.setPlayerName("michael");
        assertEquals("michael", player.getPlayerName());
    }

    @org.junit.jupiter.api.Test
    void setGuess() {
        player.setGuess("5");
        assertEquals(5, player.getGuess());
    }

    @org.junit.jupiter.api.Test
    void getGuess() {
        player.setGuess("5");
        assertEquals(5, player.getGuess());
    }
}