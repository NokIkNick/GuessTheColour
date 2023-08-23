import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Game game = new Game();
        TextUI ui = new TextUI();
        // Tænker det her skal over i TextUI.
        // hvis vi vil have at folk kan ændre på hvor mange farver de vil gætte
        Scanner scan = new Scanner(System.in);
        ui.displayMsg("Hej, velkommen til Mastermind!");
        ////////////////////
        // i tilfælde af vi beholder ideen om at vi kan ændre på længden, skal vi have et tjek på at det faktisk er et tal der bliver sat ind.
        // og det sikre os det holder sig inden for et bestemt interval.
        int length = ui.getIntInput("how long do you want the color sequence to be?");
        String test = ui.getStringInput("Test string input");
        ui.displayMsg(test);
        game.gameStart(length);

    }


}
