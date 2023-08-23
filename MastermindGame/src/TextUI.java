import java.util.Scanner;

public class TextUI {

    private Scanner scan = new Scanner(System.in);

    public void displayMsg(String msg){
        System.out.println(msg);
    }


    public int getIntInput(String msg){
        displayMsg(msg);
        boolean validInput = false;
        int out = 0;
        while(!validInput){
            try{
                out = scan.nextInt();
                scan.nextLine();
                validInput = true;
            }catch(Exception e){
                displayMsg("Invalid input! Try again.");
                scan.next();
            }
        }
        return out;
    }

    public String getStringInput(String msg) {
        displayMsg(msg);
        boolean validInput = false;
        String out = "";
        while(!validInput){
            try{
                out = scan.nextLine().toUpperCase();
                if(!out.isBlank() || !out.isEmpty()){
                    if(out.equals("RED") || out.equals("BLUE") || out.equals("YELLOW") || out.equals("GREEN") || out.equals("BLACK")){
                        validInput = true;
                    }
                    displayMsg("Invalid input! Try again!");
                }
            }catch(Exception e){
                displayMsg("Invalid input! Try again!");
            }
        }
        return out;
    }

}
