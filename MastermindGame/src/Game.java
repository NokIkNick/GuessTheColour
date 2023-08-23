import java.sql.Array;
import java.util.Random;

public class Game {
    TextUI textUI;
    Boolean gameOn = true;

    String[] colors;
    String[] guessedColors;
    Grader grader;

    public void gameStart() {
        grader = new Grader();
        textUI = new TextUI();
        textUI.displayMsg("Hej, velkommen til Mastermind!");
        int length = textUI.getIntInput("how long do you want the color sequence to be?");
        colors = randomize(length);
        for (String element : colors) {
            System.out.println(element);
        }
        while(gameOn){
            guessedColors = new String[length];
            for (int i = 0; i < length; i++) {
                String tmpGuess = textUI.getStringInput("enter a color you want to guess on");
                guessedColors[i] = tmpGuess;
            }
            System.out.println(grader.validate(colors, guessedColors));
            if(grader.getRightSpot() == colors.length) {
                gameOn = false;
            }
        }
        textUI.displayMsg("gz, you won!");
    }

    String[] randomize(int input) {
        String[] colourCode = new String[input];
        Random random = new Random();

        for(int i = 0; i < colourCode.length; i++){
            int randomColorAsInt = random.nextInt(5);
            switch (randomColorAsInt){
                case 0 -> {
                    colourCode[i] = "RED";
                    break;
                }
                case 1 -> {
                    colourCode[i] = "BLUE";
                    break;
                }
                case 2 -> {
                    colourCode[i] = "GREEN";
                    break;
                }
                case 3 -> {
                    colourCode[i] = "YELLOW";
                    break;
                }
                case 4 -> {
                    colourCode[i] = "BLACK";
                    break;
                }
            }
        }
        return colourCode;
    }
}
