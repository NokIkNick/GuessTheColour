import java.sql.Array;
import java.util.Random;

public class Game {
    TextUI textUI;
    Boolean gameOn = true;

    String[] colors;
    Grader grader;

    public void gameStart(int input) {
        Grader grader = new Grader();
        System.out.println("You chose " + input);
        colors = randomize(input);
        for (String element: colors) {  // this loop is just to see what which colors got generated. will be removed in final version
            System.out.println(element);
        }
        while(gameOn){
            //grader.validate();
            gameOn = false;
        }
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
