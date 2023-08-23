import java.util.Arrays;
import java.util.List;

public class Grader {

    public String validate(String[] rightColours, String[] guessColours){
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
            return ("You guessed: "+rightSpot+" right colour(s) and spot(s)! \n"+"You guessed: "+ rightColour+ " right colour(s) in incorrect spot(s)");
        }else {
            return ("You guessed nothing right!");
        }

    }

}
