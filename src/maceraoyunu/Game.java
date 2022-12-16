package maceraoyunu;

import maceraoyunu.location.*;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);

    public void start() {
        Player p1 = Player.createPlayer();
        p1.setActiveLocation(new SafeHouse(p1));
        System.out.println(p1);
        while (true) {
            bringLocation(p1);
            if(!p1.getActiveLocation().onLocation()){
                System.out.println(" Game over !");
                break;
            }
        }


    }

    public void bringLocation(Player player) {
        Location[] location = {new SafeHouse(player), new ToolStore(player), new Cave(player), new Forest(player), new River(player)};
        int k = 0;
        System.out.println(" ############### Locations #################");
        for (Location l : location) {
            k++;
            System.out.println(k + "-" + l.getName());
        }
        System.out.print("Select your location:");
        int selectLocation = sc.nextInt();

        switch (selectLocation) {
            default:
                player.setActiveLocation(location[0]);
                break;
            case 2:
                player.setActiveLocation(location[1]);
                break;
            case 3:
                player.setActiveLocation(location[2]);
                break;
            case 4:
                player.setActiveLocation(location[3]);
                break;
            case 5:
                player.setActiveLocation(location[4]);
                break;
        }
        System.out.println( player.getActiveLocation().getName().toString().substring(player.getActiveLocation().getName().toString().lastIndexOf('.')+1) );

    }


}
