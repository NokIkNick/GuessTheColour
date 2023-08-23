import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Game game = new Game();
        // Tænker det her skal over i TextUI.
        // hvis vi vil have at folk kan ændre på hvor mange farver de vil gætte
        Scanner scan = new Scanner(System.in);
        System.out.println("Hej, velkommen til Mastermind!");
        System.out.println("how long do you want the color sequence to be?");
        ////////////////////
        // i tilfælde af vi beholder ideen om at vi kan ændre på længden, skal vi have et tjek på at det faktisk er et tal der bliver sat ind.
        // og det sikre os det holder sig inden for et bestemt interval.
        int length = scan.nextInt();
        //scan.next();

        game.gameStart(length);

    }


}
