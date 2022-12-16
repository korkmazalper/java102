package maceraoyunu.location;

import maceraoyunu.Player;

public abstract class BattleLocation extends Location {

    public BattleLocation(Player p1, String name) {
        super(p1, name);
    }
    @Override
    public boolean onLocation() {
        System.out.println("Your are in " + this.name + " now!");
        System.out.println("You must fight to survive !");
        return true;
    }
}
