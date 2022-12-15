package maceraoyunu;

import maceraoyunu.characters.Okcu;
import maceraoyunu.characters.Samurai;
import maceraoyunu.characters.Sovalye;

import java.util.Scanner;

public class Game {
    private Scanner sc= new Scanner(System.in);
    Player player1=createPlayer();

    public void start(){

    }

    private Player createPlayer() {

        System.out.print("Input your name:");
        String nameOfPlayer=sc.next();
        System.out.print("Select your Character (1-Samurai-2-Archer-3-Paladin):");
        int x=sc.nextInt();
        switch(x){
            case 1:
                player1= new Player(nameOfPlayer,new Samurai(50,40,120));
                break;
            case 2:
                player1= new Player(nameOfPlayer,new Okcu(50,40,120));
                break;
            case 3:
                player1= new Player(nameOfPlayer,new Sovalye(50,40,120));
                break;
            default:
                player1=null;
                break;
        }


        System.out.println(nameOfPlayer+ " Welcome to the Adventure Game !");
        System.out.println("Your Character Details:");
        System.out.println( player1.character.toString());
        return player1;
    }

}
