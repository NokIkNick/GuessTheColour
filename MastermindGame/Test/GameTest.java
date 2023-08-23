
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void gameStart() {
    }

    @Test
    void randomize() {

        Game game = new Game();
        // for the sake of this test the default size of the String array containing the colors that needs to be guessed will be set to 4
        //
        String[] result = game.randomize(4);
        // making sure the array is not empty
        assertNotNull(result);
        // here I define the different elements expected in the array
        HashSet<String> expectedColors = new HashSet<>();
        expectedColors.add("RED");
        expectedColors.add("BLUE");
        expectedColors.add("YELLOW");
        expectedColors.add("GREEN");
        expectedColors.add("BLACK");
        // loop through the array "result" and makes sure it contains colors
        for (String tmpColor : result) {
            assertTrue(expectedColors.contains(tmpColor));
        }
        // making sure the array is the expected size
        assertEquals(4,result.length);
    }
}