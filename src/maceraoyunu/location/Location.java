package maceraoyunu.location;

import maceraoyunu.Player;
import java.util.Scanner;

public abstract class Location {
    protected static Scanner sc= new Scanner(System.in);
    Player player;
    String name;
    protected String award;
    boolean onLocation;
    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }
    public boolean onLocation() {
        System.out.println("Your are in " + this.name + " now!");
        return true;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
