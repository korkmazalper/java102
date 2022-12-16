package maceraoyunu.location;

import maceraoyunu.Player;

import java.util.Scanner;

public abstract class Location {
    protected static Scanner sc= new Scanner(System.in);
    Player p1;
    String name;
    boolean onLocation;
    public Location(Player p1, String name) {
        this.p1 = p1;
        this.name = name;
    }
    public boolean onLocation() {
        System.out.println("Your are in " + this.name + " now!");
        return true;
    }

    public Player getP1() {
        return p1;
    }

    public void setP1(Player p1) {
        this.p1 = p1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
