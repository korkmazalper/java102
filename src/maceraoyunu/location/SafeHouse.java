package maceraoyunu.location;

import maceraoyunu.Player;

public class SafeHouse  extends SafeLocation{
    public SafeHouse(Player p1) {
        super(p1, "Safe House");
    }

    @Override
    public boolean onLocation() {
        super.onLocation();
        System.out.println("Your health is refilled.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
