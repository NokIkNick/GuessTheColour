import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void validate() {

        TextUI ui = new TextUI();

        String[] rightColours = {
                "RED",
                "GREEN",
                "RED",
                "BLUE"
        };

        String[] guessColours = {
                "GREEN",
                "BLUE",
                "RED",
                "BLACK"
        };


        int rightSpot = 0;
        int rightColour = 0;
        for(int i = 0; i < rightColours.length; i++){
            if(rightColours[i].equalsIgnoreCase(guessColours[i])){
                rightSpot++;
                guessColours[i] = "NULL";
            }
        }
        List<String> guessColoursList = Arrays.asList(guessColours);
        for (int i = 0; i < rightColours.length; i++) {
            if(guessColoursList.contains(rightColours[i])){
                rightColour++;
            }
        }

        if(rightColour > 0 || rightSpot > 0){
            ui.displayMsg("You guessed: "+rightSpot+" right colours and spot! \n"+"You guessed: "+ rightColour+ " right colours");
        }else {
            ui.displayMsg("You guessed nothing right!");
        }

    }

    @Test
    void textCorrectColoursAndPositions(){
        String[] rightColours = {
                "RED",
                "RED",
                "RED",
                "RED"
        };

        String[] guessColours = {
                "RED",
                "BLUE",
                "RED",
                "GREEN"
        };

        Grader grader = new Grader();
        grader.validate(rightColours, guessColours);
        assertEquals("You guessed: "+2+" right colours and spot! \n"+"You guessed: "+ 0+" right colours!", "You guessed: "+2+" right colours and spot! \n"+"You guessed: "+ 0+" right colours!");

    }

}