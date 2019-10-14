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
            System.out.println("Pick your characters race. >>>"
            		+"\nDwarf +2 Constitution, +2, Wisdom, -2 Charisma."
                    + "\nElf +2 Dexterity, +2 Intelligence, -2 Constitution"
                    + "\nGnome +2 Constitution, +2 Charisma, -2 Strength"
                    + "\nHalf-Elf +2 Any Stat"
                    + "\nHalfling +2 Dexterity, +2 Charisma, -2 Strength"
                    + "\nHalf-Orc +2 Any Stat"
                    + "\nHuman +2 Any Stat");
            playerRace = input.next();
            
            if(playerRace.equalsIgnoreCase("dwarf")) {
            	playerRace = "Dwarf";
            }
            else if(playerRace.equalsIgnoreCase("elf")) {
            	playerRace = "Elf";
            }
            else if(playerRace.equalsIgnoreCase("Gnome")) {
            	playerRace = "Gnome";
            }
            else if(playerRace.equalsIgnoreCase("half-elf")) {
            	playerRace = "Half-Elf";
            }
            else if(playerRace.equalsIgnoreCase("halfling")) {
            	playerRace = "Halfling";
            }
            else if(playerRace.equalsIgnoreCase("half-orc")) {
            	playerRace = "Half-Orc";
            }
            else if(playerRace.equalsIgnoreCase("human")) {
            	playerRace = "Human";
            }
            else
            {
            	playerRace = "empty";
            	System.out.println("Your entry was invalid");
            }

        }while(playerRace == "empty");

    }

    public static void pickClass(){

    }

    public static void PickStats(){

    }

}
