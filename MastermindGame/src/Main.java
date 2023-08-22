import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Game game = new Game();
        // Tænker det her skal over i TextUI på en eller anden måde
        // hvis vi vil have at folk kan ændre på hvor mange farver de vil gætte
        Scanner scan = new Scanner(System.in);
        System.out.println("Hej, velkommen til Mastermind!");
        System.out.println("how long do you want the color sequence to be?");
        ////////////////////
        int length = scan.nextInt();
        game.gameStart(length);

    }


}
