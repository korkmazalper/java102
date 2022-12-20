package maceraoyunu.location;

import maceraoyunu.Player;
import maceraoyunu.monster.Monster;
import maceraoyunu.monster.Snake;
import maceraoyunu.monster.Vampire;

public class Mine extends BattleLocation{

    public Mine(Player p1) {
        super(p1, "Mine", new Snake(), "diamond",5);
    }
}
