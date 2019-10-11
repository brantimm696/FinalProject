import java.util.Scanner;

public class EvanWorkplace {

    public static void main(String[] args){

        pickRace();
    }

    public static void pickRace(){

        String playerRace;

        Scanner input = new Scanner(System.in);

        System.out.println("Pick your characters race. >>>");
        playerRace = input.toString();
        System.out.println("your race is " + playerRace);
    }

    public static void pickClass(){

    }

    public static void PickStats(){

    }

}
