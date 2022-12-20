package maceraoyunu;

import maceraoyunu.gametools.Tools;
import maceraoyunu.location.*;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    public static int numberOfDangerousRegions;
    public void start() {
        Player p1 = Player.createPlayer();
        p1.setActiveLocation(new SafeHouse(p1));
        System.out.println(p1);
        while (true) {
            bringLocation(p1);
            if(p1.getActiveLocation()==null || (p1.getActiveLocation()!=null && !p1.getActiveLocation().onLocation())){
                System.out.println(" Game over !");
                break;
            }

        }


    }

    public void bringLocation(Player player) {
        Location[] location = {new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player), new River(player), new Mine(player)};
        int k = 0;
        System.out.println(" ############### Locations #################");
        System.out.println(k + "- Quit"  );
        this.setNumberOfDangerousRegions(0);
        for (Location l : location) {
            k++;
            if(l.getAward()!=""){
                System.out.println(k + "-" + l.getName() + " dangerous region. Award: " + l.getAward() + " Conquered:"+ l.isConquered());
                increaseNumberOfDangerousRegions(1);
            } else{
                System.out.println(k + "-" + l.getName());
            }
        }
            System.out.print("Select your location:");
            String selectLocation = sc.nextLine();
        switch (selectLocation) {
            default:
                player.setActiveLocation(location[0]);
                break;
            case "2":
                player.setActiveLocation(location[1]);
                break;
            case "3":
                player.setActiveLocation(location[2]);
                break;
            case "4":
                player.setActiveLocation(location[3]);
                break;
            case "5":
                player.setActiveLocation(location[4]);
                break;
            case "6":
                player.setActiveLocation(location[5]);
                break;
            case "0":
                player.setActiveLocation(null);
                break;
        }

    }

    public int getNumberOfDangerousRegions() {
        return numberOfDangerousRegions;
    }
    public void setNumberOfDangerousRegions(int i){
        this.numberOfDangerousRegions=i;
    }
    public void increaseNumberOfDangerousRegions(int numberOfDangerousRegions) {
        this.numberOfDangerousRegions += numberOfDangerousRegions;
    }
}
