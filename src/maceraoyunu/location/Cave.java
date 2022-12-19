package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.monster.Zombie;

public class Cave extends BattleLocation{

    public Cave(Player p1) {
        super(p1, "Cave", new Zombie(), "food",3);
    }
}
