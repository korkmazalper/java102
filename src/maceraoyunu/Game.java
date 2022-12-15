package maceraoyunu;

import maceraoyunu.characters.Archer;
import maceraoyunu.characters.GameCharacter;
import maceraoyunu.characters.Samurai;
import maceraoyunu.characters.Paladin;

import java.util.Scanner;

public class Game {
    private Scanner sc= new Scanner(System.in);
    Player player1=createPlayer();

    public void start(){

    }

    private Player createPlayer() {
        GameCharacter[] gc={new Samurai(5,21,15),new Archer(7,18,20),new Paladin(8,24,5)};
        System.out.println("------------------------------------------------");
        for (GameCharacter gamecharacter: gc) {
            System.out.println(gamecharacter.toString());
        }
        System.out.println("------------------------------------------------");
        System.out.print("Input your name:");
        String nameOfPlayer=sc.next();
        System.out.print("Select your Character (1-Samurai-2-Archer-3-Paladin):");
        int x=sc.nextInt();
        switch(x){
            case 1:
                player1= new Player(nameOfPlayer,gc[0]);
                break;
            case 2:
                player1= new Player(nameOfPlayer,gc[1]);
                break;
            default:
                player1=new Player(nameOfPlayer,gc[2]);
                break;
        }
        System.out.println(nameOfPlayer+ " Welcome to the Adventure Game !");
        System.out.println("Your Character is a "+ player1.gameCharacter.getCharacterTyp() +"\nDetails of your character:");
        System.out.println( player1.gameCharacter.toString());
        return player1;
    }

}
