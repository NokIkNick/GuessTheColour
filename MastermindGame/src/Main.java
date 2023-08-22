public class Main {

    public static void main(String[] args){
        Grader grader = new Grader();
        TextUI ui = new TextUI();

        String[] randomizedColours = {"RED", "GREEN", "BLUE", "RED"};
        String[] guessColours = {"BLUE", "GREEN", "YELLOW", "YELLOW"};

        ui.displayMsg(grader.validate(randomizedColours, guessColours));
    }

}
