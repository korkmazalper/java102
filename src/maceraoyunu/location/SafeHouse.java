package maceraoyunu.location;

import maceraoyunu.Game;
import maceraoyunu.Player;

public class SafeHouse  extends SafeLocation{
    public SafeHouse(Player p1) {
        super(p1, "Safe House");
        this.setConquered(true);
    }

    @Override
    public boolean onLocation() {
        super.onLocation();
        System.out.println("Your health is refilled.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println(this.getPlayer().toString());
        if(allRegionsConquered())
        {
            System.out.println("--------------------->Congrats! You won the game !<-----------------------");
        } else{
            System.out.println("You did not win the game yet !");
        }
        return true;
    }

    private boolean allRegionsConquered() {
       return Game.numberOfDangerousRegions==this.getPlayer().getConqueredRegions().size();
    }
}
