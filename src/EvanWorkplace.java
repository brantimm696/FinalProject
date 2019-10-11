import java.util.Scanner;

public class EvanWorkplace {

    public static void main(String[] args){

        pickRace();
    }

    public static void pickRace(){

        String playerRace = "empty";

        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("Pick your characters race. >>>" +
                    "");
            playerRace = input.next();

        }while(playerRace == "empty");

    }

    public static void pickClass(){

    }

    public static void PickStats(){

    }

}
